package paint;

public class ColorPoint extends Point { // 상속에서 생성자!
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
//		System.out.println("점(x=" + x + ", y=" + y + ")을 그렸습니다."); // 부모클래스에서 x,y가 private이기때문에 x,y에 오류!
		System.out.println("점(x=" + getX() + 
				", y=" + getY() +
				", color="+ color +
				")을 그렸습니다.");
	}
	
}
