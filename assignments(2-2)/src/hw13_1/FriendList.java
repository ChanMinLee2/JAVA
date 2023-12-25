package hw13_1;

// friendList class - 3개의 이름을 저장하는 리스트를 가지고있는 클래스
public class FriendList {
	private String[] list = {"kim", "park", "lee"};
	// private list에 접근하는 메소드
	public String get(int number) {
		return list[number-1];
	}
}
