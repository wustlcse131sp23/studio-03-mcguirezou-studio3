package studio3;
import java.util.Scanner;


public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
		
		System.out.println("Please Enter positive integer to find prime numbers up to:  ");
        int n = in.nextInt();

        boolean[] primeArray = new boolean[n];
        for (int i2 = 2; i2 < Math.sqrt((double)n); i2++) {
        	if (primeArray[i2] == false){
        		for (int k = i2*i2; k<n; k+= i2) {
        			primeArray[k] = true;
        		}
        	}
        }
        for (int i = 2; i<n; i++) {
            if(primeArray[i]!=true)
                System.out.println(i);
        }

        }
        
	}


