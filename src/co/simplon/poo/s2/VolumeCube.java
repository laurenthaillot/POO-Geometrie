package co.simplon.poo.s2;

public class VolumeCube extends Quadrilatere {
	
	/**
	 * @param nBCote
	 */
	public VolumeCube(int nBCote) {
		super(nBCote);
	}
public long volumeDuCube (int coteA) {
	return (coteA*coteA*coteA);
}


}
