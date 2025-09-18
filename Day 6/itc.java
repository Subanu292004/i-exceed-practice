class cls
{
	int balance;

	synchronized void withdraw(int amount)
	{

		if(balance<amount)
		{
			System.out.println("Balance is not sufficient. The balance available is "+balance);
			System.out.println("Waiting for deposit");
			try{
			wait();
			}catch(Exception e){}
		}
		balance-=amount;
		System.out.println("Withdrawal complete. Balance is "+balance);
		
	}
	
	synchronized void deposit(int amount)
	{
		balance+=amount;
		System.out.println("Rs"+amount+" is deposited");
		notify();
	}

}
class itc
{
	public static void main(String args[]) throws Exception
	{
	   cls obj = new cls();
	   cls obj2 = new cls();
		Thread t1 = new Thread()
		{
			public void run()
			{
				obj.withdraw(100);
			}
		};
		t1.start();

		Thread t2 = new Thread()
		{
			public void run()
			{
				obj.deposit(1000);
			}
		};
		t2.start();
		t2.join();
		
		Thread t3 = new Thread()
		{
			public void run()
			{
				obj2.withdraw(1000);
			}
		};
		t3.start();

		Thread t4 = new Thread()
		{
			public void run()
			{
				obj2.deposit(10000);
			}
		};
		t4.start();
		t4.join();
		

	}
}
