package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03_pr{
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_정답 {

	public static void main(String[] args) {
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		int len = new Ex03_pr().arr.length;
		int arr[] = new Ex03_pr().arr;
		int sum = 0;

		for (int i = 0; i < len; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		sum = 0;
		for (int i = 0; i<len; i++) {
			if (arr[i] % 4 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println(sum);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		int count = 0;
		for (int i = 0; i<len; i++) {
			if (arr[i] % 4 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		
		count = 0;
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		for (int i = 0; i<len; i++) {
			if(arr[i] % 2 == 0) {
				count++;
			}
		}
		
		System.out.println(count);
		


	}

}
