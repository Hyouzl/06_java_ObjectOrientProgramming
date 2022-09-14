package step6_02.method;

import java.util.Scanner;

class Ex05_pr{


	int sum = 0;
	void test1() {
		for(int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		int max = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("정수 입력 : ");
			arr[i] = scan.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("최댓값 : " + max);
		scan.close(); 
	}
	
}


public class MethodEx05_정답 {

	public static void main(String[] args) {

		
			Ex05_pr e = new Ex05_pr();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();
		


	}

}
