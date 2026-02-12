class String7{
	public static void main(String [] args){
		String s = "Sanika";
		System.out.println(System.identityHashCode(s));
		String s1 = new String("khushi");
		System.out.println(System.identityHashCode(s1));
	}
}