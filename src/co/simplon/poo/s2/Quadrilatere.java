package co.simplon.poo.s2;

public  class Quadrilatere {

		protected int NBCote;
		
		protected static long coteA;
		protected static long coteB;
		protected static long coteC;
		protected static long coteD;
		
		protected static long diametre;
		
		
		/**
		 * @param nBCote
		 */
		public Quadrilatere(int nBCote) {
			
			this.NBCote = nBCote;
		}
		
		
		
		protected int getNBCote() {
			return NBCote;
		}
		protected void setNBCote(int nBCote) {
			NBCote = nBCote;
		}
		protected static long getCoteA() {
			return coteA;
		}
		protected static void setCoteA(long coteA) {
			Quadrilatere.coteA = coteA;
		}
		protected static long getCoteB() {
			return coteB;
		}
		protected static void setCoteB(long coteB) {
			Quadrilatere.coteB = coteB;
		}
		protected static long getCoteC() {
			return coteC;
		}
		protected static void setCoteC(long coteC) {
			Quadrilatere.coteC = coteC;
		}
		protected static long getCoteD() {
			return coteD;
		}
		protected static void setCoteD(long coteD) {
			Quadrilatere.coteD = coteD;
		}
		
		
}
