package codeTest;

import java.util.ArrayList;
import java.util.List;

public class RepeatedWordRemoval {

	public static void main(String[] args) {
		/* 같은 숫자는 싫어 */
		int[] i = {1,1,3,3,0,1,1};
		System.out.println(solution(i));
	}
	public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
//        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//		List<Integer> list = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
        
        int save = 0;
        for(int i=0; i<arr.length-1; i++) {
        	save = arr[i+1];
        	if(arr[i]!=save) {
        		list.add(arr[i]);
        	}
        }
        
        list.add(arr[arr.length-1]);
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
	
}
