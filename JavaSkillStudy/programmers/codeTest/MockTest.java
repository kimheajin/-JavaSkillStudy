package codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockTest {

	public static void main(String[] args) {
		
		int[] one = {1,3,2,4,2};
		
		System.out.println(solution(one));
	}
	public static int[] solution(int[] answers) {
        
		Map<Integer, Integer> mathGiveup = new HashMap<>();
		mathGiveup.put(1, 0);
		mathGiveup.put(2, 0);
		mathGiveup.put(3, 0);

		int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        List<Integer> list =  new ArrayList<Integer>();
        
        int count = 0;
        int vlu = 0;
        for(int ans : answers) {
        	if(ans == one[count%one.length]) {
        		vlu = mathGiveup.get(1);
        		mathGiveup.put(1, ++vlu);
        	}if(ans == two[count%two.length]) {
        		vlu = mathGiveup.get(2);
        		mathGiveup.put(2, ++vlu);
        	}if(ans == three[count%three.length]) {
        		vlu = mathGiveup.get(3);
        		mathGiveup.put(3, ++vlu);
        	}
    		++count;
        }
        
//        max값을 뽑아 max값을 가지고 있는 유저들만 추출하는 알고리즘 검색 후 작성한 코드
        int maxScore = Collections.max(mathGiveup.values());
        
        
        for(int mathF : mathGiveup.keySet()) {
        	if(maxScore == mathGiveup.get(mathF)) {
        		list.add(mathF);
        	}
        	System.out.println(list);
        }
//        알고리즘 검색 전 코드
//        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(mathGiveup.entrySet());
//        entryList.sort(((o1, o2) -> o2.getValue() - o1.getValue()));
        
//        for(int i=0; i<entryList.size(); i++) {
//        	System.out.println(entryList.get(i));
//        	if(entryList.get(i).getValue() > entryList.get(i+1).getValue()) {
//        		list.add(entryList.get(i).getKey());
//        		break;
//        	}if(entryList.get(i+1).getValue() == entryList.get(i+2).getValue()) {
//        		list.add(entryList.get(i+1).getKey());
//        		if(entryList.get(i+1).getValue() == entryList.get(i+2).getValue()) {
//            		list.add(entryList.get(i+2).getKey());
//            		break;
//            	}
//        		break;
//        	}
//        }
        
    	int[] answer = list.stream().mapToInt(i->i).toArray();
    	
    	Arrays.sort(answer);

        return answer;
    }
}
