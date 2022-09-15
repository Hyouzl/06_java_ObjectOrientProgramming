
package step6_02.method;

import java.util.Random;
import java.util.Scanner;


class Ex09_pr {

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int [] scores) {
		
		for (int i = 0; i < 5; i++) {
			scores[i] = ran.nextInt(100) + 1;
			System.out.print(scores[i] + " ");
		}
		
	}
	
	//문제 2)
	void printSumAndAverage (int [] scores) {
		int sum = 0;
		double avg;
		for (int i = 0; i < 5; i++) {
			sum += scores[i];
		}
		
		avg = sum / 5;
		
		System.out.println("총점(" + sum + ")" + "평균(" + avg + ")");
	}
	
	//문제 3)
	void printWinner (int [] scores) {
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if (scores[i] >= 60) {
				cnt++;
			}
		}
		
		System.out.println(cnt + "명");
	}
	
	//문제 4)
	void printScore1 (int [] scores) {
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		
		System.out.print("성적 : ");
		System.out.println(scores[idx]);
		
	}
	
	//문제 5)
	void printScore2 (int [] scores) {
		
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		for(int i = 0; i < 5; i++) {
			if (scores[i] == score) {
				System.out.print("인덱스 : " + i);
				break;
			}
		}

	}
	
	//문제 6)
	void printScore3(int [] hakbuns, int [] scores) {
		
		System.out.print("학번 입력 : ");
		int num = scan.nextInt();
		
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if (hakbuns[i] == num) {
				System.out.print("성적 : " + scores[i] + "점");
				break;
			}
			cnt++;
		}
		
		if (cnt == 5) {
			System.out.println("존재하지 않는 학번입니다.");
		}
	}
	
	//문제 7)
	void printNumberOne (int [] hakbuns, int [] scores) {
		
		int max = 0;
		int idx = 0;
		for(int i = 0; i < 5; i++) {
			if(max < scores[i]) {
				max = scores[i];
				idx = i;
			}
		}
		
		System.out.println(hakbuns[idx] + "번(" + max + "점)");
	}
	
}


public class MethodEx09_정답 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex09_pr e = new Ex09_pr();
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		
		e.setRandomValuesinArray(scores);

		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		
		System.out.println();
		e.printSumAndAverage(scores);
		

		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명
		
		System.out.println();
		e.printWinner(scores);
		

		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		
		System.out.println();
		e.printScore1(scores);

		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		System.out.println();
		e.printScore2(scores);
		System.out.println();
		// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점

		System.out.println();
		e.printScore3(hakbuns, scores);
		

		System.out.println();
		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		System.out.println();
		e.printNumberOne(hakbuns, scores);
		

	}

}
