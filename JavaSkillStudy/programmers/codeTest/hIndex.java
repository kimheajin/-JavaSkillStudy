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
		int count = 0;
		for(int i=citations.length-1; i>=0; i--, count++) {
			if(citations[i] == 0) {
				answer = count;
				break;
			}
			if(count>=citations[i]) {
				answer = count;
				break;
			}else if(i==0 && count<=citations[i]){
				answer = citations.length;
			}
		}
        return answer;
	}
}
