package codeTest;

public class SeoulFindKim {

	public static void main(String[] args) {
		/* 서울에서 김서방 찾기 */
		String[] s = {"Jane", "Kim"};
		solution(s);

	}
	public static String solution(String[] seoul) {
		String answer = "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].compareTo("Kim") == 0) {
            	answer = "김서방은 "+i+"에 있다";
            }
        }
        return answer;
    }

}
