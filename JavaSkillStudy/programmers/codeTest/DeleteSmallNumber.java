package codeTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteSmallNumber {

	public static void main(String[] args) {
		
		int[] a = {4,3,2,1};
		/* 제일 작은 수 제거하기 */
		solution(a);

	}
	
	public static int[] solution(int[] arr) {

		// 정렬한 arr를 List로 변환시킴.
        List<Integer> ls = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        // arr를 정렬시킴(가장 작은 수 검색용)
        Arrays.sort(arr);
        
        
        // 만약에 ls길이가 1이면 -1 입력
        if(ls.size() == 1) {
        	ls.set(0, -1);
        }else {
        	// 그 외의 경우, 길이가 1보다 큰 경우 가장 작은 값을 찾아 삭제한다.
        	ls.removeAll(Arrays.asList(Integer.valueOf(arr[0])));
//        	ls.remove(Integer.valueOf(arr[0]));
        }
        int[] answer = ls.stream().mapToInt(i->i).toArray();
        
        return answer;
    }

}
