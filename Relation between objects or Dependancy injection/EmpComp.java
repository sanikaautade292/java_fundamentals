class EmpComp{
	public static void main(String [] args){
		Company c1 = new Company("capg","sde");
		Company c2 = new  Company("AWS","fsd");
		Employee e1 = new Employee("sanika",9,c1);
		Employee e2 = new Employee("Khushi",10,c2);
	 	System.out.println("name is:"+e1.getName()+"  salary is:"+ e1.getsal()+"  Company name: "+ e1.getcompany().getcompName());
		System.out.println("name is:"+e2.getName()+"  salary is:"+ e2.getsal()+"  dept name : "+ e2.getcompany().getdept());
	}
}
class Company{
	String compName;
	String dept;
	
	Company(String compName, String dept){
		this.compName = compName;
		this.dept = dept;
	}

	String getcompName(){
		return compName;
	}
	
	String getdept(){
		return dept;
	}
}

class Employee{
	String Name;
	int sal;
	Company company;

	Employee(String Name, int sal, Company company){
		this.Name = Name ;
  		this.sal = sal ;
  		this.company = company;
	}

	String getName(){
		return Name;
	}
	int getsal(){
		return sal;
	}
	Company getcompany(){
		return company;
	}
}















	
