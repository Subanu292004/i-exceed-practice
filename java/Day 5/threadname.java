class cls extends Thread
{
	cls()
	{
		this.start();
	}
	public void run()
	{
		System.out.println("Thread name: "+new Thread().getName());
	}
}
class threadnameDemo
{
	public static void main(String args[])
	{
		cls obj1 = new cls();
		cls obj2 = new cls();
	}
}
