package Algo_function;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 시간
		int h = sc.nextInt();
		// 분
		int m = sc.nextInt();
		// 45분 빼기 계산을 위한 변수
		int fourteenFive = 60-45;
		
		// m이 45보다 작을 경우
		if(m<45) {
			if(h==0) {
				h = 23;
			}else {
				h--;
			}
			m += fourteenFive;
		}else {
			// m의 값이 45보다 큰 경우 m에다가 45를 뺀 값을 입력하라.
			m -= 45;
		}
		
		System.out.println(h + " " + m);
	}
}




