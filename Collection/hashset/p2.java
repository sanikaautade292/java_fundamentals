import java.util.*;
class Demo{
	public static void main(String [] args){
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(26);
		hs.add(42);

		for(Integer i : hs){
			System.out.println(i);
		}
		System.out.println(hs);
	}
}

/*

Output:

20
10
26
42
30
[20, 10, 26, 42, 30]

*/
