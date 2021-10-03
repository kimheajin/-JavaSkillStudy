package codeTest;

import java.util.ArrayList;
import java.util.Collections;

public class lim_MaxNumber {

	public static void main(String[] args) {
		int[] numbers= {3, 30, 34, 5, 9};
		String a =solution(numbers);
	}
	public static String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> strNumbers = new ArrayList<>();

        for(int i=0; i<numbers.length;i++) {
        	strNumbers.add(String.valueOf(numbers[i]));
        }
        Collections.sort(strNumbers);
        Collections.reverse(strNumbers);
        System.out.println(strNumbers);
        for(int i= 0; i<strNumbers.size()-1;i++) {
        	if(strNumbers.get(i).substring(0, 1).equals(strNumbers.get(i+1).substring(0, 1))) {
        		System.out.println(strNumbers.get(i).substring(0, 1)+","+strNumbers.get(i+1).substring(0, 1));
        		if(Integer.parseInt(strNumbers.get(i))%10<Integer.parseInt(strNumbers.get(i+1))%10) {
        			System.out.println(strNumbers);
        			String tmp = strNumbers.get(i);
        			strNumbers.set(i, strNumbers.get(i+1));
        			strNumbers.set(i+1, tmp);
        			System.out.println(strNumbers);
        		}
        	}
        	answer=answer+strNumbers.get(i);       	
        }
        answer=answer+strNumbers.get(strNumbers.size()-1);
        System.out.println(answer);
        return answer;
    }
}
