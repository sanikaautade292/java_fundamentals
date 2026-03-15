class Demo3{
	public static void main(String [] args){
		Employee e = new Employee();
		e.fun();
	}
}
class Company{
	int paise=1000;
}
class Employee extends Company{
	void fun(){
		System.out.println(this.paise);
		System.out.println(super.paise);
	}
}

/*

Output:

1000
1000

*/