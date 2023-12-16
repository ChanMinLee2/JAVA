/* 상속
 * Person 클래스를 설계하라. Person 클래스는 이름, 주소, 전화번호를 필드로 가진다.
 * 하나 이상의 생성자를 정의하고 각 필드에 대하여 접근자와 설정자 메소드를 작성하라.
 * 이어서 Person을 상속받아서 Customer를 작성하여 보자. Customer는 고객 번호와 마일리지를 필드로 가지고 있다.
 * 한 개 이상의 생성자를 작성하고 적절한 접근자 메소드와 설정자 메소드를 작성한다.
 * 이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래스를 작성하라.
 */

package practice_for_lastTest;

class Person{
	private String name;
	private String address;
	private String phoneNumber;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Person(String name, String address, String phoneNumber) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name + ", 주소 : " + address + ", 전화번호 : " + phoneNumber;
	}
}

class Customer extends Person{
	private int customerNum;
	private int mileage;
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}
	
	public Customer(String name, String address, String phoneNum, int customerNum, int mileage) {
		// TODO Auto-generated constructor stub
		super(name, address, phoneNum);
		this.customerNum = customerNum;
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", 고객번호 : " + customerNum + ", 마일리지 : " + mileage;
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", "경기도 안산시", "010-1234-5678");
		Customer customer1 = new Customer("김철수", "경기도 시흥시", "010-3214-1023", 1, 100);
		
		System.out.println(person1.toString());
		System.out.println(customer1.toString());
	}
}

