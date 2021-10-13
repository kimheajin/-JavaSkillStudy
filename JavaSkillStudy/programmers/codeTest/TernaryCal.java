package codeTest;

public class TernaryCal {

	public static void main(String[] args) {
		System.out.print(solution(125));
	}
	public static int solution(int n) {
        int answer = n;
        StringBuilder st = new StringBuilder(); 
        int i;
        
        for(i=0; answer>=1; i++) {
        	st.append(answer%3);
        	answer = answer/3;
        }
        
    	st.reverse();
    	int save;
    	for(i=0; i<st.length(); i++) {
    		save = 1;
    		for(int j=0; j<i; j++) {
    			save *= 3;
    		}
    		answer += (save * Integer.parseInt(st.substring(i, (i)+1)));
    	}
    	
        return answer;
    }

}
