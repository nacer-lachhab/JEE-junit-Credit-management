package web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CreditMetierImp;
import metier.ICreditMetier;
import web.model.CreditModel;

//@WebServlet(name = "cs",urlPatterns = {"/controleur","*.do",})
public class ServeletController extends HttpServlet{
	
	private ICreditMetier metier;
	private CreditModel creditModel;
	
	@Override
	public void init() throws ServletException {
		metier = new CreditMetierImp();
		creditModel = new CreditModel();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("creditModel", creditModel);
		req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Reading Data from Request
		double montant = Double.valueOf(request.getParameter("montant"));
		double taux = Double.parseDouble(request.getParameter("taux"));
		int duree = Integer.parseInt(request.getParameter("duree"));
		
		//Setting Data in the Request into a Model & invoking metier -Buisness Layer-
		creditModel = new CreditModel(montant, taux, duree);

		double resultatMemsualite = metier.calculMensualiteCredit(montant, taux, duree);
		creditModel.setMensulatite(resultatMemsualite);
		
		//forwarding the Model to the View -jsp-
		request.setAttribute("creditModel", creditModel);
		request.getRequestDispatcher("VueCredit.jsp").forward(request, response);

	}
}
