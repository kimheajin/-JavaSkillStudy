package codeTest;

import java.util.ArrayList;
import java.util.Collections;

public class FindNth {

	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] com = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		
		System.out.println(solution(arr, com));
	}
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> eqArr = new ArrayList<Integer>();
        
        
        for(int i=0; i<commands.length;i++) {
        	eqArr.clear();
        	for(int j=commands[i][0]-1; j<commands[i][1]; j++) {
        		eqArr.add(array[j]);
        	}
        	Collections.sort(eqArr);
        	answer[i] = eqArr.get(commands[i][2]-1);
        }
        
        return answer;
    }

}
