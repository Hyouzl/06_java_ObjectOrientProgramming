package step6_02.method;

import java.util.Random;
import java.util.Scanner;

class SpeedGame {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[][] front = new int[3][3];
	int[][] back = new int[3][3];

	int num = 1;

	
	// 숫자 셋팅하기
	void setNumber() {
		
		int k = 1;
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front[i].length; j++) {
				front[i][j] = k++;
			} // 
		}
		for (int i = 0; i < back.length; i++) {
			for (int j = 0; j < back[i].length; j++) {
				back[i][j] = k++;
			}
		}
		
	}

	
	
	// 카드 섞기
	void suffleCard() {
		
		for (int i = 0; i < 1000; i++) {
			int xR = ran.nextInt(front.length); //배열의 행의 개수만큼
			int yR = ran.nextInt(front[0].length); //배열의 열의 개수만큼
			
			int tmp = front[0][0]; // 첫번째 위치 카드 임시 저장
			front[0][0] = front[xR][yR]; // 첫번째 위치에 랜덤선택한 카드 위치 값 넣어주기
			front[xR][yR] = tmp; // 랜덤선택한 위치에 임시저장한 첫번째 위치에 카드 넣어주기

			tmp = back[0][0];
			back[0][0] = back[xR][yR];
			back[xR][yR] = tmp;
		} 
		
	}

	
	
	// 화면 출력하기
	void showCard() {
		
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front[i].length; j++) {
				System.out.print(front[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
		
	}

	
	
	// 입력받기
	void selectCard() {
		
		System.out.print("y입력 : ");
		int yIdx = scan.nextInt();
		System.out.print("x입력 : ");
		int xIdx = scan.nextInt();
		
		if (num == front[yIdx][xIdx]) {
			if (num <= 9) {  
				front[yIdx][xIdx] = back[yIdx][xIdx];  
			} 
			else { 
				front[yIdx][xIdx] = 0;
			}
			num++;
		}
		
	}

	
	
	void run() {

		setNumber();
		suffleCard();

		while (true) {

			showCard();

			// 종료하기
			if (num == 19) {
				System.out.println("게임종료");
				break;
			}

			selectCard();
		}
	}
	
}



public class MethodEx18_연습 {

	public static void main(String[] args) {
		
		SpeedGame sg = new SpeedGame();
		sg.run();

	}

}
