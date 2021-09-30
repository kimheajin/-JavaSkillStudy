package Algo_function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class lim_selfNumber {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i=1;i<10000;i*=10) {
			for(int j=i; j<i*10;j++) {
			int result=0;
			int ten=i; //10의자리나누기용
			int namu=j; //나머지 값
			while(true) {
				if(namu<10) {
					// 원래 자신+일의 자리수 처리하고 반복문 종료
					result=result+namu%10+j;
					intList.add(result);
					break;
				} else {
						result=result+namu/ten;
						namu=namu%ten;
						ten=ten/10;
						// System.out.print(namu+","+namu/ten+","+namu%ten+",/");
					}
				} 
			}
		}
		Collections.sort(intList); 
		// 중복제거
		HashSet<Integer>arr2= new HashSet<Integer>(intList);
		ArrayList<Integer> arr3 = new ArrayList<Integer>(arr2);
		int count=0;
		for(int i=1;i<10000;i++) {
			if(arr3.get(count).equals(i)) {
				count++;
				continue;
			}else {
				//취득한 리스트에 존재하지 않는 리스트를 출력
				System.out.println(i);
			}
		}
	}
}
