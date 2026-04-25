// count frequency of an element

import java.util.*;

interface Demo{
	static void main(String [] args){
		int arr[] = {1,1,2,3,4,4};
		
		HashMap<Integer,Integer> hm = new HashMap();
		for(int i : arr){
			hm.put(i, hm.getOrDefault(i,0)+1);
		}
	
		System.out.println(hm);
	}
}

/*

Output:

{1=2, 2=1, 3=1, 4=2}

*/