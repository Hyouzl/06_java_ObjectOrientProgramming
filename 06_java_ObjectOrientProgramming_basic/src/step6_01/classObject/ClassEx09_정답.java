package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;
/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */


class Ex09_pr{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}

public class ClassEx09_정답 {

	public static void main(String[] args) {	
		
		Ex09_pr ex9 = new Ex09_pr();
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		int i = 0;
		while(i < 10) {
			
			int num = ran.nextInt(10);
			if (ex9.front[num] != 0) {
				arr[i] = ex9.front[num];
				ex9.front[num] = 0;
				i++;
			}
		}
		
		
		int pickNum1 , pickNum2;
		while(ex9.answerCnt <= 5) {
			
			for (int j = 0; j < 10; j++) {
				if (arr[j] == 1) {System.out.print("♤\t");}
				else if (arr[j] == 2) {System.out.print("△\t");}
				else if (arr[j]==3) {System.out.print("△\t");}
				else if (arr[j]==4) {System.out.print("○\t");}
				else if (arr[j]==5) {System.out.print("□\t");}
			}
			
			System.out.println();
			
			for (int j = 0; j < 10; j++) {
				if (ex9.back[j] == 1) {System.out.print("♤\t");}
				else if (ex9.back[j] == 2) {System.out.print("△\t");}
				else if (ex9.back[j]==3) {System.out.print("△\t");}
				else if (ex9.back[j]==4) {System.out.print("○\t");}
				else if (ex9.back[j]==5) {System.out.print("□\t");}
				else {System.out.print("■\t");}
			}
			
			System.out.println();
			System.out.print("인덱스1 입력 : ");
			pickNum1 = scan.nextInt(10);
			System.out.print("인덱스2 입력 : ");
			pickNum2 = scan.nextInt(10);
			

			
			
			if (pickNum1 != pickNum2 && arr[pickNum1] == arr[pickNum2]) {
				ex9.back[pickNum1] = arr[pickNum1];
				ex9.back[pickNum2] = arr[pickNum2];
				ex9.answerCnt++;
			}
			
			else {
				continue;
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
