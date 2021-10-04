package codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class developFacility {

	public static void main(String[] args) {
		
		int [] a = {95, 90, 99, 99, 80, 99};
		int [] b = {1, 1, 1, 1, 1, 1};
		System.out.println(solution(a, b ));
	}
	public static int[] solution(int[] progresses, int[] speeds) {
		
		ArrayList<Integer> progressesList = new ArrayList<Integer>(Arrays.stream(progresses).boxed().collect(Collectors.toList()));
		ArrayList<Integer> speedsList = new ArrayList<Integer>(Arrays.stream(speeds).boxed().collect(Collectors.toList()));
		ArrayList<Integer> saveList = new ArrayList<Integer>();
		ArrayList<Integer> countList = new ArrayList<Integer>();
		int count = 1;
		
        for(int i=0; i<=progressesList.size(); i++, count++) {
        	if(i == progressesList.size()) {
        		i=0;
        	}
        	progressesList.set(i, (progressesList.get(i) + speedsList.get(i)));
        	if(progressesList.get(0)>=100) {
    			for(int j=0; j<progressesList.size(); j++) {
    				j=0;
    				if(progressesList.get(j)>=100) {
    					saveList.add(count);
    					progressesList.remove(j);
    					speedsList.remove(j);
    				}
        		}
        	}
        }
        Set<Integer> set = new HashSet<Integer>(saveList);

        for (int c : set) {
        	countList.add(Collections.frequency(saveList, c));
        }

        int[] answer = countList.stream().mapToInt(i->i).toArray();

        return answer;
    }

}
