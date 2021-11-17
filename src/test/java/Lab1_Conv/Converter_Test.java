/**
 * 
 */
package Lab1_Conv;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.junit.Test;


/**
 * @author ciaran
 *
 */
public class Converter_Test extends Converter {
	
	/**
	 * Test method for {@link Lab1_Conv.Converter#miles_to_kms(int)}.
	 */
	@Test
	public void test_fahr_to_celc() {
		assertEquals(32135,Converter.fahr_to_celc(57875));
	}
	
	/**
	 * Test method for {@link Lab1_Conv.Converter#miles_to_kms(int)}.
	 */
	@Test
	public void test_celc_to_fahr() {
		assertEquals(98,Converter.celc_to_fahr(37));
	}

	/**
	 * Test method for {@link Lab1_Conv.Converter#miles_to_kms(int)}.
	 */
	@Test
	public void test_miles_to_kms() {
		assertEquals(16,Converter.miles_to_kms(10));
	}

	/**
	 * Test method for {@link Lab1_Conv.Converter#kms_to_miles(int)}.
	 */
	@Test
	public void test_kms_to_miles() {
		assertEquals(20, Converter.kms_to_miles(32));
	}

	/**
	 * Test method for {@link Lab1_Conv.Converter#main(java.lang.String[])}.
	 */
	@Test
	public void test_main() {
	    
	}

}
