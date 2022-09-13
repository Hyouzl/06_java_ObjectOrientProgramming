package step6_01.classObject;

import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */


class Ex08_pr{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}



public class ClassEx08_정답 {

	public static void main(String[] args) {
		Ex08_pr ex8 = new Ex08_pr();
		
		Scanner scan = new Scanner(System.in);
		int len = ex8.game.length;
		int playerIdx = 0;
		
		
	
		
		while(true) {
			
			for (int i = 0; i < len; i++)  {
				if (ex8.game[i] == 2) {
					ex8.game[i] = 0;
				}
				else if (playerIdx == i) {
					ex8.game[i] = 2;
				}
			}

		
		for (int i = 0; i < len; i++) {
			System.out.print(ex8.game[i] + " ");
		}
		System.out.println();
		System.out.print("1.left 2.right : ");
		int num = scan.nextInt();
	
		if (num == 1) {
			
			if (playerIdx-1 < 0) {
				playerIdx += len-1;
			}
			else if (ex8.game[playerIdx-1] == 1) {
				System.out.println("3.punch : ");
				int punch = scan.nextInt();
				if (punch == 3) {
					playerIdx --;
					ex8.game[playerIdx] = 0;
				}
			}
			else {
				playerIdx--;
			}
			
			ex8.game[playerIdx] = 2;
		
			
		}
		else if (num == 2) {
			if (playerIdx + 1 == len) {
				playerIdx -= (len-1);
			}
			else if (ex8.game[playerIdx+1] == 1) {
				System.out.println("3.punch : ");
				int punch = scan.nextInt();
				if (punch == 3) {
					playerIdx ++;
					ex8.game[playerIdx] = 0;
				}
			}
			else {
				playerIdx++;
			}
		}
		
		}
		
		
	}

}
