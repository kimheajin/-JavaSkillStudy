package codeTest;

public class PandYCount {

	public static void main(String[] args) {
		/* 문자열 내 p와 y의 개수 */
		System.out.println(solution("pPoooyY"));
	}
	public static boolean solution(String s) {
		int count = 0;
        String[] check= s.toUpperCase().split("");
        
        for(int i=0; i<s.length(); i++) {
        	// P일 경우 true : false
        	count = check[i].compareTo("P")==0?++count:count;
        	count = check[i].compareTo("Y")==0?--count:count;
        	
        }
        // count가 0보다 작을경우, 음수일 경우, P와Y의 수가 다를 경우, false
        boolean answer = count == 0 ? true : false;
        
        return answer;
    }

}
