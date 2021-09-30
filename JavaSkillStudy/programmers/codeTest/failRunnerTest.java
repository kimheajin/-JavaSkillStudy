package codeTest;

public class failRunnerTest {

	public static void main(String[] args) {
		String answer;
		String[] partic = {"leo", "kiki", "eden"};
		String[] comp = {"eden", "kiki"};
		answer = solution(partic, comp);
	}
	
	private static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        if(participant.length>=1&&participant.length<=100000){
            if(participant.length>=completion.length){
                for(int i=0; i<participant.length; i++){
                	for(int j=0; j<completion.length; j++) {
                		if(completion[j].compareTo(participant[i])==0){
                			answer = "";
                			break;
                		}else{
                			answer = participant[i];
                		}
                	}if(answer!="") {
                		break;
                	}
                }
            }else{
                return answer;
            }
            
       }else{
                return answer;
            }
        
        return answer;
    }
}
