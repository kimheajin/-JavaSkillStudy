package codeTest;

import java.util.regex.Pattern;

public class NomalString {

	public static void main(String[] args) {
		/* 문자열 다루기 기본 */
	}
	public static boolean solution(String s) {
        boolean answer = false;
        
//        if(s.length()==6 || s.length()==4) {
        	// ^[0-9]{4}|{6}$ 이렇게 하면 길이도 보는 것.
        	if(Pattern.matches("^[0-9]{4}|{6}$", s)) {
        		answer = true;
        	}
//        }
        
        return answer;
    }

}
