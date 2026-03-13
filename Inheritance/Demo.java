class Demo{
	public static void main(String [] args){
		Child c = new Child();
		c.education();
	}
}
class Parent{
	int paise = 10;
	
}
class Child extends Parent{
	void education(){
		System.out.println("........."+paise);
	}
}


/*

Output:

.........10

*/	