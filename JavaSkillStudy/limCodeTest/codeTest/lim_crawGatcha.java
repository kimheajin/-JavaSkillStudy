package codeTest;

import java.util.ArrayList;

public class lim_crawGatcha {

	public static void main(String[] args) {
		int[][] board = // {{0, 0, 0}, {1, 1, 1}, {2, 2, 1}};
			{ { 0, 0, 0, 0 , 0}, { 0, 0, 1, 0, 3 }, { 0, 2,5, 0, 1 }, { 4,2, 4, 4, 2 }, { 3, 5, 1,3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };// 011121->2
		solution(board, moves);
	}
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> gotchaList = new ArrayList<Integer>();
		for (int i = 0; i < moves.length; i++) {
			int x = moves[i] - 1;
			for (int j = 0; j < board.length; j++) {
				if (board[j][x] != 0) {
					// 2개가 만나 사라지는 경우
					if (gotchaList.size() > 0 && gotchaList.get(gotchaList.size() - 1) == board[j][x]) {
						answer = answer + 2;
						gotchaList.remove(gotchaList.size() - 1);
					} else {
						// 리스트에 추가되는 경우
						gotchaList.add(board[j][x]);
					}
					board[j][x] = 0;
					break;
				}
			}
		}
		System.out.println(answer);
		return answer;
	}
}
