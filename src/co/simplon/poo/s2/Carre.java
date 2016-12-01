package co.simplon.poo.s2;


public class Carre extends Quadrilatere {
			
	/**
	 * @param nBCote
	 */
		
	public Carre(int nBCote) {
		super(nBCote);
		
	}

public long calculerperimetrecarre(int coteA,int coteB,int coteC,int coteD) {
	Quadrilatere.coteA = coteB;
	Quadrilatere.coteB = coteC;
	Quadrilatere.coteC = coteD;
	
	return (coteA*4);
	
}

}

	
	


