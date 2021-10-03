package codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class spyCamouflage {

	public static void main(String[] args) {
//		String[][] str = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] str = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};
		System.out.println(solution(str));
	}
	public static int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, List<String>> spyClothes = new HashMap<>();
        List<String> cl = new ArrayList<>();
        
//        Arrays.sort(clothes, new Comparator<String[]>() {
//        	@Override
//        	public int compare(String[] t1, String[] t2) {
//        		if(t1[0].compareTo(t2[1]) < 0) {
//        			return 1;
//        		}else {
//        			return -1;
//        		}
//        	}
//        });
        
        
        Arrays.sort(clothes, Comparator.comparing(o1 -> o1[1]));
        
        for(int i=0; i<clothes.length; i++) {
        	// 계속 앞에 if문과 비교를 하기 때문에, i가 clothes의 길이 -1만큼 돌면 break;를 걸게 해놓음
        	if(i == clothes.length-1) {
        		break;
        	}
        	// 만약 clothes배열의 현재 종류 값과 다음값이 같으면 true
        	if(clothes[i][1].compareTo(clothes[i+1][1]) == 0) {
        		// i가 0보다 크면 
        		if(i>0) {
        			// 이전 값과 종류가 같은지 비교를 한 뒤 이전배열의 종류와 같지 않을 시 ArrayList를 재정의 한다. 
        			if(clothes[i-1][1].compareTo(clothes[i][1]) != 0) {
        				cl = new ArrayList<>();
        			}
        		}
        		// cl에 담겨있는 list의 값 중 clothes[i][0]이 존재한다면, 추가하지 않음. 
        		if(!cl.contains(clothes[i][0])) {
        			// 중복이 없다면 추가한다.
        			cl.add(clothes[i][0]);
        		}
        		// 바로 위의 if문이 생성된 이유. i+1, 즉, 다음 배열의 값도 cl이라는 리스트에 추가해주기 때문에 위의 if문이 필요하다.
        		cl.add(clothes[i+1][0]);
        		
        		// 위의 모든 if문을 거친 최종 값을 spyClothes에 put 해준다.
        		spyClothes.put(clothes[i][1], spyClothes.getOrDefault(clothes[i][1], cl));
        	}else {
        		if(i>0) {
        			// 만약, 이전 종류와 현재 종류가 같지 않다면, cl에 있던 내용을 삭제 한다. 
        			if(clothes[i-1][1].compareTo(clothes[i][1]) != 0 ) {
        				// cl을 재정의 하고, 현재 배열의 값을 cl에 추가한 후 그것을 바로 put해준다. (어쨌던 하나 뿐이니까.)
        				cl = new ArrayList<>();
        			}
        		}
    			cl.add(clothes[i][0]);
    			spyClothes.put(clothes[i][1], spyClothes.getOrDefault(clothes[i][1], cl));
        	}
        }
        
        for(String clothe : spyClothes.keySet()) {
        	answer = answer * (spyClothes.get(clothe).size()+1);
        }

        return answer-1;
    }

}
