public class Array {



	public static void main(String [] args) {
		
		int score [] = new int [5];
		String names [] = {"gi", "enegk", "geksl", "hhnge", "efmefl"};	

		System.out.println("score의 내부 인덱스 길이는 = " + score.length);
		System.out.println("names의 내부 인덱스 길이는 = " + names.length);

		for(int index=0; index < score.length; index++) {
			score[index] = (int)(Math.random()*100)+1;

			System.out.println("이름: " + names[index] + "의 점수는 " + score[index]+"\t");
		}
		System.out.println();

		int sum = 0;
		for(int i=0; i < score.length; i++) {

			sum = sum + score[i];
		}

		System.out.println("총점은 : " + sum);
		double avg = (double)sum / score.length;
		System.out.println("평균은 : " + avg);


	}
}
