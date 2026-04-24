import java.util.*;

interface Demo{
	static void main(String [] args){
		
		HashMap hm = new HashMap();
		hm.put(1,10);
		hm.put(2,20);
		hm.put(3,20);
		
		System.out.println(hm);
	}
}

/*

Output:

{1=10, 2=20, 3=20}

Values can be duplicated, but keys cannot.

*/
