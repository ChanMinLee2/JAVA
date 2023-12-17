package hw11_1;

// 추상 클래스 Animal 선언 
public abstract class Animal {
	// 멤버 변수 name 선언, getter 생성
	private String name;
	public String getName() {
		return name;
	}

	// name을 매개변수로 초기화하는 생성자 메소드  
	public Animal(String name) {
		this.name = name;
	}

	// 추상 메소드 선언 
	abstract void sound(); 
}
