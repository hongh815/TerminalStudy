package chap15;
//Generit 의 활용과 <T> 타입을 이용하여 Object타입이 아닌 능동적 변경가능한 타입으로 코딩을 간단화 할수 있게 한다/.
class Apple{
	int amount; //갯수
	String origin; //원산지
	public Apple(int amount, String origin) {
		this.amount=amount;
		this.origin=origin;
		// TODO Auto-generated constructor stub
	}
}
class Paper{
	String size; // a4, ....
	public Paper(String size) {
		this.size=size;
	}
}
//<T>라은 타입으로 지정후 앞으로 우리가 커스터마이징하는 타입으로 능동적 변경이 가능하게 한다.
class Box<T>{
	T contents; //타입이 Apple이 될수도, Paper가 될수도 있게 하기 위해
	public Box(T contents) {
		this.contents=contents;
	}
}
public class GenericTest {

	public static void main(String[] args) {
		Apple apple = new Apple(20, "경북");
		Paper paper = new Paper("A4");

		Box<Apple> applebox = new Box<Apple>(apple);
		Box<Paper> paperbox = new Box<Paper>(paper);
		System.out.println("원산지 " + applebox.contents.origin + " 인 사과 " + applebox.contents.amount + "개만큼 들어있습니다.");
		System.out.println("크기= " + paperbox.contents.size + " 크기의 종이가 들어있습니다.");		
	
		
	//	Box b = new Box(paper);

//		Box b = new Box(apple);
		
/*		if(b.contents instanceof Apple) {
			System.out.println("원산지 " + ((Apple)b.contents).origin + " 인 사과 " + ((Apple)b.contents).amount + "개만큼 들어있습니다.");
		}
		else if(b.contents instanceof Paper) {
			System.out.println("원산지 " + ((Paper)b.contents).size + " 크기의 종이가 들어있습니다.");		
		}*/ // <T> 타입을 이용하면 if문이 ㅍ필요 없다
	}

}
