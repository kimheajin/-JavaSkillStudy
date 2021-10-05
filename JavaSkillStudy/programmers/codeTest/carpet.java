package codeTest;

import java.util.ArrayList;

public class carpet {

	public static void main(String[] args) {
		
		System.out.println(solution(50, 22));
//		System.out.println(solution(10, 2));
//		System.out.println(solution(8, 1));
//		System.out.println(solution(24, 24));
	}
	public static int[] solution(int brown, int yellow) {
        
		ArrayList<Integer> submultiple = new ArrayList<Integer>();
		ArrayList<Integer> save = new ArrayList<Integer>();
		
		int cal = brown + yellow;
		
		// 약수를 얻기위한 for문
		for(int i=1; i<=cal; i++) {
			if(cal%i==0 && (i*i)==cal) {
				submultiple.add(cal/i);
				submultiple.add(cal/i);
			}else {
				if(cal%i==0) {
					submultiple.add(cal/i);
				}
			}
		}
		
		// yello가 칠해진 크기를 구하기 위한 변수.
		int yelloBox = 0;
		for(int j=1; j<=submultiple.size()/2; j++) {
			// 안의 노란색 가로는, 가로-2 * 세로-2의 결과를 yello변수로 주어진 값과 비교하면 된다. 
			yelloBox = (submultiple.get(j-1)-2) * (submultiple.get(submultiple.size()-j)-2);
			if(yelloBox==yellow) {
				save.add(submultiple.get(j-1));
				save.add(submultiple.get(submultiple.size()-j));
				break;
			}
			
		}
		
		int[] answer = save.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}
