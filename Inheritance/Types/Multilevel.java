class Multilevel{
	public static void main(String [] args){
		Manager m = new Manager("Sanika",38,"SDE");

		System.out.println("name: "+m.getName()+" , Id: "+m.getId()+" , dept :"+m.getdept());
	}
}
class Company{
	String name;
	Company(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
}

class Employee extends Company{
	int Id;
	
	Employee(String name, int Id){
		super(name);
		this.Id = Id;
	}

	int getId(){
		return Id;
	}
}

class Manager extends Employee{
	String dept ;

	Manager(String name, int Id, String dept){
		super(name,Id);
		this.dept = dept;
	}

	String getdept(){
		return dept;
	}
}


/*

Output:

name: Sanika , Id: 38 , dept :SDE

*/






















