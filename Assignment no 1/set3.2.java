import java.util.Scanner;
class Set33{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int num1 = sc.nextInt();
		System.out.println("Enter Second no");
		int num2 = sc.nextInt();
		int mul = num1 * num2;	
		int div = 0;
		if(num1>num2){
			div = num1 / num2;
		}
		else{
			div = num2 / num1;
		}
		System.out.println("multiplication is :"+mul);
		System.out.println("Division is :"+ div);
	}
}