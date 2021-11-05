package codeTest;

import java.util.ArrayList;
import java.util.Collections;

public class maxNumber {

	public static void main(String[] args) {
//		System.out.println(solution("1924", 2));
//		System.out.println(solution("1231234", 3));
		System.out.println(solution("4177252841", 4));
		
	}
	public static String solution(String number, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        /* 최고의 수를 만드는 숫자를 뽑기 위한 규칙
         * 1. 앞, 뒤를 비교해 작은 수를 리스트로부터 삭제한다. */
        
        StringBuilder sb = new StringBuilder();
        // 최대값을 저장할 max
        int max = 0;
        // max값의 index를 저장할 index
        int index = 0;
        
//        // 구해야하는 수 만큼 돌리기
//        for(int i=0; i<number.length()-k; i++) {
//        	// max값은 비교를 빠져나올때마다 초기화
//        	max = 0;
//        	for(int j=index; j<=i+k;j++) {
//        		// int값으로 비교를 하기 위해 -'0'를 추가.
//        		// ex: '1'(아스키코드 : 49)-'0'(아스키코드 : 48)+을 하면 숫자 1이 된다.
//        		// 위의 ex와 같은 방식으로 int값을 구함.
//        		if(max < number.charAt(j)-'0') {
//        			max = number.charAt(j)-'0';
//        			// max값의 위치를 찾기 위한 index
//        			index = j + 1;
//        		}
//        	}
//        	sb.append(max);
//        }
        
        /* arr를 이용한 방식 */
//         number의 길이에서 -k, 즉 삭제할 수를 빼서 구해야 하는 수만큼 돌리기로 한다.
        int i, j;
        for(i=0; i<number.length(); i++) {
        	// number의 첫번째부터 구해야 하는 수(k)만큼 for문을 움직여 arr의 값을 구한다.
        	for(j=index; j<k+i; j++) {
        		arr.add(Integer.parseInt(number.substring(j, j + 1)));
        		max = Collections.max(arr);
        		if(arr.get(j) == max) {
        			// 그 다음값과 같은가??? 같으면 break;를 걸자.
//        			if(Integer.parseInt(number.substring(j+1, j+2)) == max) {
//        				index = j+1;
//        				break;
//        			}
        			index = j+1;
        		}
        	}
        	// 제일 마지막의 삭제값까지 구하면 아래 if문 실행
//        	if(arr.size()==1) {
//        		arr.add(Integer.parseInt(number.substring(arr.size(), arr.size() + 1)));
//        		// arr의 첫째 값과 number의 그 다음값을 비교해 max값을 뽑는다.
//        	}
        	// 구해진 arr값 중 가장 큰 수를 구한다.
        	// sb에 최고값을 저장한다.
        	sb.append(max);
//        	number = number.substring(index,number.length());
        	arr.clear();
        	//  = 전체 사이즈 - 현재 number의 길이(자른 후 길이) + sb에 추가된 값
//        	if(size-(number.length()+sb.length()) == k) {
//        		break;
//        	}
        }
        
        sb.append(number);
        

        return sb.toString();
    }

}
