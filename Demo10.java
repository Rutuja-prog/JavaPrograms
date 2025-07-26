class Demo10
{
	public static void main (String[]args);
		int n=12345;
		while(n!=0)
		{
			int r = n%10;
			if(r==2 || r==3 || r==5 || r==7)
			{
				System.out.println(r); //5 //3
			}
			n=n/10;
		}
	