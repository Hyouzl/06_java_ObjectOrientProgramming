package step6_02.method;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표 = {O, X, O, X, X}
 * 성적   = 40점
 */


class ScoreMng { 
	
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 5};		// 모범답안
	int[] rNum = new int[5];			// 학생답안
	
	int answerCnt = 0;					// 정답을 맞춘 개수
	int score = 0;						// 성적
	
	// 1.me 답안 완성하기
	void makeAnswer() {
		for (int i = 0; i < rNum.length; i++) {
			rNum[i] = ran.nextInt(5) + 1;		// [0 ~ 4] + 1	학생 답안 랜덤으로 입력	
		}
	}
	
	
	
	// 2.정답 출력하기
	void showAnswer() { 
		
		// omr카드 출력
		System.out.print("omr  = ");
		System.out.println(Arrays.toString(omr)); // 숫자배열 문자열로 변환 후 출력
		
		// me카드 출력
		System.out.print("rNum = ");
		System.out.println(Arrays.toString(rNum)); // 숫자배열 문자열로 변환 후 출력
		
	}
	
	
	
	// 3.정답 비교하기
	void checkAnswer() {
		
		answerCnt = 0;
		System.out.print("정오표= [");
		
		for (int i = 0; i < omr.length; i++) {
			if (omr[i] == rNum[i]) { // 학생 답안과 정답이 같으면 O 를 출력 , 정답카운트 업
				System.out.print("O ");
				answerCnt++;
			}
			else {
				System.out.print("X "); // 같지 않으면 X 출력
			}
		}
		System.out.println("]");
		
		score = 20 * answerCnt; // 1문제당 20 점이므로 총 점은 정답 카운트 개수만큼 20점을 더해줌
		System.out.println("점  수 = " + score + "점");
		
	}
	
	
	// 4.실행하기
	void run() {
		
		makeAnswer(); // 학생 답안 입력 메서드
		showAnswer(); // 모범 답안 (정답) 과 학생 답안 출력
		checkAnswer(); // 정답 비교한 뒤 점수 출력
		
	}
	
}

public class MethodEx13_연습 {

	public static void main(String[] args) {
		
		ScoreMng sm = new ScoreMng(); 
		sm.run(); // sm 총 메서드들을 모두 호출하는 메서드 실행  
	
	}

}
