class Demo{
	public static void main(String [] args){
		Student s = new Student("sanika","pune");
		Student s1 = new Student("anju","Mumbai");
	
		s.display();
		s1.display();

		System.out.println("after few months");

		s.add = "sangli";
		s1.add = "satara";

		s.display();
		s1.display();		
	
	}
}

class Student{
	String name;
	String add;
	
	Student(String name, String add){
		this.name = name;
		this.add = add;
	}
	
	void display(){
		System.out.println("Name :"+name +"  add :"+add);
	}
}




/*

Output:

Name :sanika  add :pune
Name :anju  add :Mumbai
after few months
Name :sanika  add :sangli
Name :anju  add :satara




If add is private, then you cannot access it like this

private means:
It can be accessed only inside the same class (Student)
Not from another class like Demo

*/