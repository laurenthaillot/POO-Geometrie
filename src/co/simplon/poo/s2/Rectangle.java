package co.simplon.poo.s2;


public class Rectangle extends Quadrilatere {
			
	/**
	 * @param nBCote
	 */
		
	public Rectangle(int nBCote) {
		super(nBCote);
		
	}

	public long calculerperimetreRectangle(int coteA,int coteB,int coteC,int coteD) {
		
	return (coteA+coteB+coteC+coteD);
	
}

}
