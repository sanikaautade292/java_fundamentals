import java.util.*;

interface Demo{
	static void main(String [] args){
		Stack s  = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);

		s.pop();

		System.out.println(s);
		
	}
}

/*

Output:

[10, 20]

*/