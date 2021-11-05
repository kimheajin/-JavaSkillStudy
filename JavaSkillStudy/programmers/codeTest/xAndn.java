package codeTest;

public class xAndn {

	public static void main(String[] args) {
		solution(0, 0);
	}
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        int sum = 0;
        int count=0;
        while(count<n){
            sum += x;
            answer[count] = sum;
            count++;
        }
        if(answer.length==0){
        	answer = new long[1];
        	answer[0] = x;
        }
        return answer;
    }

}
