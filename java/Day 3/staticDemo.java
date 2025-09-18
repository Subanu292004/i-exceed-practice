class staticDemo
{
	static String a;

	static public void display()
	{
		System.out.println(a);
	}
	static
	{
		a="Hi";
		display();
	}

	static
	{
		a="Bye";
		display();
	}


 	public static void main(String args[])
	{
		 
	}
}