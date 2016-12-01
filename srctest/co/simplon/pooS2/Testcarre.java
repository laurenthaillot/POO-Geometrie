package co.simplon.pooS2;

import static org.junit.Assert.*;

import org.junit.Test;

import co.simplon.prairie.FizzBuzz;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Testcarre {

	 @Test
	    public void la_correspondance_de_0_est_0() {
	        FizzBuzz fizzBuzz = new FizzBuzz();
	        assertEquals(
	                "La correspondance pour 0 doit Ãªtre 0.",
	                "0",
	                fizzBuzz.determinerCorrespondance(0)
	        );
	
	@Test
		public void test_le_perimetre_de_carre_10_est_40() {
			Testcarre testPCarre = new Testcarre(); 
			asserEquals (
				"Le perimetre du carre de 10 de coté est égal à 40","40",
				testPCarre
					
			);
			
	}
		


	}

}
