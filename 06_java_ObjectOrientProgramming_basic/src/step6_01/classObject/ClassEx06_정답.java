package step6_01.classObject;

import java.util.Random;

/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */


class Ex06_pr{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}




public class ClassEx06_정답 {

	public static void main(String[] args) {

		Ex06_pr ex6 = new Ex06_pr();
		Random ran = new Random();
		
		char[] omr = new char[5];
		
		for(int i = 0; i < 5; i++) {
			ex6.hgd[i] = ran.nextInt(5) + 1;
		}
		
		for (int i = 0; i < 5; i++) {
			if (ex6.hgd[i] == ex6.answer[i]) {
				omr[i] = 'O';
				ex6.score += 20;
				ex6.answerCnt++;
			}
			else {
				omr[i] = 'X';
			}
		}
		
		System.out.print("answer = {");
		for (int i = 0; i < 5; i++) {
			if (i != 4) {
			System.out.print(ex6.answer[i] + ", ");
			}
			else System.out.print(ex6.answer[i]);
		}
		
		System.out.println("}");
		
		System.out.print("hgd = {");
		for (int i = 0; i < 5; i++) {
			if (i != 4) {
			System.out.print(ex6.hgd[i] + ", ");
			}
			else System.out.print(ex6.hgd[i]);
		}
		
		System.out.println("}");
		
		System.out.print("정오표\t={");
		for (int i = 0; i < 5; i++) {
			if (i != 4) {
			System.out.print(omr[i] + ", ");
			}
			else System.out.print(omr[i]);
		}
		
		System.out.println("}");
		
		System.out.println("성적\t=" + ex6.score);
		
		
	}

}
