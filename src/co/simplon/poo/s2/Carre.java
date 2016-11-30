package co.simplon.poo.s2;


public class Carre extends Quadrilatere {
			
		/*quadrilatere.coteA = coteA;
		quadrilatere.coteB = coteB;
		quadrilatere.coteC = coteC;
		quadrilatere.coteD = coteD;	*/
				
	

	/**
	 * @param nBCote
	 */
	
	
	public Carre(int nBCote) {
		super(nBCote);
		
	}

public long calculerperimetrecarre(int coteA,int coteB,int coteC,int coteD) {
	
	return (coteA+coteB+coteC+coteD);
	
}

}

	
	


