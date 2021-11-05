package codeTest;

import java.util.Arrays;
import java.util.List;

public class lottoMaxMin {

	public static void main(String[] args) {
//		int[] lottos = {44, 1, 0, 0, 31, 25};
//		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] lottos = {0, 0, 0, 0, 0, 0};
//		int[] win_nums = {31, 10, 45, 1, 6, 19};
//		int[] win_nums = {20, 9, 3, 45, 4, 35};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		System.out.print(solution(lottos, win_nums));
	}
	public static int[] solution(int[] lottos, int[] win_nums) {
		List<Integer> winList = Arrays.asList(Arrays.stream(win_nums).boxed().toArray(Integer[]::new));
        // 최고순위판단
		int up = 0;
		// 최저순위판단
        int down = 6;
        
        for(int i=0; i<lottos.length; i++) {
        	// winList안에 lottos의 값이 포함되어있나?
        	if(winList.contains(lottos[i])) {
        		// 포함되어 있다면 up을 1더해준다.(1개 당첨)
        		up++;
        	}else{
        		// 포함되어 있지 않다면 번호가 다르거나 0일 경우이니 down에 --를 해준다.
        		if(lottos[i]==0) {
        			// 0일 경우 맞을수도 있고 틀릴수도 있으니 --
        			up++;
        			down--;
        		}else {
        			down--;
        		}
        	}
        }
        int[] answer = {up, down};
        for(int j=0; j<answer.length; j++) {
        	switch(answer[j]) {
        		case 6 :
        			answer[j] = 1;
        			break;
        		case 5:
        			answer[j] = 2;
        			break;
        		case 4:
        			answer[j] = 3;
        			break;
        		case 3:
        			answer[j] = 4;
        			break;
        		case 2:
        			answer[j] = 5;
        			break;
        		default:
        			answer[j] = 6;
        			break;
        	}
        }
        
        return answer;
    }
}
