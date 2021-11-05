package codeTest;

public class arraySum {

	public static void main(String[] args) {
//		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr1 = {{1},{2}};
//		int[][] arr2 = {{3,4},{5,6}};
		int[][] arr2 = {{3},{4}};
		solution(arr1, arr2);
	}
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        // 배열의 길이는 같다고 했으니까! arr1을 answer에 넣어도 상관없음;
        answer = arr1;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

}
