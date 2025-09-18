class cls extends Thread
{
	public void run()
	{
		for(var i=0;i<5;i++)
		{
			try{
			System.out.println("Child "+i);
			new Thread(this).sleep(1000);
			}catch(InterruptedException e){}
		}
	}	
}
class threadSleep2
{
	public static void main(String args[]) throws Exception
	{
		new cls().start();
		Thread t = Thread.currentThread();
		for(var i=0;i<5;i++)
		{
			System.out.println(i);
			t.sleep(1000);
		}
	}
}