import java.util.Scanner;
class Set333{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int num1 = sc.nextInt();
		System.out.println("Enter Second no");
		int num2 = sc.nextInt();
		int cu1=num1*num1*num1;
		int cu2=num2*num2*num2;
		int sq1=num1*num1;
		int sq2=num2*num2;		
		System.out.println("addition is :"+(cu1+cu2));
		System.out.println("substaction is :"+(sq1-sq2));
	}
}