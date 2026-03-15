class Demo4{
	public static void main(String [] args){
		Employee e = new Employee();
		e.fun();
		e.gun();		
	}
}
class Company{
	int paise=1000;
	void gun(){
		System.out.println(this);
	}
}
class Employee extends Company{
	int paise=10;
	void fun(){
		System.out.println(this);
	}
}

/*

Output:

Employee@5305068a
Employee@5305068a

*/

