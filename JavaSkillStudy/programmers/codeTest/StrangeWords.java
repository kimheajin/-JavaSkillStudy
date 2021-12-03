package codeTest;

import java.util.regex.Pattern;

public class StrangeWords {

	public static void main(String[] args) {
		/* 이상한 문자 만들기 */
		System.out.println(solution("sp ace"));
	}
	public static String solution(String s) {
		
        // 공백으로 나눈 값을 save에 저장.
		String[] save = s.split(" ", -1);
		// 변환된 문장을 저장할 Stringbuffer변수
        StringBuffer answer = new StringBuffer();
        
        for(int i=0; i<save.length; i++) {
        	// 공백으로 나눈 뒤 또 한번 더 나눔.
        	String[] c = save[i].split("");
        	for(int j=0; j<c.length; j++) {
        		// 알파벳인 값들만 변화주기
        		if(Pattern.matches("^[a-zA-Z]*$",c[j])) {
        			if(j%2==0) {
        				c[j] = c[j].toUpperCase();
        			}else {
        				c[j] = c[j].toLowerCase();
        			}
        		}
        	}
        	answer.append(String.join("", c));
        	if(i!=save.length-1) {
        		answer.append(" ");
        	}
        }
        return answer.toString();
    }

}
