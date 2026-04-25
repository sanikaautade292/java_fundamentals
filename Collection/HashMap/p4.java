import java.util.*;

interface Demo{
	static void main(String [] args){
		HashMap<Integer,Integer> hm = new HashMap();
		hm.put(1,10);
		hm.put(2,20);
		hm.put(3,30);
		hm.put(2,20);

		for(Map.Entry<Integer,Integer>Map : hm.entrySet()){
			System.out.println(Map.getValue());
		}
	}
}


/*

Output:

10
20
30

*/