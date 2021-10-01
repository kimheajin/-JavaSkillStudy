package codeTest;

import java.util.HashMap;
import java.util.Map;

public class failRunnerTest {

	public static void main(String[] args) {
		String[] partic = {"leo",  "kiki", "kiki", "eden", "eden"};
		String[] comp = {"kiki",  "kiki", "leo", "eden"};
		System.out.println(solution(partic, comp));
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		// 중복 횟수를 저장하기 위한 map
		Map<String, Integer> participantMap = new HashMap<String, Integer>();
		Map<String, Integer> completionMap = new HashMap<String, Integer>();
		
		for(int i=0; i < participant.length; i++) {
			participantMap.put(participant[i], participantMap.getOrDefault(participant[i], 0)+1);
			if(completion.length > i) {
				completionMap.put(completion[i], completionMap.getOrDefault(completion[i], 0)+1);
			}
		}
		
//		System.out.println("참가자 : "+ participantMap);
//		System.out.println("완주자 : "+ completionMap);
//		
//		for(String key : participantMap.keySet()) {
//			int count = participantMap.get(key);
//			System.out.println("참가자 : "+ key + ", 동명이인 인원수 : " + count);
//			if(completionMap.get(key)!=count) {
//				System.out.println(key +"이란 이름의 참가자 수 : " + count + ", 완주자 수 : "+ completionMap.get(key));
//				answer = key;
//			}
//		}
		
		for(int j=0; j < participant.length; j++) {
            if(participantMap.get(participant[j])!=completionMap.get(participant[j])) {
                answer = participant[j];
            }
        }
		
        return answer;
    }
}
