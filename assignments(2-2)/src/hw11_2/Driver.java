// ****************************************************************
// 파일명 : Driver.java
// 작성자 : 202010901 이찬민
// 작성일 : 2023.12.02
// 내용 : 인터페이스의 이해 
// ****************************************************************

package hw11_2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//과제 코드 출력
		System.out.println("hw11_2 이찬민");
		
		// BankAccount 객체 생성
		BankAccount myBankAccount = new BankAccount(1000);
		
		// 입금과 출금 시행 - 총 +300
		myBankAccount.deposit(500);
		myBankAccount.withdraw(200);
		
		// 현재 잔액 출력, 리셋 후 출력 - (toString()을 안붙이고 객체변수 이름만 써도 컴파일러가 붙여줌 
		System.out.println(myBankAccount.toString());
		myBankAccount.reset();
		System.out.println(myBankAccount.toString());
		
		// Point 객체 생성
		Point myPoint = new Point(1.5, 2.5);
		
		// 좌표 이동 2번
		myPoint.move(2.1, 2.1);
		myPoint.move(10.0, 10.0);
		
		// 현재 좌표 출력, 리셋 후 출력
		System.out.println(myPoint.toString());
		myPoint.reset();
		System.out.println(myPoint.toString());
	}

}
