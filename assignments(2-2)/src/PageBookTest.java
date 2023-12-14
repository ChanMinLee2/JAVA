// ****************************************************************
// ���ϸ� : PageBookTest.java
// �ۼ��� : 202010901 ������
// �ۼ��� : 2023.11.17
// ���� : Book Ŭ������ ����ϴ� PageBook Ŭ������ �����ϰ� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ****************************************************************

class Book {
	private String title;	// ����
	private int price;	// ����

	// title�� ���� getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// price�� ���� getter, setter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

// Book Ŭ������ ��ӹ��� PageBookŬ����
class PageBook extends Book{
	private int page; // ������ �� 

	// page�� ���� getter, setter
	public int getPage() {
		return page;
	}

	// this.page��� �����ؼ� �޼ҵ� ���� page�� �ƴ� Ŭ����(this) ���� page�� ����
	public void setPage(int page) {
		this.page = page; 
	}
	
	// ���� �޼ҵ�
	public void discount() {
		setPrice(getPrice()/2);
	}
}

public class PageBookTest {
	public static void main(String[] args) {
		
		// �����ڵ�� �̸� ���
		System.out.println("hw10_1: ������");
		
		// PageBook ��ü book ���� �� �����鿡 �� �Ҵ�
		PageBook book = new PageBook();
		book.setTitle("java");
		book.setPrice(10000);
		book.setPage(200);
		
		// ���� �޼ҵ� ����
		book.discount();
		
		// ���� �� ��ü book�� ������ �� ���
		System.out.println("���� book�� ���� : " + book.getTitle());
		System.out.println("���� book�� ���� : " + book.getPrice()); 
		System.out.println("���� book�� ������ �� : " + book.getPage());
		
	}
}
