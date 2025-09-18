class cls extends Thread
{
	Thread t1 = new Thread(this);
	// Thread t1 = Thread.currentThread(); --> can also use this
	public void run()
	{
		for(var i=0;i<5;i++)
		{
			try{
			System.out.println(i);
			t1.sleep(1000); // or Thread.sleep(1000); so no need for Thread t1 = new Thread(this) or Thread t1 = Thread.currentThread();
			}catch(InterruptedException e){}
		}
	}
}
class threadSleep
{
	public static void main(String args[])
	{
		Thread t = Thread.currentThread(); // --> can use only this method in main function
		cls obj = new cls();
		obj.start();
	}
}