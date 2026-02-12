class String5{
	public static void main(String [] args){
		String s = "Sanika";
		System.out.println(System.identityHashCode(s));
		String s1 = "Sanika";
		System.out.println(System.identityHashCode(s1));
	}
}