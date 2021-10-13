package codeTest;

import java.util.Arrays;

public class lostGymSuit {

	public static void main(String[] args) {

		int[] lo = {2, 4};
//		int[] lo = {1, 2, 3, 4, 8, 9, 10, 11};
//		int[] lo = {5};
		int[] rev = {3};
//		int[] rev = {9, 10};
//		int[] rev = {1, 3, 5};
		
		System.out.println(solution(5, lo, rev));
	}
	public static int solution(int n, int[] lost, int[] reserve) {
		
		// 조건1 : 여분의 체육복을 가진 학생이 체육복을 도난 당하는 경우도 있다.
		// 조건2 : 앞, 혹은 뒤로 체육복을 빌려줄 수 있다.
		
		/* 방법
		 * 1. 여분의 체육복을 갖고 있는 학생 중 체육복을 도난 당한 학생의 경우, 여분 리스트에서 삭제한다. 
		 * (여분의 체육복을 자기가 입어야 하므로.)
		 * 2. 서로 비교를 한다. 비교는 각각 lost와 reserve중 큰 수를 찾아 그 수보다 1 크거나 작다면 1count 한다.
		 */
		
		Arrays.sort(lost);
		Arrays.sort(reserve);
//		List<String> reserveList = Arrays.asList(Arrays.stream(reserve).boxed().toArray(String[]::new));
//		List<String> lostList = Arrays.asList(Arrays.stream(lost).boxed().toArray(String[]::new));
//		int size = lostList.size()<reserveList.size() ? reserveList.size() : lostList.size();
//		List<String> reserveList = new ArrayList<>(); 
//		List<String> lostList = new ArrayList<>();
		// 체육복을 도난당한 학생 중 여분의 체육복을 가진 학생도 도난당했는지 확인 후 리스트 저장.
		for(int i=0; i<lost.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if(lost[i] != 0 && lost[i] == reserve[j]) {
					lost[i] = 0;
					reserve[j] = 0;
				}
//					lostList.remove(i);
//					reserveList.remove(j);
//					i=-1;
//					break;
//				}else {
//					if(!reserveList.contains(reserve[j])) {
//						// 여유옷을 가지고 있으면서 도난을 당하지 않은 학생들을 reserveList에 저장한다.
//						reserveList.add(reserve[j]);
//					}
//					// 같을경우?
//					if(!lostList.contains(lost[i])) {
//						// 여유옷이 없으면서 도난을 당한 학생들을 lostList에 저장한다.
//						lostList.add(lost[i]);
//					}
			}
		}
        
//        int answer = n-lostList.size();
		int answer = n-lost.length;
		for(int m=0; m<lost.length; m++) {
			for(int j=0; j<reserve.length; j++) {
				if(reserve[j] == 0 && lost[m] == 0) {
					// lost가 0인 경우, 즉 잃어버린 사람이 없는 경우.
					// 여유분이 있는 사람이 잃어버린 것이므로 1을 추가해줌.
					answer += 1;
					break;
				}
				// lost가 0이 아닌 경우, 즉 잃어버린 사람이 있는 경우 
				if(reserve[j] != 0) {
					// 만약 잃어버린 사람이 있다면? lost의 값에서 -1 혹은 +1과 reserve의 값이 같은지 비교
					if(((lost[m])-1) == reserve[j]||((lost[m])+1)==reserve[j]) {
						// 같으면 answer에 +1을 해준다.
						answer += 1;
						reserve[j] = 0;
						break;
					}
				}else {
					// 그 외의 경우는 아무것도 아님.
				}
			}
		}
		
		
//		for(int i=0; i<lostList.size(); i++) {
//        for(int i=0; i<lost.length; i++) {
//        	for(int j=i; j<reserve.length; j++) {
//			for(int j=i; j<reserveList.size(); j++) {
//				// 잃어버린 사람이 여유 사람의 번호보다 앞의 번호인가?
//        		if(reserveList.get(i)==lostList.get(i)) {
////				if(reserve[i]==lost[i]) {
//					break;
//				}else {
//					if((lostList.get(i)-1)==reserveList.get(i)||(lostList.get(i)+1)==reserveList.get(i)) {
////					if((lost[i]-1)==reserve[i]||(lost[i]+1)==reserve[i]) {
//						// 체육복을 빌려줄 때 마다 잃어버린 사람은 체육복이 생길테니 +1
//						answer += 1;
//						break;
//					}
//				}
//			}
//		}
		
        return answer;
    }

}

