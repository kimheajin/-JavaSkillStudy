package codeTest;

import java.util.Arrays;

public class hIndex {

	public static void main(String[] args) {
//		int[] citations = {3, 0, 6, 1, 5}; // 값 3
//		int[] citations = {10, 9, 4, 1, 1}; // 값 3
//		int[] citations = {62, 21, 17, 18, 16, 13, 11, 10, 8}; // 값 8
//		int[] citations = {9, 7, 6, 2, 1}; // 3
		int[] citations = {10,11,12,13};
		System.out.println(solution(citations));
	}
    public static int solution(int[] citations) {
        int answer = 0;
		Arrays.sort(citations);
		int count = 1;
		for(int i=citations.length-1; i>0; i--, count++) {
			// 인용값 i를 기준으로 봤을 때, i만큼 인용되는 것의 최대값.
			// 내림차순으로 정렬 후 앞 뒤를 비교하고, 현재 본(count한) 갯수와 인용 회수가 같거나 작아지는 순간을 잡아내기.
			// 순번보다 더 작아지기 시작하는 직전의 숫자
			if(citations[i] == 0) {
				answer = citations[i];
				break;
			}
			if(count>=citations[i-1]) {
				answer = citations[i];
				if(count != citations[i]) {
					answer = count;
				}
				break;
			}
		}
        return answer;
	}

}
