package codeTest;

public class CollatzGuess {

	public static void main(String[] args) {
		/* 콜라츠 추측 */
		solution(626331);
	}
	public static int solution(int num) {
        int answer = 0;
        
        long sum = num;
        while(sum>1) {
        	
        	// 만약 500번을 반복해도 1이 될 수 없다면 -1을 설정하고 종료.
        	if(answer>500) {
        		answer = -1;
        		break;
        	}
        	// 짝수인가?
        	if(sum%2==0) {
        		// 입력된 수가 짝수라면 2로 나눈다.
        		sum = sum / 2;
        		answer++;
        	}else {
        		// 입력된 수가 홀수라면 3을 곱하고 +1를 한다.
        		sum = (sum * 3) + 1;
        		answer++;
        	}
        }
        
        return answer;
    }

}
