class Demo2{
	public static void main(String [] args){
	Employee e = new Employee();	
	}
}
class Company{
	Company(){
		System.out.println("in company Constructor ");
	}
}
class Employee extends Company{
	Employee(){
		System.out.println("in employee Constructor ");
	}
}

/*

Output:

in company Constructor
in employee Constructor

*/