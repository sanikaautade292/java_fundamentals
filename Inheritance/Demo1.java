class Demo1{
	public static void main(String [] args){
		Child c = new Child();
		c.education();
	}
}
class Parent{
	int paise = 10;
}
class Child{
	int paise = 1000;
	void education(){
		System.out.println("............"+paise);
	}
}