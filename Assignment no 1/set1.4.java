import java.util.Scanner;
class Set1111{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ten number");
		int count = 0;
		int sum = 0;
		int avg = 0;
		for(int i = 1; i<=10 ; i++){
			int num = sc.nextInt();
			sum = sum + i;
			count++;
			avg = sum / count;
		}
		System.out.println("sum is " + sum);
		System.out.println("average is "+ avg);
	}
}
		
		
		