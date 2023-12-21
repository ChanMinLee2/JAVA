package hw11_2;

public class Point implements Resettable{
	// x, y 좌표 변수와 그 flag들로 사용할 origin 변수들, getter , setter
	private double x;
	private double y;
	private double xOrigin;
	private double yOrigin;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getxOrigin() {
		return xOrigin;
	}
	public void setxOrigin(double xOrigin) {
		this.xOrigin = xOrigin;
	}
	public double getyOrigin() {
		return yOrigin;
	}
	public void setyOrigin(double yOrigin) {
		this.yOrigin = yOrigin;
	}
	
	// 매개변수로 x y 좌표를 받아 초기화하는 생성자
	public Point(double x, double y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		xOrigin = x;
		yOrigin = y;
	}
	
	// 매개변수로 x y축 이동량을 받아 좌표이동하는 함수
	public void move(double xAmount, double yAmount) {
		x = x + xAmount;
		y = y + yAmount;
	}
	
	// toString override
	@Override
	public String toString() {
		return  "현재 위치의 x 좌표값 : " + x + ", 현재 위치의 y 좌표값 : " + y;
	}
	
	// reset override
	@Override
	public void reset() {
		x = xOrigin;
		y = yOrigin;
	}
	
	
	
	
	
}
