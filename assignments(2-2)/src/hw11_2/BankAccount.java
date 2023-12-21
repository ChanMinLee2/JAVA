package hw11_2;

public class BankAccount implements Resettable {
	// 잔액 변수, reset의 기준 변수 ,getter, setter
	private int balance;
	private int resetFlag;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getResetFlag() {
		return resetFlag;
	}

	public void setResetFlag(int resetFlag) {
		this.resetFlag = resetFlag;
	}

	// 잔액을 매개변수로하여 초기화하는 생성자
	public BankAccount(int balance)
	{
		this.balance = balance;
		resetFlag = balance;
	}
	
	// 입금 메소드
	public void deposit(int amount) {
		// 잔액 + 입금액으로 잔액 재설정
		balance = balance + amount;
	}
	
	// 출금 메소드
	public int withdraw(int amount) {
		// 잔액 - 출금액으로 잔액 재설정 - 조건 불만족 시 오류 메세지
		if(balance >= amount)
		{
			balance = balance - amount;
		}
		else {
			System.out.println("잔액이 부족하여 출금진행을 취소합니다.");
			return 0;
		}
		
		// 출금액 반환
		return amount;
	}
	
	// toString override (입력없고 문자열반환)
	@Override
	public String toString() {
		return "현재 잔액은 "+getBalance()+"입니다.";
	}
	
	// Resettable 구현에 따른 추상메소드 override
	@Override
	public void reset() {
		// 잔액변수를 객체 생성 당시의 초기값으로 재설정 
		balance = resetFlag;
	}
	
	

	
}
