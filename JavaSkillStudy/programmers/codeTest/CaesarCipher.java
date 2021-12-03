package codeTest;

import java.util.regex.Pattern;

public class CaesarCipher {

	public static void main(String[] args) {
		/* 시저 암호 */
		solution("a B z", 4);
	}
	public static String solution(String s, int n) {
		StringBuffer answer = new StringBuffer();
		// 쉬운 변환을 위해 배열로 변경. 또한, 아스키 코드를 활용하기 위해 char로 받음
		char[] asc = s.toCharArray();
		
		int code = 0; 
		for(int i=0; i<s.length(); i++) {
			// 동등한 비교를 위해 대문자로 변경 후 up에 저장.
			char up = Character.toUpperCase(asc[i]);
			// 현재 값에 n을 더하여 유니코드를 구함. (알파벳일 경우에만 n을 더해줌.)
			if(Pattern.matches("^[a-zA-Z]*$", String.valueOf(up))) {
				code = up + n;
				// 만약 n을 더한 값이 90보다 클 경우(대문자가 아닐 경우) 
				if(code>90) {
					// code에 90을 뺀 값에 A부터 시작한다는 의미로 A를 더한다.
					code = (code - 91) + (int)'A';
				}
				// 원래 값이 대문자가 아닌가?
				if(Character.compare((char)up, asc[i])!=0) {
					// 소문자로 변경 후 code를 재설정.
					code = (int)Character.toLowerCase(code);
				}
			}else {
				code = up;
			}
			answer.append((char)(code));
			
		}
        
        return answer.toString();
    }
}
