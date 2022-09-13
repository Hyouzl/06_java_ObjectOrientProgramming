package step6_01.classObject;

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */


class Ex05_pr{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}



public class ClassEx05_정답 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		Ex05_pr ex05 = new Ex05_pr();
		ex05.name = "메가 IT 고등학교";

		//Ex05 mega = new Ex05();
		//mega.name = "메가IT 고등학교";
		
		while (true) {
			
			// 메뉴 출력
			System.out.println("=== " + ex05.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			int len = ex05.arHakbun.length;
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			
			if		(choice == 1) {
				
				int sum = 0;
			
				System.out.println("전교생 수 = " + len + "명");
				for (int i = 0; i < len; i++) {
					sum += ex05.arScore[i];
				}
				
				System.out.println("총점 = " + sum + "점");
				
				double avg = sum / len;
				
				System.out.println("평균 = " + avg + "점");
				
			}
			else if (choice == 2) {
				int max = 0;
				int maxIdx = 0;
				for(int i = 0; i < len; i++) {
					if (max < ex05.arScore[i]) {
						max = ex05.arScore[i];
						maxIdx = i;
					}
				}
				
				System.out.println("=== 1등 ===");
				System.out.println("학번 : " + ex05.arHakbun[maxIdx]);
				System.out.println("성적 : " + max);
				
				
			}
			else if (choice == 3) {
				int min = ex05.arScore[0];
				int minIdx = 0;
				
				for(int i = 0; i < len; i++) {
					if (min > ex05.arScore[i]) {
						min = ex05.arScore[i];
						minIdx = i;
					}
				}
				
				System.out.println("=== 꼴등 ===");
				System.out.println("학번 : " + ex05.arHakbun[minIdx]);
				System.out.println("성적 : " + min);
			}
			else if (choice == 4) {
				System.out.println("학번을 입력하세요 :");
				int num = scan.nextInt();
				int i;
				for (i = 0; i < len; i++) {
					if(num == ex05.arHakbun[i]) {
						System.out.println(num + "학번 학생의 성적은 " + ex05.arScore[i] + "점 입니다.");
						break;
					}
				}
				
				if (i == len) {
					System.out.println("해당하는 학번이 없습니다.");
				}
				
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
