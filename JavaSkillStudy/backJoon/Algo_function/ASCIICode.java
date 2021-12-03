package Algo_function;

import java.util.HashMap;
import java.util.Scanner;

public class ASCIICode {

	public static void main(String[] args) {
		
		/* ASCII Code AG */
//		Scanner sc = new Scanner(System.in);
		
//		char c = sc.next().charAt(0);
		
//		System.out.println((int)c);
		
		/* Number's Sum */		
//		Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String pnumber = sc.next();
//        int sum = 0;
//        
//        for(int i=0; i<n; i++){
//        	sum += Integer.parseInt(pnumber.substring(i, i+1));
//        }
//        System.out.println(sum);
		
		/* A~Z change Numbers */
		
		HashMap<String, Integer> save = new HashMap();
		int ch = (int)'a';
		
		for(int i=0; i<26; i++) {
			
			// a + i = 알피벳
			ch += i;
		}
		
	}

}
