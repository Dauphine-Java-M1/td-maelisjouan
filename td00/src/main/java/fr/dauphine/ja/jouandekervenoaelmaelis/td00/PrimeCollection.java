package fr.dauphine.ja.jouandekervenoaelmaelis.td00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/**
 * prime number
 *
 */
public class PrimeCollection 
{
	private ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		numbers = new ArrayList<Integer>();
	}
	
	public PrimeCollection(ArrayList<Integer> n) {
		numbers = n;
	}
	
	private void initRandom(int n, int min, int max) {
		/**
		 * Generates random integers and add them to the numbers list.
		 * @param n - number of integers randomly generated
		 * @param max - upper bound
		 * @param min - lower bound
		 */
		if(max-min > 0) {
			Random generator = new Random();
			for(int i=0;i<n;i++){
				int rdm = min + generator.nextInt(max - min + 1); // nextInt(x) gives a number between 0 and x-1 included.
				numbers.add(rdm);
			}
			System.out.println(numbers);
		}
	}
	
	protected static boolean isPrime(int p) {
		/**
		 * Test if an integer is a prime number.
		 * @return - true when p is a prime number, false otherwise.
		 * @param p - integer to test
		 */
		if (p == 1)
			return false; // the number 1 is not a prime number
		for(int i=2; i<=(int) Math.sqrt(p); i++){
			if(p%i == 0)
				return false;
		}
		return true;
	}
	
	private void printPrimes() {
		/**
		 * Prints the numbers list's prime numbers.
		 */
		for(Iterator it=numbers.iterator(); it.hasNext();) {
			int n = (int) it.next();
			if((isPrime(n)))
				System.out.println(n);
		}
		
	}
	
    public static void main( String[] args )
    {
    	PrimeCollection p = new PrimeCollection();
    	System.out.println( "La liste de nombres générés aléatoirement est la suivante :");
    	p.initRandom(100, 1, 2000);
    	System.out.println( "\nLes nombres premiers de la liste sont :");
    	p.printPrimes();
    }
}
