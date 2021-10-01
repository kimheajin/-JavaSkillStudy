package codeTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockTest {

	public static void main(String[] args) {
		
		int[] one = {1,3,2,4,2, 1, 4, 5, 2, 3, 1, 1, 1};
		
		System.out.println(solution(one));
	}
	public static int[] solution(int[] answers) {
        int[] answer = {};
        
        Map<String, Integer> mathGiveup = new HashMap<>();
        int[] one = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        mathGiveup.put("one", 0);
        mathGiveup.put("two", 0);
        mathGiveup.put("three", 0);
        
        int count = 0;
        int vlu = 0;
        for(int ans : answers) {
        	if(ans == one[count]) {
        		vlu = mathGiveup.get("one");
        		mathGiveup.put("one", ++vlu);
        	}if(ans == two[count]) {
        		vlu = mathGiveup.get("two");
        		mathGiveup.put("two", ++vlu);
        	}if(ans == three[count]) {
        		vlu = mathGiveup.get("three");
        		mathGiveup.put("three", ++vlu);
        	}
        	count = (count == 10) ? 0 : ++count;
        	if(count == answers.length) {
//        		System.out.println(Collections.max(mathGiveup.keySet()));
//        		for(String key : mathGiveup.keySet()) {
//        			System.out.println(Math.max(mathGiveup.get(key), mathGiveup.get(key)));
//        		}
        		System.out.println(mathGiveup);
        	}
        }
        return answer;
    }
}
