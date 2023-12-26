package fruit_sale;

public class Seller {
	private int fruitCount;
	private int balance;
	private int revenue;
	private int fruitPrice;
	
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	
	public int getFruitPrice() {
		return fruitPrice;
	}
	
	public void sell(int fruitCount, Buyer buyer) {
		System.out.println("손님 " + buyer + "에게 과일판매를 시작합니다");
		if (this.fruitCount < fruitCount) {
			System.out.println("판매 가능 수량을 초과했습니다. 판매를 중지합니다.");
			return;
		}
		
		else {
			this.fruitCount -= fruitCount;
			balance += revenue * fruitCount;
			System.out.println("판매 완료되었습니다.");
		}
	}
	
	public Seller(int fruitPrice, int fruitCount) {
		// TODO Auto-generated constructor stub
		this.fruitPrice = fruitPrice;
		this.fruitCount = fruitCount;
		setRevenue(fruitPrice/10);
	}
	
	public void infoPrint() {
		System.out.println("현재 남은 과일 수는 : " + fruitCount + " 개 입니다.");
		System.out.println("현재 잔액은 : " + balance + " 원 입니다.");
	}
	
}
