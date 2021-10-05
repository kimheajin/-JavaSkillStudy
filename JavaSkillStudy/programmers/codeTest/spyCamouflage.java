package codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class spyCamouflage {

	public static void main(String[] args) {
		String[][] str = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
//		String[][] str = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};
		System.out.println(solution(str));
	}
	public static int solution(String[][] clothes) {
        int answer = 1;
        
        // 숫자만 받을 때의 Map
        Map<String, Integer> spyClothes = new HashMap<>();
        
        // 숫자만 받아올 때의 for문
        for(int i=0; i<clothes.length; i++) {
        	spyClothes.put(clothes[i][1], spyClothes.getOrDefault(clothes[i][1], 0)+1);
        }
        
        for(String clothe : spyClothes.keySet()) {
        	answer = answer * (spyClothes.get(clothe) + 1 );
        }
        // 아예 안입은 경우는 존재하지 않으므로 해당 경우를 -1해준다.
        answer--;
        
        return answer;
    }

}
