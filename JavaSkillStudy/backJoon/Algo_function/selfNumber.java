package Algo_function;

import java.util.ArrayList;
import java.util.Collections;

public class selfNumber {

	public static final int TEN_THOUSAND = 10000;
	public static final int THOUSAND = 1000;
	public static final int HUNDRED = 100;
	public static final int TEN = 10;
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		// 합계 저장 변수
		Integer saveNum = 0;
		
		for(int i=1; i<10000; i++) {
			saveNum = i + (i%TEN_THOUSAND)/THOUSAND
					+ (i%THOUSAND)/HUNDRED
					+ (i%HUNDRED)/TEN
					+ i%TEN;
			arr.add(saveNum);
		}
		
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		
		// 중복제거
		for(Integer num : arr) {
			if(!resultList.contains(num)) {
				resultList.add(num);
			}
		}
		// 정렬
		Collections.sort(resultList);
		
		int count = 0;
		for(int i=1; i<10000; i++) {
			
			if(i > resultList.get(resultList.size()-1)) {
				break;
			}else {
				if(i == resultList.get(count)) {
					count++;
				}else {
					System.out.println(i);
				}
			}
		}
	}
}