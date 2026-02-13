class CountDigit{
	public static void main(String []args){
		int num=12348788;
		int count = 0;
		while(num>0){
			int rem = num % 10;              // it find the remainder
			count++;
			num = num / 10;                  // it find the quotient
		}
		System.out.println(count);
	}
}