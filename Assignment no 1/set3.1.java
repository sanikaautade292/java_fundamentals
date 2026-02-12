import java.util.Scanner;
class Set3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int num1 = sc.nextInt();
		System.out.println("Enter Second no");
		int num2 = sc.nextInt();
		int sum = num1 + num2;	
		int sub = 0;
		if(num1>num2){
			sub = num1 - num2;
		}
		else{
			sub = num2 - num1;
		}
		System.out.println("addition is :"+sum);
		System.out.println("substaction is :"+ sub);
	}
}