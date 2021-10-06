package codeTest;

import java.util.Arrays;

public class failRunnerTest {

	public static void main(String[] args) {
		String[] partic = {"leo",  "kiki", "kiki", "eden", "eden"};
		String[] comp = {"kiki",  "kiki", "leo", "eden"};
		System.out.println(solution(partic, comp));
	}
	
	public static String solution(String[] participant, String[] completion) {
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		String answer = "";
		
		for(int i=0; i<participant.length; i++) {
			if(participant[i].compareTo(completion[i]) != 0) {
				answer = participant[i];
				break;
			}
		}
		
		
		// 중복 횟수를 저장하기 위한 map
//		Map<String, Integer> participantMap = new HashMap<String, Integer>();
//		Map<String, Integer> completionMap = new HashMap<String, Integer>();
		
//		for(int i=0; i < participant.length; i++) {
//			participantMap.put(participant[i], participantMap.getOrDefault(participant[i], 0)+1);
//			if(completion.length > i) {
//				completionMap.put(completion[i], completionMap.getOrDefault(completion[i], 0)+1);
//			}
//		}
		
//		for(int j=0; j < participant.length; j++) {
//            if(participantMap.get(participant[j])!=completionMap.get(participant[j])) {
//                answer = participant[j];
//            }
//        }
		
        return answer;
    }
}
