import java.util.*;

interface Demo{
	static void main(String [] args){
		HashSet<Integer> hs = new HashSet();
		hs.add(10);
		hs.add(20);

		System.out.println(hs.size());
		System.out.println(hs.contains(10));
		System.out.println(hs.remove(10));
		System.out.println(hs.isEmpty());
	
				
		System.out.println(hs);
	}
}

/*

Output:

2
true
true
false
[20]


*/