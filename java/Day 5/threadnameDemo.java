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
		Thread t = Thread.currentThread();
		System.out.println("Thread within main function is: "+ t.getName());
		t.setName("Main Thread");
		System.out.println("Thread in main function after setting another name is: "+t.getName());

	}
}
