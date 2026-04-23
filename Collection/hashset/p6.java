// Remove duplicates from the array using HashSet

import java.util.*;

interface Demo{
	static void main(String [] args){
		int arr[] = {1,1,2,3,3};
		
		HashSet<Integer> hs = new HashSet<>();

		for(Integer i :arr){
			hs.add(i);

		}
	
		System.out.println(hs);
	}
}

/*

Output:

[1, 2, 3]

*/