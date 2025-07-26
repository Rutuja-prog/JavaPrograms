class ConstructorEx2{
	public static Void main ( String []args){
		Employee obj = new Employee (" Rutuja" ,10 ,40000);
		obj.displayEmp();
	}
}
class Employee{
	static String ename ;
	static int id;
	static double sal;
	
	//default Constructor
	Employee(){
		super();
	}

	//Parameterized constructor
	Employee(String ename,int id,double sal){
		super();
		this.ename=ename;
		this.id=id;
		this.sal=sal;

	}
	public void displayEmp(){
		System.out.println("Employee name "+ename);
		System.out.println("Employee id ");
		System.out.println("Employee salary " +sal);

	}
}
