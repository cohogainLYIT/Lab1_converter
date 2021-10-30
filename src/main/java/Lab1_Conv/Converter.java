/**
 * 
 */
package Lab1_Conv;

/**
 * @author ciara
 *
 */
public class Converter {

	/**
	 * @param args
	 */
	
	//Celcius to Fahrenheit conversion
	public static int celc_to_fahr(int celc) {
		return (celc * 9/5) + 32;
	}
	
	//Fahrenheit to Celcius conversion
	public static int fahr_to_celc(int fahr) {
		return (fahr - 32) * 5/9;
	}
	
	//miles to kilometres conversion
	public static int miles_to_kms(int miles) {
		return (miles/5)*8;
	}
	
	//kilometres to miles conversion
	public static int kms_to_miles(int kms) {
		return (kms/8)*5;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Converter!!");

	}

}
