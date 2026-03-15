class Demo{
	public static void main(String [] args){
		Employee e = new Employee();
		e.fun();
		e.gun();		
	}
}
class Company{
	int paise=1000;
	void gun(){
		System.out.println(this.paise);
	}
}
class Employee extends Company{
	int paise=10;
	void fun(){
		System.out.println(this.paise);
	}
}

/*

Output:

10
1000

*/