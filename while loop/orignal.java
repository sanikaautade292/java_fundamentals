class Org{
	public static void main(String [] args){
		int rev = 0;
		int rev2 = 0;
		int num = 6579597;
		while(num > 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		while(rev > 0){
			int rem2 = rev % 10;
			rev2 = rev2 * 10 + rem2;
			rev = rev / 10;
		}
		System.out.println(rev2);
	}
}
			