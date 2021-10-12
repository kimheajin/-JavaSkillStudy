package codeTest;

import java.util.ArrayList;
import java.util.Collections;

public class maxNumber {

	public static void main(String[] args) {
//		System.out.println(solution("1924", 2));
//		System.out.println(solution("1231234", 3));
		System.out.println(solution("4177252841", 4));
		
	}
	public static String solution(String number, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        /* 최고의 수를 만드는 숫자를 뽑기 위한 규칙
         * 1. 앞, 뒤를 비교해 작은 수를 리스트로부터 삭제한다. */
        
        for(int i=0; i<number.length(); i++) {
        	arr.add(Integer.parseInt(number.substring(i, i + 1)));
        }
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        for(int j=0; j<k; j++) {
        	String tmp1 = "";
        	String tmp2 = "";
        	for(int m=0; m<arr.size(); m++) {
        		// Stringbuffer에 number값 넣기
        		sb1.append(number);
        		sb2.append(number);
        		
        		// sb1 한글자 지우기
        		sb1.deleteCharAt(m);
        		// 비교를 위해 tmp1에 넣음
        		tmp1 = sb1.toString();
        		// sb2 한글자 지우기
        		sb2.deleteCharAt(m+1);
        		// 비교를 위해 tmp2에 넣음
        		tmp2 = sb2.toString();

        		// tmp1이 큰 경우 0보다 작으며, tmp2가 큰 경우 0보다 큼.
        		if(tmp1.compareTo(tmp2)>0) {
        			// tmp1의 값을 number에 저장한 후, sb1, sb2를 초기화시키고 break; 
        			number = tmp1;
        			sb1.delete(0, sb1.length());
        			sb2.delete(0, sb2.length());
        			break;
        		}else {
        			// 그 외의 경우 sb1, sb2을 초기화 
        			sb1.delete(0, sb1.length());
        			sb2.delete(0, sb2.length());
        		}
        	}
        }

        String answer = number;

        return answer;
    }

}
