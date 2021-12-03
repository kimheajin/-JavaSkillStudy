package codeTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescOrder {

	
	public static void main(String[] args) {
		/* 정수 내림차순으로 배치하기 */
		long a = 118372;
		System.out.println(solution(a));
	}
	
	public static long solution(long n) {
		List<String> a = Arrays.asList(Long.toString(n).split(""));
		Collections.sort(a);
		Collections.reverse(a);
		String c = "";
		
		for(String i : a) {
			c += i;
		}
		
		long answer = Long.parseLong(c);
        return answer;
    }
}
