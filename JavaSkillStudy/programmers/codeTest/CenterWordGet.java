package codeTest;

public class CenterWordGet {

	public static void main(String[] args) {
		/* 가운데 글자 가져오기 */
		solution("qwer");
	}
	public static String solution(String s) {
		
		int n = Math.round(s.length()/2);
		String answer = "";
		// 짝수인가?
		if(s.length()%2==0) {
			answer = s.substring(n-1, n+1);
		}
		// 홀수인가?
		else{
			answer = s.substring(n, n+1);
		}
		// s의 길이 /2를 한 값이 가운데 인덱스 값.
		
        return answer;
    }

}
