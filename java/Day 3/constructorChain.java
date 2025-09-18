class c1
{
	c1()
	{
		System.out.println("Constructor 1");
	}
}

class c2 extends c1
{
	c2()
	{
		System.out.println("Constructor 2");
	}
	
}
class constructorChain
{
	public static void main(String args[])
	{
		new c2();
	}
}