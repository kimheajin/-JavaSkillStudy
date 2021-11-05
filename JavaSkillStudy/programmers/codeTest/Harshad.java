package codeTest;

public class Harshad {

	public static void main(String[] args) {
		System.out.println(solution(18));
	}
	public static boolean solution(int x) {
		String chk = ""+x;
		int sum = 0;
		boolean answer = true;
		for(int i=0; i<chk.length(); i++) {
			sum += Integer.parseInt(chk.substring(i, i+1));
		}
		
		if (x%sum!=0) {
			return answer = false;
		}
		
        return answer;
    }

}
