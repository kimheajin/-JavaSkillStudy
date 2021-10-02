package codeTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class phoneNumberList {

	public static void main(String[] args) {
		String[] s = {"119", "97674223", "1195524421"};
		
		System.out.println(solution(s));
	}
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		Map<Integer, String> savePhoneNumber = new HashMap<>();
		
		for(int i=0; i<phone_book.length; i++) {
			// list정렬 먼저 한 경우의 코드 - start
			// phone_book[i] = phone_book[i].replaceAll(" ", "");
			// list정렬 먼저 한 경우의 코드 - end 
			
			savePhoneNumber.put(i, phone_book[i].replaceAll(" ", ""));
		}
		
		// list정렬 먼저 한 경우의 코드 - start
		// Arrays.sort(phone_book);
		// list정렬 먼저 한 경우의 코드 - end 
		
		// 값을 기준으로, 오름차순 정렬
	    List<Map.Entry<Integer, String>> entries = new LinkedList<>(savePhoneNumber.entrySet());
	    Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
	    
	    for(int j=0; j<entries.size()-1; j++) {
	    	String check = entries.get(j).getValue();
	    	if(entries.get(j+1).getValue().contains(check)) {
	    		return answer = false;
	    	}
	    }
		// list정렬 먼저 한 경우의 코드 - start 
//		for(int j=0; j<phone_book.length-1; j++) {
//			savePhoneNumber.put(j, phone_book[j]);
//		}
		
//		for(Integer key : savePhoneNumber.keySet()) {
//			String check = savePhoneNumber.get(key);
//			if(check.compareTo(savePhoneNumber.get(key+1).substring(0, check.length())) == 0) {
//		}
		// list정렬 먼저 한 경우의 코드 - end 
	    
        return answer;
    }

}
