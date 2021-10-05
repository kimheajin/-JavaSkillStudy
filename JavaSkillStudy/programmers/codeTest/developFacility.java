package codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class developFacility {

	public static void main(String[] args) {
		
		int [] a = {95, 90, 99, 99, 80, 99};
//		int [] a = {55,60,65};
		int [] b = {1, 1, 1, 1, 1, 1};
//		int [] b = {5, 10, 7};
		System.out.println(solution(a, b ));
	}
	public static int[] solution(int[] progresses, int[] speeds) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> countList = new ArrayList<Integer>();
		int count = 0;
		int speedSum = 0;
		
		for(int i=0; i<progresses.length; i++) {
			speedSum = (100-progresses[i])%speeds[i] == 0 ? (100-progresses[i])/speeds[i] : ((100-progresses[i])/speeds[i])+1;
			list.add(speedSum);
		}
		
		for(int s=0; s<list.size(); s++) {
			for(int j=s ; j<=list.size(); j++) {
				if(j==list.size()) {
					s=j;
					break;
				}else {
					if(list.get(s)>=list.get(j)){
						count++;
					}else {
						s=j-1;
						break;
					}
				}
			}
			countList.add(count);
			count=0;
			//만약 앞에 값이 뒤의 값 보다 크다면? 뒤의 값도 저장해야함.
//			if(list.get(s)>=list.get(s+1)) {
//					// 현재의 값만큼 +를 해준다. 
//					count++;
//					// 이후 해당 값을 remove시킨다.
////						list.remove(s);
//					// 처음부터 다시 시작하게 한다.
//			}else {
//				// 만약 앞의 값이 뒤의값 보다 작다면? 현재의 값만 저장해야함.
//				// 해당 else에 들어온 경우는 앞의 값보다 뒤의 값이 클 경우이다.
//				// 이는 count를 +1해주던 작업이 끝났다는 것을 뜻하며, count해 준 값은 list에 넣어주어야 한다. 
//				// 지금까지 count해주던 것을 countList에 넣어주었다.
//				count++;
//				countList.add(count);
//				list.remove(s);
//				// 처음부터 다시 시작하게 한다.
//				// 그리고 count를 리셋해준다.
//				count = 0;
//			}
			
		}
		
		
        int[] answer = countList.stream().mapToInt(i->i).toArray();

        return answer;
    }

}
