package web.model;

public class CreditModel {

	private double montant;
	private double taux;
	private int duree;//nb de mois
	private double mensulatite;
	
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public double getMensulatite() {
		return mensulatite;
	}
	public void setMensulatite(double mensulatite) {
		this.mensulatite = mensulatite;
	}
	public CreditModel() {
		super();
	}
	public CreditModel(double montant, double taux, int duree) {
		super();
		this.montant = montant;
		this.taux = taux;
		this.duree = duree;
	}
	@Override
	public String toString() {
		return "CreditModel [montant=" + montant + ", taux=" + taux + ", duree=" + duree + ", mensulatite="
				+ mensulatite + "]";
	}
	
	

}
