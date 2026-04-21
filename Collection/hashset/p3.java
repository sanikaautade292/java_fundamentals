import java.util.*;
class Demo{
	public static void main(String [] args){
		
		Student s1 = new Student("Raj", 80);
		Student s2 = new Student("Raj", 80);

		HashSet<Student> hs = new HashSet<>();
	
		hs.add(s1);
		hs.add(s2);

		System.out.println(hs);	
	}
}
class Student{
	String name;
	int  marks;

	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
}

/*

Output:

[Student@28a418fc, Student@5305068a]

*/
