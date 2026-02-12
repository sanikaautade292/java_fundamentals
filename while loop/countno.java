class Count{
	public static void main(String [] args){
		int cont = 0;
		int num = 483967;
		while(num > 0){
			cont++;
   			num = num / 10;
 		}
  		System.out.println(cont);
	}
}