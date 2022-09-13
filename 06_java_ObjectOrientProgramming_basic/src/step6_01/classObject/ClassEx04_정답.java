package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

class Ex04_pr {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}



public class ClassEx04_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in); 
		
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		Ex04_pr ex04 = new Ex04_pr();
		
		for (int i = 0; i < 5; i++) {
			ex04.scores[i] = ran.nextInt(100) + 1;
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(ex04.scores[i] + " ");
		}
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		System.out.println();
		int sum = 0;
		double avg;
		for (int i = 0; i < 5; i++) {
			sum += ex04.scores[i];
		}
		
		avg = sum / 5;
		
		
		System.out.println("총점(" + sum + ") 평균(" + avg +")");
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if (ex04.scores[i] >= 60) {
				cnt++;
			}
		}
		
		System.out.println("합격자" + cnt + "명");
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		
		System.out.print("성적 :" + ex04.scores[idx]);
		
		System.out.println();
		
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		
		System.out.print("성적 입력 :");
		int score = scan.nextInt();
		
		for(int i = 0; i < 5; i++) {
			if (score == ex04.scores[i]) {
				System.out.println("인덱스 : " + i);
				break;
			}
		}
		
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		
		System.out.print("학번 입력 : ");
		int num = scan.nextInt();
		
		for (int i = 0; i < 5; i++) {
			if (ex04.hakbuns[i] == num) {
				idx = i;
			}
		}
		
		System.out.println("성적 : " + ex04.scores[idx]);
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		
		System.out.print("학번 입력 : ");
		num = scan.nextInt();
		
		int j;
		for (j = 0; j < 5; j++) {
			if (ex04.hakbuns[j] == num) {
				idx = j;
				break;
			}
		}
		
		if (j == 5) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		
		else {
			System.out.println("성적 : " + ex04.scores[idx] + "점");
		}
		 
		
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)

		
		int max = 0;
		int maxIdx = 0;
		for (int i = 0; i < 5; i++) {
			if (max < ex04.scores[i]) {
				maxIdx = i;
			}
		}
		
		System.out.println(ex04.hakbuns[maxIdx] + "번(" + ex04.scores[maxIdx] + ")");
		
	}

}
