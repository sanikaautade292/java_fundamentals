class String4{
	public static void main(String [] args){
		String s = "sanika";
		System.out.println(System.identityHashCode(s));
		String s1 = new String("Sanika");
		System.out.println(System.identityHashCode(s1));
	}
}