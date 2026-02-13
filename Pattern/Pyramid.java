class Pyramid{
	public static void main(String [] args){
		int n=3;
		for(int i=1 ; i<=n ; i++){
			for(int j=1 ; j<=n-i ; j++){
				System.out.print("  ");
			}
			for(int k=1 ; k<=(i*2)-1 ; k++){                                         // k<i*2  it can be also be used
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}