package co.simplon.poo.s2;


public class Cercles {
	
	protected static long rayon;	

	public Cercles() {
	super()	;
	}
	
	public double calculerperimetrecercle(int rayon){
	return (rayon*2*3.14);
	}
	
	public double calculerairecercle(int rayon){
		return (rayon*rayon*3.14);
	}
	
}