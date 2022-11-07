package metier.test;

import metier.CreditMetierImp;

public class TestCreditMetier {
	//test unitaire manuel

	public static void main(String[] args) {

		CreditMetierImp credit = new CreditMetierImp();
		double capitale = 200000;
		int duree = 240;//mois
		double taux = 4.5;
		
		double result = credit.calculMensualiteCredit(capitale, taux, duree);
		System.out.println(result);
	}

}
