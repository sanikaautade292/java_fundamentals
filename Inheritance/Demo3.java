class Demo3{
	public static void main(String [] args){
		Employee e = new Employee();
		Company c = new Company();	
	}
}
class Company{
	Company(){
		System.out.println("in Comapany");
	}
}
class Employee extends Company{
	Employee(){
		System.out.println("in Employee");
	}
}

/*

Output:

in Comapany
in Employee
in Comapany

*/