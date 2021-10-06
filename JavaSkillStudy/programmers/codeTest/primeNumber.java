package codeTest;

import java.util.ArrayList;
import java.util.HashSet;

public class primeNumber {

	public static void main(String[] args) {
		System.out.println(solution("7843"));
	}
	public static int solution(String numbers) {
		
		ArrayList<String> saveList = new ArrayList<String>();
		ArrayList<String> primeList = new ArrayList<String>();
			
		
		for(int i=0; i<numbers.length(); i++) {
			saveList.add(numbers.substring(i, i+1));
		}
		
		String temp = null;
		for(int j=0; j<saveList.size(); j++) {
			temp = "";
			for(int m=0, s=j; m<saveList.size(); m++, s++) {
				if(s>=saveList.size()) {
					s=0;
				}
				if(temp.substring(0).compareTo("0")==0) {
					temp = temp.substring(1, temp.length());
				}
				temp = temp + saveList.get(s);
				primeList.add(temp);
			}
		}
		
		HashSet<String> distinctData = new HashSet<String>(primeList);
		primeList = new ArrayList<String>(distinctData);
		
		int answer = 0;
		
		for(int j=0; j<primeList.size(); j++) {
			if(Integer.parseInt(primeList.get(j))>1) {
				if(Integer.parseInt(primeList.get(j)) ==2 || Integer.parseInt(primeList.get(j)) == 3 || Integer.parseInt(primeList.get(j)) == 5 || Integer.parseInt(primeList.get(j)) == 7) {
					answer += 1;
					continue;
				}
				if(Integer.parseInt(primeList.get(j))%2 == 0 || Integer.parseInt(primeList.get(j))%3 == 0 || Integer.parseInt(primeList.get(j))%5 == 0 || Integer.parseInt(primeList.get(j))%7 == 0) {
					continue;
				}
				answer += 1;
			}
		}
		
        return answer;
    }

}
