import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class TestCompteBancaire {
	private int solde;
	private int credit;
	private int debit;
	private int virement;
	
	@Before
	public void initialisation() {
		solde = 1200;
		credit = 1;
		debit = 200;
		virement = 220;
	}
	
	@Test 
	public void testCompteBancaire() {
		CompteBancaire compte = new CompteBancaire(solde);
		assertTrue(compte.ConsultationSolde() > 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCompteBancaireNegatif() {
		CompteBancaire compte = new CompteBancaire(-1);
		assertTrue(compte.ConsultationSolde() > 0);
	}
	
	@Test
	public void testConsultationSolde() {
		assertTrue(solde > 0);
		CompteBancaire compte = new CompteBancaire(solde);
		assertEquals(1200, compte.ConsultationSolde());
	}
	
	@Test
	public void testAjoutCredit() {
		assertTrue(credit > 0);
	}
	
	@Test
	public void testDebit() {
		assertTrue(debit > 0);
		CompteBancaire compte = new CompteBancaire(solde);
		assertTrue(compte.ConsultationSolde() > debit);
	}
	
	@Test
	public void testVirement() {
		assertTrue(virement > 0);
		CompteBancaire compte = new CompteBancaire(solde);
		assertTrue(compte.ConsultationSolde() > virement);
	}
}
