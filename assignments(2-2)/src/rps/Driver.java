// ****************************************************************
// 파일명 : Driver.java
// 작성자 : 202010901 이찬민
// 작성일 : 2023.12.09
// 내용 : String 클래스 사용을 연습한다.
// ****************************************************************

// 패키지 생성 - 이클립스로 진행
package rps;

// 자바 유틸리티 패키지 import 
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a개수를 세는 변수 aNum, 문자열 입력을 위한 scanner, 문자열 작업을 위한 string 변수 2개 생성
		// 메인 메소드의 변수라서 한정자는 붙이지 않았음 
		int aNum = 0;
		Scanner scanner = new Scanner(System.in);
		String inputString;
		String resultString = "";
		
		// 과제코드 출력
		System.out.println("hw12_1 : 이찬민");
		
		// 문장 입력받기 - scanner.nextLine()사용
		System.out.print("문장 입력 : ");
		inputString = scanner.nextLine();
		
		// 입력받은 문자열에서 a, A 문자 개수를 체크하는 루프
		for(int i = 0; i < inputString.length(); i++)
		{
			if(inputString.charAt(i) == 'a' || inputString.charAt(i) == 'A')
			{
				aNum++;
			}
		}
		System.out.println("a 또는 A의 개수 = " + aNum);
		
		// 입력받은 무자열에서 a, A를 *로 치환하는 replace 작업
		resultString = inputString.replace("a", "*");
		resultString = resultString.replace("A", "*");
		
		System.out.println(resultString);
		
		// scanner 사용 종료
		scanner.close();
	}
}
