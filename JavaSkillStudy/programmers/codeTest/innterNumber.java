package codeTest;

public class innterNumber {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		int[] b = {-1, -2, 3, 4};
		
		solution(a, b);
	}
	public static int solution(int[] a, int[] b) {
      int answer = 0;
      
        for(int i=0; i<a.length; i++) {
           answer = answer + (a[i] * b[i]);
        }
        
        return answer;
    }
}
