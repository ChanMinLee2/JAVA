// ****************************************************************
// 파일명 : PageBookTest.java
// 작성자 : 202010901 이찬민
// 작성일 : 2023.11.17
// 내용 : Book 클래스를 상속하는 PageBook 클래스를 정의하고 이용하는 프로그램을 작성하시오.
// ****************************************************************

class Book {
	private String title;	// 제목
	private int price;	// 가격

	// title에 대한 getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// price에 대한 getter, setter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

// Book 클래스를 상속받은 PageBook클래스
class PageBook extends Book{
	private int page; // 페이지 수 

	// page에 대한 getter, setter
	public int getPage() {
		return page;
	}

	// this.page라고 접근해서 메소드 변수 page가 아닌 클래스(this) 변수 page에 접근
	public void setPage(int page) {
		this.page = page; 
	}
	
	// 할인 메소드
	public void discount() {
		setPrice(getPrice()/2);
	}
}

public class PageBookTest {
	public static void main(String[] args) {
		
		// 과제코드와 이름 출력
		System.out.println("hw10_1: 이찬민");
		
		// PageBook 객체 book 생성 및 변수들에 값 할당
		PageBook book = new PageBook();
		book.setTitle("java");
		book.setPrice(10000);
		book.setPage(200);
		
		// 할인 메소드 적용
		book.discount();
		
		// 할인 후 객체 book의 변수들 값 출력
		System.out.println("현재 book의 제목 : " + book.getTitle());
		System.out.println("현재 book의 가격 : " + book.getPrice()); 
		System.out.println("현재 book의 페이지 수 : " + book.getPage());
		
	}
}
