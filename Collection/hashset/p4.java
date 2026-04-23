import java.util.*;

interface Demo{
	static void main(String [] args){
		HashSet<Integer> hs = new HashSet();
		hs.add(10);
		hs.add(20);
		
	
		for(Integer i:  hs){
			System.out.println(i);
		}
	
		Iterator<Integer> itr = hs.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println(hs);
	}
}

/*

Output:

20
10
20
10
[20, 10]

*/