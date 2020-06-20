abstract class Shape{

	abstract void area();
	abstract void circum();
}

class Rectangle extends Shape{


	int width;
	int height;

	@Override
	void area() {
		System.out.println("가로:" + width + ", 세로:" + height + " 인 사각형의 넓이는 : " + (width
*height)+ " 이다.");
	}

	@Override
	void circum() {
		System.out.println("가로:" + width + ", 세로:" + height + " 인 사각형의 둘레는 : " +2*(width+height)+ " 이다.");
	}

	public Rectangle(int width, int height) {

		this.width = width;
		this.height = height;
	}
}

class Circle extends Shape{

	int radius;
	final double pi = 3.14;
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	void area() {
		System.out.println("반지름은:" + radius + "인 원의 면적은 :" + radius*radius*pi);
	}

	@Override
	void circum() {
		System.out.println("반지름은:" + radius + "인 원의 둘레는 :" + 2*radius*pi);
	}
}
		

public class AbstractT{

	public static void main(String[] args) {


		Shape s = new Rectangle(25, 20);
		Shape s1 = new Circle(45);

		s.area();
		s.circum();

		s1.area();
		s1.circum();



	}
}
