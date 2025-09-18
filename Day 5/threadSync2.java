class cls extends Thread
{
	synchronized public void calculate(int x)
	{
		for(var i=0;i<5;i++)
		{
			System.out.println(i*x);
		}
	}
}
class threadSync2
{
	public static void main(String args[])
	{
		cls obj = new cls();
		Thread t1 = new Thread()
		{
			public void run()
			{
				obj.calculate(5);
			}
		};
		
		Thread t2 = new Thread()
		{
			public void run()
			{
				obj.calculate(15);
			}
		};
		t1.start();
		t2.start();
	}
}

