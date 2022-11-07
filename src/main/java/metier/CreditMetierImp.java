package metier;

public class CreditMetierImp implements ICreditMetier {

	//test unitaire manuel.
	@Override
	public double calculMensualiteCredit(double capital, double taux, int duree) {

		double t = taux/100;
		double a= capital*t/12;
		double b=1-Math.pow(1+t/12,-duree);
		return a/b;
	}

}
