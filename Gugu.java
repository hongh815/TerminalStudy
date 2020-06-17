public class Gugu{


	public static void main(String [] args) {


		System.out.println("============== 구구단 ==============");
		int num = 9;

		for(int i = 2; i<=num; i++) {

			System.out.println( i+ "단");
			for(int j = 1; j<=num; j++) {
	
				System.out.println(i +"x"+ j +" = "+(i*j));
			}
			System.out.println("// // // //");

		}

	}

}
