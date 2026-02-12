class String8{
	public static void main(String [] args){
		String s = new String("Sanika");
		System.out.println(System.identityHashCode(s));
		String s1 = new String("khushi");
		System.out.println(System.identityHashCode(s1));
	}
}