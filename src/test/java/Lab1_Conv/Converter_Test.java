/**
 * 
 */
package Lab1_Conv;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author ciaran
 *
 */
public class Converter_Test {

	/**
	 * Test method for {@link Lab1_Conv.Converter#miles_to_kms(int)}.
	 */
	@Test
	public void testMiles_to_kms() {
		assertEquals(16,Converter.miles_to_kms(10));
	}

	/**
	 * Test method for {@link Lab1_Conv.Converter#kms_to_miles(int)}.
	 */
	@Test
	public void testKms_to_miles() {
		assertEquals(20, Converter.kms_to_miles(32));
	}

	/**
	 * Test method for {@link Lab1_Conv.Converter#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		equals("Converter!!");
	}

}
