// ****************************************************************
// 파일명 : FriendListTest.java
// 작성자 : 202010901 이찬민
// 작성일 : 2023.12.10
// 내용 : try-catch를 이용한 여러가지 예외 처리를 연습한다.
// ****************************************************************

package hw13_1;

import java.util.Scanner;

public class FriendListTest {
	public static void main(String[] args) {
		
		// try - catch 예외 처리 진행 (모든 코드를 감싸서 함)
		try {
			// 과제 코드 출력
			System.out.println("hw13_1: 이찬민");
			
			// 입력을 위한 스캐너 생성 
			Scanner scan = new Scanner(System.in);
			
			// friend class 객체 생성 
			FriendList friendList = new FriendList();
			
			// 번호 입력
			System.out.print("번호 입력: ");
			int number = scan.nextInt();
			
			// friend 객체로 배열에 접근함
			String name = friendList.get(number);
			System.out.println(number + "번에 등록된 친구는 " + name);
			
			// scanner 사용 종료
			scan.close();
			
		}
		// 만약 오류 타입이 index out인 경우
		catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("입력한 번호가 범위를 벗어났습니다.");
			return;
			
		} 
		// 만약 오류 타입이 input mismatch인 경우
		catch (java.util.InputMismatchException e) {
			System.out.println("번호로 정수값을 입력해야 합니다.");
		}

	}
}
