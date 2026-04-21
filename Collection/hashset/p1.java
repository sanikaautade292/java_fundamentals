import java.util.*;
class Demo{
	public static void main(String [] args){
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
	
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
30
[20, 10, 30]

*/