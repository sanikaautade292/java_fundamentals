class Add{
 	public static void main(String [] args){
		int sum = 0;
		int num = 8293;
		while(num > 0){
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}
}			