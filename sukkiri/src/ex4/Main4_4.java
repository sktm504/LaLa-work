package ex4;

public class Main4_4 {

	public static void main(String[] args) {
		
	 int[] numbers = new int[2];
	 numbers[0] = new java.util.Random().nextInt(9)+1;
	 numbers[1] = new java.util.Random().nextInt(9)+1;
	    while(numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
		  numbers[1] = new java.util.Random().nextInt(9)+1;
		  numbers[2] = new java.util.Random().nextInt(9)+1;	    }  
	System.out.println("一桁の数字を入力してください");
	System.out.println(numbers[0]);
	System.out.println(numbers[1]);
	int input = new java.util.Scanner(System.in).nextInt();
	 	for(int num : numbers) {
		  if (input == num) {
			System.out.println("アタリ！");
			break;
		  } else {
			System.out.println("はずれ！");
		}
	 	}	  
	}
}