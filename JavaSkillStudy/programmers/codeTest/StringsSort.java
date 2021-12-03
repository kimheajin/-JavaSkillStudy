package codeTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringsSort {

	public static void main(String[] args) {
		/* 문자열 내림차순으로 배치하기 */
		solution("Zbcdefg");
	}
	public static String solution(String s) {
        
        // reverse를 하기 위해 ""로 나누어진 s를 stream의 sorted를 이용해 역순으로 정렬하고 list로 정의하여 sortStr에 저장. 
        List<String> sortStr = Arrays.asList(s.split(""))
        							 .stream()
        							 .sorted(Comparator.reverseOrder())
        							 .collect(Collectors.toList());
        
        // 뒤집기
//        Collections.reverse(sortStr);

        // 결과값을 저장할 answer
        String answer = String.join("", sortStr);
        
        return answer.toString();
    }

}
