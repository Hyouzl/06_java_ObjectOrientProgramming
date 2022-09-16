package step6_02.method;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class MemoryGame{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int correctCnt = 0;		// 정답을 맞춘 횟수
	
	void shuffle() {
		
		for (int i = 0; i <1000; i++) {
			int r = ran.nextInt(front.length); //존재하는 카드배열에 인덱스 중 랜덤으로 입력 
			int tmp = front[0]; // 랜덤으로 선택한 카드 재배치를 위해 첫번째 카드 임시로 담아두기
			front[0] = front[r]; // 첫번째 위치를 랜덤으로 선택한 카드로 바꿔주기
			front[r] = tmp; // 랜덤으로 선택한 카드 위치를 첫번째 카드로 바꿔주기
		}
		
	}
	
	
	
	void printCard() {
		
		// 카드 앞면 출력
		System.out.print("front = [");
		for (int i = 0; i < front.length; i++) {
			System.out.print(front[i] + " ");
		}
		System.out.println("] ");
		
		// 카드 뒷면 출력
		System.out.print("back  = [");
		for (int i = 0; i < back.length; i++) {
			System.out.print(back[i] + " ");
		}
		System.out.println("] ");
		
	}
	
	
	
	void choiceCard() {
		
		System.out.print("카드1 입력[1~10] : ");
		int card1 = scan.nextInt() - 1;
		System.out.print("카드2 입력[1~10] : ");
		int card2 = scan.nextInt() - 1;
		
		// 카드 뒤짚기
		if (front[card1] == front[card2]) { //뒤집은 두 카드가 같으면
			back[card1] = front[card1];
			back[card2] = front[card2];// back 카드에 같은 두 카드를 대입
			correctCnt++; // 맞은 개수 업
		}
		
	}
	
	
	
	void run() {
		
		// 셔플(카드 섞기)
		shuffle();
		
		while (true) {
			// 카드 출력
			printCard();
			
			// 종료하기
			if (correctCnt == 5) { // 정답을 맞춘 횟수가 다 채워지면 게임 종료
				System.out.println("게임 종료");
				break;
			}			
			
			// 카드 선택하기
			choiceCard();
		}
	}
	
}

public class MethodEx16_연습 {

	public static void main(String[] args) {

		MemoryGame mg = new MemoryGame();
		mg.run();

	}

}
