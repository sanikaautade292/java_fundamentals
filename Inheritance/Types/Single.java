class Single{
	public static void main(String [] args){
		Employee e = new Employee("Sanika","Satara",10);
		System.out.println(" Name : "+e.getName()+ ", address : " +e.getadd()+ ", Id : " + e.getId());
	}
}

class Company{
	String name;
	String address;
	
	Company(String name, String address){
		this.name = name ;
		this.address = address;
	}

	String getName(){
		return name;
	}
	
	String getadd(){
		return address;
	}
}

class Employee extends Company{
	int Id;
	
	Employee(String name , String address, int Id){
		super(name,address);
		this.Id = Id;
	}
	
	int getId(){
		return Id;
	}

}