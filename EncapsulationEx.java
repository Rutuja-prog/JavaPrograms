class EncapsulationEx{
	public static void main(String[] args) {
		Customer obj = new Customer();
		obj.setName("Yashvant");
		obj.setAge(45);
		System.out.println("Name:"+obj.getName());
		System.out.println("Age:"+obj.getAge()); 
	}
}
class Customer
{

	private static String name;
	private static int age;


	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age= age;
	}

}