package codeTest;

public class plusMinus {

	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		System.out.print(solution(absolutes, signs));
	}
	public static int solution(int[] absolutes, boolean[] signs) {
		
		int answer = 0;
		for(int i=0; i<absolutes.length; i++) {
			answer += signs[i] ? absolutes[i] : -absolutes[i];
		}
        return answer;
    }

}
