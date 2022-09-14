package step6_02.method;


class Ex06_pr{
	int sum = 0;
	void test1(int x, int y) {
		
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		
		System.out.println(x + "부터" + y + "까지의 합 : " + sum);
	}
	
	
	
	
	void test2(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("최댓값 : " + max);
	}
	
	void test3(int[] arr, int idx1, int idx2) {
		int temp;
		
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}


public class MethodEx06_정답 {

	public static void main(String[] args) {
		
	
			Ex06_pr e = new Ex06_pr();
			
			// 문제 1) x부터 y까지의 합을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.test1(x, y);
			
			// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
			int[] arr = {87, 100, 35, 12, 46};
			e.test2(arr);
			
			// 문제 3) arr배열과 idx1 , idx2를 전달받아 idx1번째와 idx2번째를 교체한뒤 출력하는 메서드
			int idx1 = 1;
			int idx2 = 4;
			e.test3(arr, idx1, idx2);

	}

}
