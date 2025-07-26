import java.util.*;
class BankDriver{
	static Customer cust;
	static ArrayList<String> statement = new ArrayList<String>();
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for( ; ;)
		{
         System.out.println();
         System.out.println("         **WELCOME***");
         System.out.println("  LAXMI CHIT FUND ");
         System.out.println();
         System.out.println("1. Existing User ");
         System.out.println("2. New Account ");
         System.out.println();
         System.out.println("Enter an option: ");

         int opt = sc.nextInt();
         System.out.println();

        switch(opt)
          {
         case 1 :login(sc);break;
         case 2 :createAccount(sc);break;
         default : System.out.println("INVALID OPTION"); break;
          }
		}
	}
	public static void login(Scanner sc){
		if(cust == null){
			System.out.println("Create Your Account ");
			return ;
		}else{
			System.out.println("  LOGIN  ");
			System.out.println();
		}
		for(int i =3 ; i>= 1 ; i--){
			System.out.println("Phone: ");
			long userPhone = sc.nextInt();
			System.out.println("Pin: ");
			int userPin =sc.nextInt();

			if(userPin == cust.getPin()){
				homePage(sc);
			}else{
				System.out.println("INVALID PIN");
				System.out.println("Attempts left : "+(i-1));
			}
		}
		System.out.println("YOUR ACCOUNT IS BLOCKED FOR 48 HOURS");
		System.exit(0);
	}
	public static void createAccount(Scanner sc)
	{
		System.out.println("    CREATE ACCOUNT");
		System.out.println();
		sc.nextLine();
		System.out.println("Name: ");
		String name =sc.nextLine();
		System.out.println("Email: ");
		String email =sc.next();
		System.out.println("Address: ");
		String address =sc.nextLine();
		sc.nextLine();
		System.out.println("Contact: ");
		long contact =sc.nextLong();
		System.out.println("Adhar NUmber: ");
		long adhar = sc.nextLong();
		System.out.println("Pan Number: ");
		String pan =sc.next();
		sc.nextLine();
		System.out.println("Deposit Amount : ");
		double amount =sc.nextDouble();
		sc.nextLine();
		statement.add("Deposit : "+ amount+ "Account Creations");
		System.out.println("pin: ");
		int pin =sc.nextInt();

		cust = new Customer(name ,address ,email, contact, adhar, pan, amount ,pin);
		System.out.println("Account created Succesfully: ");

	}
	public static void homePage(Scanner sc)
	{
		for( ; ;){
			System.out.println();
			System.out.println("          HOME PAGE     ");
			System.out.println();
			System.out.println("1. Deposit Amount ");
			System.out.println("2. withdraw Amount ");
			System.out.println("3. Check Balance  ");
			System.out.println("4. Statement  ");
			System.out.println("5. Edit Profile ");
			System.out.println("6. Log Out ");
			System.out.println();
			System.out.println("Enter an option: ");

			int opt = sc.nextInt();
			System.out.println();

			switch(opt){
			case 1 :depositAmount(sc); break;
			case 2 :withdrawAmt(sc); break;
			case 3 :checkBalance(sc); break;
			case 4 :statement(); break;
			case 5 :editProfile(sc); break;
			case 6 :System.out.println("THANK U , VISIT AGAIN");break;
			default: System.out.println("INVALID OPTION");

			}
		}

	}
	public static void depositAmount(Scanner sc)
	{
        System.out.println("          Deposit Amount    ");
		System.out.println();
		System.out.println("Amount ");
		double deptAmt =sc.nextDouble();
		cust.setBalance(deptAmt + cust.getBalance());
		System.out.println("Amount deposited Succesfully");
		statement.add("Deposit : "+deptAmt);
	}
	public static void withdrawAmt(Scanner sc)
	{
       System.out.println("          Withdraw Amount     ");	
       System.out.println();
       System.out.println("Enter Amount : " );
       double wAmt = sc.nextDouble();
       System.out.println("Enter your pin : ");
       int userPin =sc.nextInt();

       //validation 
       if(userPin == cust.getPin())
       {
       	 if(wAmt <= cust.getBalance())
       	  {
             double newBal = cust.getBalance()-wAmt;
             cust.setBalance(newBal);
             System.out.println(" AMOUNT DEBITED ");
             statement.add("withdraw : "+ wAmt);
          }
          else{
          	System.out.println("INSUFFICIENT FUNDS");
          }
       }else{
       	System.out.println("INVALID PIN");
       }
	}
	public static void checkBalance(Scanner sc)
	{
		System.out.println("   Check Balance ");
		System.out.println();
		System.out.println(" Enter your pin :");
		int userPin = sc.nextInt();

		if(userPin == cust.getPin())
			System.out.println("Your Balance is:  " +cust.getBalance());
		else
			System.out.println(" INVALID PIN ");
		
	}
	public static void statement()
	{
		System.out.println(" Your Bank Statement ");
		System.out.println();
		for(String str : statement){
			System.out.println(str);
		}
		System.out.println("");
		System.out.println("Avail Balance: "+ cust.getBalance());
 
	}
	public static void editProfile(Scanner sc)
	{
        System.out.println("EDIT PROFILE");
        System.out.print("Enter your pin: ");
        int userPin = sc.nextInt();

        if (userPin == cust.getPin())
        {
            sc.nextLine(); 

            System.out.print("Enter new Name: ");
            cust.setName(sc.nextLine());

            System.out.print("Enter new Email: ");
            cust.setEmail(sc.nextLine());

            System.out.print("Enter new Address: ");
            cust.setAddress(sc.nextLine());

            System.out.print("Enter new Contact Number: ");
            cust.setContact(sc.nextLong());

            System.out.println("Profile Updated Successfully!");
        }else {
            System.out.println("INVALID PIN");
        }
	}
}
class Customer{
	private String name;
	private String address;
	private String email;
	private long contact;
	private long adhar;
	private String pan;
	private double bal;
	private int pin;
	private static String ifscCode;
	private long accountNum;

	Customer(){
		super();
	}
	Customer(String name,String address, String email , long contact, long adhar, String pan , double bal, int pin)
	{
         this.name =name;
         this.address =address;
         this.email = email;
         this.contact =contact;
         this.adhar= adhar;
         this.pan =pan;
         this.bal =bal;
         this.pin =pin;
         this.accountNum =(long)(Math.random()*100000000000l);
	}

	public String getName(){
		return this.name;
	}
	public void setName(String newName){
		this.name =newName;
	}
	public String getAddress(){
		return this.address;
	}
	public void setAddress(String newAddress){
		this.address = newAddress;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String newEmail){
		this.email = newEmail;
	}
	public long getContact(){
		return this.contact;
	}
	public void setContact(long newContact){
		this.contact =newContact;
	}
	public long getAdhar(){
		return adhar;
	}
	public String getPan(){
		return this.pan;
	}
	public double getBalance(){
		return bal;
	}
	public void setBalance(double newBal){
		this.bal = newBal;
	}
	public int getPin(){
		return this.pin;
	}
	public void setPin(int newPin){
		this.pin=newPin;
	}
	public long getAccountNumber(){
		return this.accountNum;
	}
	public String getIfscCode(){
		return this.ifscCode;
	}

}