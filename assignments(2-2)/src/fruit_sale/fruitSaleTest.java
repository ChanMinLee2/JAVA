package fruit_sale;

public class fruitSaleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seller seller1 = new Seller(1000,3);
		Buyer buyer1 = new Buyer(2000);
		
		buyer1.infoPrint();
		seller1.infoPrint();
		buyer1.buy(2, seller1);
		seller1.sell(2, buyer1);
		buyer1.infoPrint();
		seller1.infoPrint();
	}

}
