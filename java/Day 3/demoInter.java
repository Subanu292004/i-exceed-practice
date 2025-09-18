interface inter1
{
	static public void display()
	{
		System.out.println("Interface Method");
	}
}
class cls1 implements inter1
{
	cls1()
	{ 	
		System.out.println("Constructor");
	}
}
class demoInter
{
 	public static void main(String args[])
	{
		cls1 obj = new cls1();
		inter1.display();
	}
}