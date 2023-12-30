package fruit_sale;

public class Buyer {
	private int fruitCount;
	private int balance;
	
	public void buy(int fruitCount, Seller seller) {
		System.out.println("판매자 " + seller + "에게 과일 구매를 시작합니다.");
		if (balance < fruitCount * seller.getFruitPrice()) {
			System.out.println("현재 잔액을 초과하여 구매가 불가능합니다. 구매를 중지합니다.");
		}
		else {
			this.fruitCount += fruitCount;
			balance -= fruitCount * seller.getFruitPrice();
			System.out.println("구매 완료되었습니다.");
		}
	}
	
	public Buyer(int balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
	}
	
	public void infoPrint() {
		System.out.println("현재까지 구매한 과일 수는 : "+ fruitCount + " 개 입니다");
		System.out.println("현재 잔액은 : " + balance + " 원 입니다.");
	}
}
