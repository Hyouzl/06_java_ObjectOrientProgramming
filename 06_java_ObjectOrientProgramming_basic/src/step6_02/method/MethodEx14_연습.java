 package step6_02.method;

import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 메서드
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

class Theater{
	
	Scanner scan = new Scanner(System.in);

	int[] seat = new int[10];
	int bookCnt = 0;				
	int money = 0;					
	
	
	void showMenu() { // 메뉴 출력
		
		System.out.println("=== 메가박스 ===");
		System.out.println("1.예매하기");
		System.out.println("2.종료하기");
		
	}
	
	
	
	void showSeat() { // 좌석 배치 출력
		
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 0) {
				System.out.print(" [X] "); // 예약한 사람이 없을 경우 [X]로 출력 
			}
			else {
				System.out.print(" [O] "); // 예약한 자리인 경우 [O] 로 출력
			}
		}
		System.out.println();
	}
	
	
	
	void choiceSeat() {
		// 좌석 현황 출력하기
		showSeat();
		
		System.out.print("좌선번호를 선택하세요[1 ~ 10] : "); //좌석예매
		int idx = scan.nextInt() - 1;
		
		if (seat[idx] == 0) { // 예매되지 않은 좌석일 경우 
			seat[idx] = 1; // 예매한 좌석으로 변경 
			bookCnt++; // 예매된 좌석 수 업
			System.out.println("예매를 완료하였습니다.");
		}
		else { // 예매된 좌석인 경우 예매불가 메세지 출력
			System.out.println("이미 예매가 끝난 좌석입니다.");
		}
	}
	
	
	
	void showSales() {
		money = bookCnt * 12000; // 예매된 좌석 수 만큼 좌석 값 12000원 더해주기!
		System.out.println("총 매출 금액 = " + money + "원"); // 매출 출력
	}
	
	void run() {
		
		while (true) {
			
			// 메뉴 출력
			showMenu();
			
			// 메뉴 선택하기
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			// 예매하기
			if (choice == 1) {
				choiceSeat();
			}
			// 종료하기
			else if (choice == 2) {
				// 매출 현황 출력하기
				showSales();
				
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}
}

public class MethodEx14_연습 {

	public static void main(String[] args) {

		Theater megabox = new Theater();
		megabox.run();
		
	}

}
