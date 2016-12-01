package co.simplon.poo.s2;

public class VolumeCube extends Quadrilatere {
	
	/**
	 * @param nBCote
	 */
	public VolumeCube(int cote) {
		super(cote);
	}
public long volumeDuCube (int cote) {
	return (cote*cote*cote);
}


}
