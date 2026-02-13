class DigitNo{
	public static void main(String []args){
		int num=1234;
		while(num>0){
			int rem = num % 10;              // it find the remainder
			System.out.println(rem);
			num = num / 10;                  // it find the quotient
		}
	}
}