class Demo{
	public static void main(String [] args){
		Student s = new Student("sanika","pune");
		Student s1 = new Student("anju","Mumbai");
	
		s.display();
		s1.display();

		System.out.println("after few months");

		s.setAdd("sangli");
		s1.setAdd("satara");

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

	// setter or mutator method to update add

	void setAdd(String add){
		this.add = add;
	}
	
	void display(){
		System.out.println("Name :"+name +"  add :"+add);
	}
}




/*


*/