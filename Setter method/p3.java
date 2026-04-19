class Demo{
	public static void main(String [] args){
		Student s1 = new Student("sai","pune");
		Student s2 = new Student("jui","satara");
		System.out.println("name is: "+s1.name+" add is :"+s1.add);
		System.out.println("name is: "+s2.name+" add is :"+s2.add);
		

		System.out.println("after some time address changed");
		
		s1.setAdd("satara");
		s2.setAdd("Mumbai");

		System.out.println("name is :"+s1.name+ " add is :"+s1.add);
		System.out.println("name is :"+s2.name+ " add is :"+s2.add);
	}
}
class Student{
	String name ;
	String add ;
	
	Student(String name , String add){
		this.name = name;
		this.add = add;
	}
	
	void setAdd(String add){
		this.add = add;
	}
}


/*

Output:

name is: sai add is :pune
name is: jui add is :satara
after some time address changed
name is :sai add is :satara
name is :jui add is :Mumbai

*/



