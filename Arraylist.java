import java.util.ArrayList;
class Arraylist{
	public static void main(String[]arga){
		ArrayList<String>obj = new ArrayList<String>();
		obj.add("BMW");
		obj.add("FORD");
		obj.add("Volvo");
		obj.add("KIA");
		obj.add("SWIFT");
		System.out.println(obj);

		System.out.println("---------------");

		obj.add(3,"rolls royce");
		System.out.println(obj);

		System.out.println("------------");

		System.out.println(obj.get(3));

	}
}