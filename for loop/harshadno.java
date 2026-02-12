class Harshadno{
	public static void main(String [] args){
		int num = 19;
		int orinum = num;
		int sum = 0;
		while( num > 0 ){
			int rem = num % 10 ;
			sum = sum + rem ;
   			num = num / 10 ;
		}
		if (orinum % sum == 0){
			System.out.println("harshad no");
		}
		else {
			System.out.println("not harshad no");
		}
	}
}