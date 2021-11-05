package codeTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseNum {

	public static void main(String[] args) {
		System.out.println(solution(12345));
		
	}
	public static int[] solution(long n) {
        
		String cg = ""+n;
		List<String> a = Arrays.asList(cg.split(""));
		Collections.reverse(a);
		
		int[] answer = a.stream().mapToInt(Integer::parseInt).toArray();
		
//		for문을 이용한 풀이
//		String cg = ""+n;
//		String[] a = cg.split(""); 
		
//		int[] answer = a.stream().mapToInt(Integer::parseInt).toArray();
//		.toArray(String[]::new) // StringList를 배열로 바꾸고 싶을때 사용.
		
//		int[] answer = new int[cg.length()];
//		
//		for(int i=0; i<cg.length(); i++) {
//			answer[i] = Integer.parseInt(a[Math.abs(i-(cg.length()-1))]);
//		}
        
        return answer;
    }

}
