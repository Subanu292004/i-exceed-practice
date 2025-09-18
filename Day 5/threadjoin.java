class cls extends Thread
{
	public void run()
	{
		for(var i=0;i<5;i++)
		{
			try{
			System.out.println(i);
			new Thread().sleep(1000);
			}catch(InterruptedException e){}
		}
	}
}
class threadjoin
{
	public static void main(String args[]) throws Exception
	{
		Thread t = Thread.currentThread();
		cls obj1 = new cls();
		cls obj2 = new cls();
		cls obj3 = new cls();
		obj1.start();
		obj1.join(1000);
		obj2.start();
		obj3.start();
	}
}