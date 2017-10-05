
public class CompteBancaire {
	
	private int solde;
	
	public CompteBancaire(int solde) {
		if(solde >= 0)
			this.solde = solde;
	}
	
	public int ConsultationSolde() {
		return this.solde;
	}
	
	public void AjoutCredit(int somme) {
		if(somme >= 0)
			this.solde += somme;
	}
	
	public void Debit(int somme) {
		if(somme >= 0 && somme <= this.solde)
			this.solde -= somme;
	}
	
	public void Virement(CompteBancaire c, int somme) {
		if(somme >= 0 && this.solde >= somme) {
			c.solde += somme;
			this.solde -= somme;
		}
	}
	
	public static void main(String[] args) {
		CompteBancaire c = new CompteBancaire(44);
		System.out.println(c.ConsultationSolde());
	}

}
