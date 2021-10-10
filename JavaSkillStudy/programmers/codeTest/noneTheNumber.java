package codeTest;

import java.util.ArrayList;
import java.util.Arrays;

public class noneTheNumber {

	public static void main(String[] args) {
		int[] numbers = {5,8,4,0,6,7,9};
		System.out.println(solution(numbers));
	}
	public static int solution(int[] numbers) {
        
		ArrayList<Integer> eq = new ArrayList<Integer>();
		
        Arrays.sort(numbers);
        int answer = 0;
        
        for(int i=0, j=0; i<=9; i++){
        	eq.add(i);
        	if(numbers.length<=j) {
        		answer += eq.get(i);
        	}else {
        		if(numbers[j]!=eq.get(i)) {
        			answer += eq.get(i);
        		}else {
        			j++;
        		}
        	}
        }
        
        return answer;
    }

}
