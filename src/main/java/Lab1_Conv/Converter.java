/**
 * 
 */
package Lab1_Conv;
import java.util.*;

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
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Select what option you want to use:");
			System.out.println("A:  Fahrenheit to Celcius");
			System.out.println("B:  Celcius to Fahrenheit");
			System.out.println("C:  Miles to Kilometers");
			System.out.println("D:  Kilometers to Miles\n");
			System.out.println("E:  Exit");
			String option_str = sc.next();
			char option = option_str.charAt(0);
			try {
				if(option == 'A') {
					System.out.println("\nEnter Fahrenheit value:");
					System.out.println("\nCelsius = " + fahr_to_celc(sc.nextInt()));
				}else if(option == 'B') {
					System.out.println("\nEnter Celcius value:");
					System.out.println("\nFahrenheit = " + celc_to_fahr(sc.nextInt()));
				}else if(option == 'C') {
					System.out.println("\nEnter Miles value:");
					System.out.println("\nKilometers = " + miles_to_kms(sc.nextInt()));
				}else if(option == 'D') {
					System.out.println("\nEnter Kilometers value:");
					System.out.println("\nMiles = " + kms_to_miles(sc.nextInt()));
				}
				else if(option == 'E') {
					break;
				}
			}catch (Exception e) {
					System.out.println("\nThis is not an option, bye!");
					System.exit(1);
			}
		}

	}

}
