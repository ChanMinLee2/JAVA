package hw11_1;

// 추상 메소드를 상속한 Dog 클래스 선언 
public class Dog extends Animal{
	
	// Dog 생성자 생성 - 상위 클래스의 명시적 생성자를 호출하기 위해 super()로 접근 
	public Dog(String input) {
		// TODO Auto-generated constructor stub
		super(input);
	}
	
	// 추상 클래스의 sound 메소드를 재정의 - 오버라이딩함. 
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍 " + getName());
	}
}
