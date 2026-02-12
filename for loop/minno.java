class Minno{
	public static void main(String [] args){
		int num = 9421;
		int min = 9;
		while(num > 0){
			int rem = num % 10;
			if ( min > rem ){
				min = rem ;
			}
			num = num / 10;
		}
		System.out.println(min);
	}
}