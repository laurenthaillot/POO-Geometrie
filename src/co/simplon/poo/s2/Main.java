package co.simplon.poo.s2;

public class Main {

	public static void main(String[] args){
	long pcarre;
	long ptriangle;
	
	Carre lecarre = new Carre(4);
	pcarre = lecarre.calculerperimetrecarre(10,10,10,10);
	
	Triangles letriangle = new Triangles();
	ptriangle = letriangle.calculerperimetretriangle(15, 15, 15);
	
	System.out.println("Périmetre du carré: " + pcarre);
	System.out.println("Périmetre du triangle : " + ptriangle);
	
	}

	
	
	
}