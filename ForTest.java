public class ForTest {


	public static void main(String [] args) {



		int sum  = 0;
		
		for(int i=1; i <=10; i++) {
			sum = sum + i;

			System.out.println(sum);
		}
			System.out.println("최종 합은 : " +  sum);
	
		int sumwhile = 0;
		int i =1;
		while (i <= 10) {

			sumwhile = sumwhile + i;
			System.out.println("while 값으로 본 과정 : " + sumwhile);
			i+=1;

		}

		System.out.println(sumwhile);

		
		sumwhile = 0;
		i = 1;

		do {
			sumwhile = sumwhile + i;
			i +=1;
			System.out.println("do-while문으로 본 과정 : " + sumwhile);

		} while(i<=10);
	}

} 
