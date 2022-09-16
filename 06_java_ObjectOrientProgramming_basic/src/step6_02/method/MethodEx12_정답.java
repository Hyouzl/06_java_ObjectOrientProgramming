package step6_02.method;

import java.util.Arrays;


class Ex12_pr {
	
	// 1. 절대값을 리턴하는 myABS 메서드를 만드시오.
	int myABS(int param) {
		
		
		if (param > 0 ) {
			return param;
		}
		else {
			return -(param);
		}
	}
	
	// 2. 이메일에 '@'가 있는지를 체크하는 checkEmailValidation 메서드를 만드시오.
	boolean checkEmailValidation(String email) {
		
		int i;
		for (i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				return true;
			}
		}
		
		return false;

	}
	
	// 3. 파일의 확장자를 리턴하는 getFileExtention 메서드를 만드시오.
	String getFileExtention(String fileName) {
		String fileExtention;
		
		for (int i = 0; i < fileName.length(); i++) {
			if (fileName.charAt(i) == '.') {
				fileExtention = fileName.substring(i);
				return fileExtention;
			}
		}
		
		return "";}
	
	// 4. 숫자의 제곱을 계산하여 리턴하는 myPow 메서드를 만드시오.
	int myPow(int param1 , int param2) {
		
		int num = 1;
		for (int i = 0; i < param2; i++) {
			num *= param1;
		}
		
		return num;}
	
	// 5. 문자열에 특정 문자의 위치를 리턴하는 myIndexOf 메서드를 만드시오.
	int myIndexOf(String data , String word) {
		
		int idx = 0;
		for (int i = 0; i < data.length(); i++) {
			String s = data.charAt(i) + "";
			if (s.equals(word)) {
				idx = i;
			}
		}
		
		return idx;}
	
	// 6. 문자열에 특정 위치의 문자를 리턴하는 myCharAt 메서드를 만드시오.
	char mycharAt(String data , int index) {
		
		
		for (int i = 0; i < data.length(); i++) {
			if (index==i) {
				return data.charAt(i);
			}
			
		}
		
		return '0';}
	
	// 7-1. 문자열의 특정위치부터 끝까지의 잘라진 문자열을 리턴하는 mySubString1 메서드를 만드시오.
	String mySubString1(String data , int startIndex) {
		
		char c = data.charAt(startIndex);	
		String subString = null;
		
		int j = 0;
		int idx = 0;
		String[] sub = new String[data.length()];
		
		for (int i = startIndex; i < data.length(); i++) {
			sub[j] = data.charAt(i) + "";
			if (j == 0) {
				subString = sub[j];
			}
			else {
				subString += sub[j];
			}
			j++;
		}
		
		return subString;}
	
	// 7-2. 문자열의 특정위치부터 특정위치까지의 잘라진 문자열을 리턴하는 mySubString2 메서드를 만드시오.
	String mySubString2(String data , int startIndex , int endIndex) {
		
		String s = null;
		String[] sub = new String[data.length()];
		
		for (int i = startIndex; i < endIndex; i++) {
			sub[i] = data.charAt(i) + "";
		}
		
		for (int i = 0; i < startIndex - endIndex; i++) {
			if (s != null) {
				s += sub[i];
			}
			else {
				s = sub[i];
			}
			
		}
		
		return s;}
	
	// 8. 문자열을 특정 키워드로 잘라내어 배열에 담아서 리턴하는 mySplit 메서드를 만드시오.
	String[] mySplit(String data , String sep) {
		
		String[] str = new String[data.length()];
		String[] splitStr = new String[data.length()];
		
	
		int idx1 = 0;
		int idx2 = 0;
		int k = 0;
		int l = 0;
		while (true) {
		
			for (int i = idx1; i < data.length(); i++) {
				if ((data.charAt(i)+"").equals(sep)) {
					idx2 = i;
				}
				for (int j = idx1; j < idx2; j++) {
					str[k] = data.charAt(j) + "";
					splitStr[l] += str[k];
					k++;
					}
			}
			
			idx1 = idx2;
			l++;
		}
	
	}

}
	



public class MethodEx12_정답 {

	public static void main(String[] args) {


		Ex12_pr e = new Ex12_pr();
		
		// 1. 절대값을 리턴하는 myABS 메서드를 만드시오.
		System.out.println(e.myABS(3));   // 3
		System.out.println(e.myABS(-3));  // 3 
		System.out.println(e.myABS(12));  // 12 
		System.out.println(e.myABS(-12)); // 12
		System.out.println();
		
		// 2. 이메일에 '@'가 있는지를 체크하는 checkEmailValidation 메서드를 만드시오.
		System.out.println(e.checkEmailValidation("qwer1234@naver.com"));    // true
		System.out.println(e.checkEmailValidation("qwer1234"));    			 // false
		System.out.println(e.checkEmailValidation("abcde@gmail.com"));    	 // true
		System.out.println(e.checkEmailValidation("abcde"));    			 // false
		System.out.println();
		
		// 3. 파일의 확장자를 리턴하는 getFileExtention 메서드를 만드시오.
		System.out.println(e.getFileExtention("1.jpg"));  			// jpg   
		System.out.println(e.getFileExtention("캡처.png"));  		// png  
		System.out.println(e.getFileExtention("수업자료.txt"));  		// txt  
		System.out.println(e.getFileExtention("프로젝트 제안서.pdf"));  // pdf   
		System.out.println();
		
		// 4. 숫자의 제곱을 계산하여 리턴하는 myPow 메서드를 만드시오.
		System.out.println(e.myPow(3, 2));	// 9
		System.out.println(e.myPow(4, 2));	// 16
		System.out.println(e.myPow(5, 3));	// 135
		System.out.println(e.myPow(7, 3));	// 189
		System.out.println();
		
		// 5. 문자열에 특정 문자의 위치를 리턴하는 myIndexOf 메서드를 만드시오.
		System.out.println(e.myIndexOf("just do it!", "j"));  // 0
		System.out.println(e.myIndexOf("just do it!", "s"));  // 2
		System.out.println(e.myIndexOf("just do it!", "i"));  // 8
		System.out.println(e.myIndexOf("just do it!", "!"));  // 10
		System.out.println();
		
		// 6. 문자열에 특정 위치의 문자를 리턴하는 myCharAt 메서드를 만드시오.
		System.out.println(e.mycharAt("just do it!", 0));    // j
		System.out.println(e.mycharAt("just do it!", 2));    // s
		System.out.println(e.mycharAt("just do it!", 8));    // i
		System.out.println(e.mycharAt("just do it!", 10));   // !
		System.out.println();
		
		// 7-1. 문자열의 특정위치부터 끝까지의 잘라진 문자열을 리턴하는 mySubString1 메서드를 만드시오.
		System.out.println(e.mySubString1("200107-1234567", 2));    // 0107-1234567
		System.out.println(e.mySubString1("200107-1234567", 4));	// 07-1234567
		System.out.println(e.mySubString1("200107-1234567", 7));	// 1234567
		System.out.println(e.mySubString1("200107-1234567", 10));	// 4567
		System.out.println();
		
		// 7-2. 문자열의 특정위치부터 특정위치까지의 잘라진 문자열을 리턴하는 mySubString2 메서드를 만드시오.
		System.out.println(e.mySubString2("200107-1234567", 0 , 2)); // 20
		System.out.println(e.mySubString2("200107-1234567", 2 , 4)); // 01
		System.out.println(e.mySubString2("200107-1234567", 4 , 6)); // 07
		System.out.println(e.mySubString2("200107-1234567", 0 , 6)); // 200107
		System.out.println();
		
		// 8. 문자열을 특정 키워드로 잘라내어 배열에 담아서 리턴하는 mySplit 메서드를 만드시오.
		System.out.println(Arrays.toString(e.mySplit("a,b,c", ",")));		  // [a, b, c]
		System.out.println(Arrays.toString(e.mySplit("a,b,c,e,f,g", ",")));   // [a, b, c, e, f, g]
		System.out.println(Arrays.toString(e.mySplit("a/b/c/e/f/g", "/")));   // [a, b, c, e, f, g]
		System.out.println(Arrays.toString(e.mySplit("goodsCd=1 & goodsNm=스마트 TV & goodsPrice=3000000 & orderQty=1 & ordererId=qwer1234", "&")));  // [goodsCd=1 ,  goodsNm=스마트 TV ,  goodsPrice=3000000 ,  orderQty=1 ,  ordererId=qwer1234]
	
		
	}

}
