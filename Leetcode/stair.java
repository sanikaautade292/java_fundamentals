import java.util.Scanner;
class Stairs{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter steps");
		int n = sc.nextInt();
		if(n==1){
			System.out.println("ways =1");
		}
		else if(n==2){
			System.out.println("ways =2");
		}
		else{
			int a=1;
			int b=2;
			int c=0;
			for(int i=3; i<=n ; i++){
				c = a + b;
				a = b;
				b = c;
			System.out.println("ways = "+c);
			}
		
		}
	}
}
		
		