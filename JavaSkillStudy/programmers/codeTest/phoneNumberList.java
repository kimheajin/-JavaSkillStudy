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
			savePhoneNumber.put(i, phone_book[i].replaceAll(" ", ""));
		}
		
		List<Map.Entry<Integer, String>> entries = new LinkedList<>(savePhoneNumber.entrySet());
	    Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        
        for(int j=0; j<entries.size()-1; j++) {
	    	String check = entries.get(j).getValue();
			if(entries.get(j+1).getValue().startsWith(check)) {
	    		return answer = false;
	    	}
	    }
        return answer;
    }

}
