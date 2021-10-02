package codeTest;

import java.util.HashMap;
import java.util.Map;

public class spyCamouflage {

	public static void main(String[] args) {
		String[][] str = {{"yellowhat", "headgear"}, {"bluesunglasses", "headgear"}, {"green_turban", "headgear"}};
		System.out.println(solution(str));
	}
	public static int solution(String[][] clothes) {
        int answer = 0;
        
        Map<String, String> spyClothes = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++) {
        	spyClothes.put(clothes[i][1], spyClothes.getOrDefault(clothes[i][1], "")+clothes[i][0]);
        	System.out.println(clothes[i][1] +" "+ clothes[i][0]);
        }
        
        int count = 0;
        for(String clothe : spyClothes.keySet()) {
        	if(clothe.compareTo(clothes[count][1]) == 0) {
        		if(spyClothes.get(clothe).contains(clothes[count][0])) {
        			answer += 1;
        		}
        		if(spyClothes.get(clothe).contains(clothes[count][0])) {
        		}
        	}
        }
//        for(int j=0; j<clothes.length; j++) {
        	
        	// ? 종류 판별은 clothes와 spyClothes의 크기를 비교후, spyClothes이 작다면 중복되는 부위가 있다는 것.
        	// 종류를 key로 하여 맵에서 데이터를 뽑아, 해당 데이터가 종류부위의 의상이름과 일치할 시 count + 1
        	// j배열의 종류와 j+1배열의 종류가 다를 경우, 조합이 가능하므로  
        	
//        	if(spyClothes.get(clothes[j][1]).contains(clothes[j][0])) {
//        		answer += 1;
//        		if(spyClothes.get(clothes[j][1]).contains(clothes[j][0])) {
//        			
//        		}
//        	}
//        }
        
        System.out.println(spyClothes);
        
        return answer;
    }

}
