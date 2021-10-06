package codeTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class phoneNumberList {

	public static void main(String[] args) {
//		String[] s = {"119", "97674223", "1195524421"};
		String[] s = {"12","123","1235","567","88"};
		
		System.out.println(solution(s));
	}
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		
	    Arrays.sort(phone_book);
	    for(int i=0; i<phone_book.length-1; i++) {
	    	if(phone_book[i+1].startsWith(phone_book[i])) {
	    		return answer = false;
	    	}
	    }
	    
        return answer;
    }

}
