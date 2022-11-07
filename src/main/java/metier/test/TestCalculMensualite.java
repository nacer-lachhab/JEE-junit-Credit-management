package metier.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import metier.CreditMetierImp;
import metier.ICreditMetier;

public class TestCalculMensualite {
	//test unitaire avec junit
	
	private ICreditMetier metier;

	@Before
	public void setUp() throws Exception {
		metier = new CreditMetierImp();
	}

	@Test
	public void testCalculMensualiteCredit() {
		double capitale = 200000;
		int duree = 240;//mois
		double taux = 4.5;
		double resultWaited = 1265.2987;
		double resultCalculated = metier
									.calculMensualiteCredit(capitale, taux, duree);
		assertEquals(resultWaited, resultCalculated,0.0001);
	}
}
