class cls extends Thread
{
	cls()
	{
		this.start();
	}
	public void run()
	{
		System.out.println("hello");
	}
}
class threadDemo
{
	public static void main(String args[])
	{
		cls obj1 = new cls();
		cls obj2 = new cls();
	}
}