package codeTest;

import java.util.HashSet;
import java.util.Set;

public class phonekectmon {

	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		System.out.println(solution(nums));
	}
	
	public static int solution(int[] nums) {
//      int[]배열을 List형으로 바꾸는 방법!!!!  ****
//		List<Integer> arr = Arrays.stream(nums).boxed().collect(Collectors.toList());
		
		Set<Integer> set = new HashSet<>();
		
		for(int num : nums) {
			set.add(num);
		}
		
		int answer = set.size()>(nums.length/2) ? (nums.length/2) : set.size();
        
        return answer;
    }

}
