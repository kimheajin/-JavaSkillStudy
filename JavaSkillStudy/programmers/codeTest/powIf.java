package codeTest;

public class powIf {

	public static void main(String[] args) {
		System.out.print(solution(121));
	}
	public static long solution(long n) {
//		sqrt(루트함수)를 이용한 풀이. 시간 단축 됨.
		int cal = (int)Math.sqrt(n);
		long answer = 0;
		
		if((long)Math.pow(cal, 2) == n) {
			answer = (long)Math.pow(cal+1, 2);
		}else {
			answer = -1;
		}
		
//        int i = 0;
//        pow(제곱 함수)를 이용한 풀이
//        while(true){
//            answer = (long)Math.pow(i, 2);
//            if(n == answer){
//            	answer = (long)Math.pow(i+1, 2);
//                break;
//            }
//            else if(n < answer){
//                answer = -1;
//                break;
//            }
//            i++;
//        }
        
        return answer;
    }

}
