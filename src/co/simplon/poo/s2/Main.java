package co.simplon.poo.s2;

public class Main extends Quadrilatere {

	
	/**
	 * @param nBCote
	 */
	public Main(int nBCote) {
		super(nBCote);
		
	}

	public static void main(String[] args){
	long pcarre;
	long ptriangle;
	long prectangle;
	double pcercle;
	double acercle;
	long Vcube;
	
	
	
	
	Carre lecarre = new Carre(4);
	pcarre = lecarre.calculerperimetrecarre(10,10,10,10);
	
	Triangles letriangle = new Triangles();
	ptriangle = letriangle.calculerperimetretriangle(15, 15, 15);
	
	Rectangle lerectangle = new Rectangle(4);
	prectangle = lerectangle.calculerperimetreRectangle(20, 20, 20, 20);
	
	Cercles lecercle = new Cercles();
	pcercle = lecercle.calculerperimetrecercle(10);
	
	Cercles airecercle = new Cercles();
	acercle = airecercle.calculerairecercle(10);
	
	VolumeCube volcube = new VolumeCube(10);
	Vcube = volcube.volumeDuCube(10);
			
	
	System.out.println("Périmetre du carré: " + pcarre);
	System.out.println("Périmetre du triangle : " + ptriangle);
	System.out.println("Périmetre du rectangle : "+ prectangle);
	System.out.println("Périmetre du cercle : "+ pcercle);
	System.out.println("");
	System.out.println("Aire du Cercle : "+ acercle);
	System.out.println("");
	System.out.println("Volume du cube de "+ coteA +" de coté : "+Vcube );
	
	
	}

	
	
	
}