class Add2{
	public static void main(String [] args){
		int sum = 0;
		int num = 384904;
 		while(num > 0){
			int rem = num % 10;
			if(rem % 2 == 0){
				sum = sum + rem;
			}
			num = num / 10;
		}
   		System.out.println(sum);
	}
}