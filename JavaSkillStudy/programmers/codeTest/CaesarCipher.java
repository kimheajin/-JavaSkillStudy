package codeTest;

import java.util.regex.Pattern;

public class CaesarCipher {

	public static void main(String[] args) {
		solution("a B z", 4);
	}
	public static String solution(String s, int n) {
		StringBuffer answer = new StringBuffer();
		// 쉬운 변환을 위해 배열로 변경. 또한, 아스키 코드를 활용하기 위해 char로 받음
		char[] asc = s.toCharArray();
		
		int code = 0; 
		for(int i=0; i<s.length(); i++) {
			// 동등한 비교를 위해 대문자로 변경 후 up에 저장.
			char up = Character.toUpperCase(asc[i]);
			// 현재 값에 n을 더하여 유니코드를 구함. (알파벳일 경우에만 n을 더해줌.)
			if(Pattern.matches("^[a-zA-Z]*$", String.valueOf(up))) {
				code = up + n;
				// 만약 n을 더한 값이 90보다 클 경우(대문자가 아닐 경우) 
				if(code>90) {
					// code에 90을 뺀 값에 A부터 시작한다는 의미로 A를 더한다.
					code = (code - 91) + (int)'A';
				}
				// 원래 값이 대문자가 아닌가?
				if(Character.compare((char)up, asc[i])!=0) {
					// 소문자로 변경 후 code를 재설정.
					code = (int)Character.toLowerCase(code);
				}
			}else {
				code = up;
			}
			answer.append((char)(code));
			
		}
		
//        HashMap<Integer, String> m = new HashMap();
        
        // 1~26을 키로, A~Z를 삽입.
//        for(int i=0; i<26;i++) {
//        	m.put(i+1, String.valueOf((char) ('A' + i)));
//        }
        
        // s가 들어오면 s를 배열로 받은 후 hashmap에서 해당하는 key를 찾는다. 
        // 여기서 -1을 붙인다면 공백도 살린다는 의미.
//        String[] answer = s.split("");
//        
//        int key = 0;
//        for(int j=0; j<0; j++) {
//        	m.entrySet().stream().filter(e -> {
//        								String up = answer[0];
//        								return up.equals(e.getValue());
//    							})
//        						 .map(Map.Entry::getKey)
//        						 .collect(Collectors.toSet());
        	
//        }
        
//        for(int o : m.keySet()) {
//        	
//        	if((answer.length)==j) {
//        		break;
//        	}
//        	up = answer[j].toUpperCase();
//        	if(up.equals(m.get(o))) {
//        		// key에 n을 더함.
//        		key = o + n;
//        		// 만약 더한 값이 m의 길이를 초과할 경우
//        		if(key > m.size()) {
//        			// key값에서 m.size()만큼 뺀 값이 key값이 됨.
//        			key = key-m.size();
//        		}
//        		// answer의 값이 대문자인가?
//        		if(up.compareTo(answer[j])==0) {
//        			// key로 +n한 알파벳을 찾음.
//        			answer[j] = m.get(key);
//        		}else {
//        			// 대문자가 아닌 경우
//        			answer[j] = m.get(key).toLowerCase();
//        		}
//        	}
//        	j++;
//        }
        
        return answer.toString();
    }
}
