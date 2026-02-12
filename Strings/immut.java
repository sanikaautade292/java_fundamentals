class Immutable{
	public static void main(String [] args){
		String s = "sanika";
		System.out.println(System.identityHashCode(s));
		String s1 = "Autade";
		s = s + s1;
		System.out.println(System.identityHashCode(s));
		String s2 = "sanikaAutade";
		System.out.println(System.identityHashCode(s));
	}
}