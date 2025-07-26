import java.util.Scanner;
class Exception{
	public static void main ( String []args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter first Number:");
		int a =  sc.nextInt();
		System.out.print("Enter second Number:");
		int b = sc.nextInt();

		try{
			System.out..println(a/b);
		}
		catch(ArithmeticException ae){
			System.out.println("arithmatic exception is handled")
		}



	}

}