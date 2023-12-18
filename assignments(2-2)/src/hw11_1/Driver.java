// ****************************************************************
// 파일명 : Driver.java
// 작성자 : 202010901 이찬민
// 작성일 : 2023.11.26
// 내용 : 상속과 추상클래스의 이해 
// ****************************************************************

package hw11_1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 생성 및 초기화 
		Dog myDog = new Dog("골든 리트리버");
		Person myPerson = new Person("이찬민");
		
		// 과제 코드 출력
		System.out.println("hw11_1 : 이찬민");
		
		// 객체의 sound 메소드 실행
		myDog.sound();
		myPerson.sound();
	}

}
