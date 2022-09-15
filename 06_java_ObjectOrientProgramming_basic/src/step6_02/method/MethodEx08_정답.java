package step6_02.method;

class Ex08_pr {
	
	void printSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	void printSumMultiple4(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println(sum);
		
	}
	void printCountMultiple4(int[] arr) {
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}


public class MethodEx08_정답 {

	public static void main(String[] args) {
		
		int[] arr = { 87, 100, 11, 72, 92 };
	

		
		Ex08_pr ex08 = new Ex08_pr();
		
		
		// 문제 1) arr요소의 전체 합을 출력하는 메서드
		// 정답 1) 362
		
		ex08.printSum(arr);
		

		// 문제 2) 4의 배수의 합을 출력하는 메서드
		// 정답 2) 264
		
		ex08.printSumMultiple4(arr);
		

		// 문제 3) 4의 배수의 개수를 출력하는 메서드
		// 정답 3) 3
		ex08.printCountMultiple4(arr);
		

	}

}
