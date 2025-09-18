class cls1
{
	
	synchronized public void call()
	{
		for(var i=0;i<5;i++)
		{
			System.out.println(i);
				
		}

	}

}
class cls2 extends Thread
{
	Thread t = new Thread(this);
	cls1 ref;
	cls2(cls1 ref)
	{
		this.ref=ref;
		t.start();
	}
	public void run()
	{
		ref.call();
	}
}
class threadSync
{
	public static void main(String args[])
	{
		cls1 ref = new cls1();
		cls2 obj1 = new cls2(ref);
		cls2 obj2 = new cls2(ref);
		cls2 obj3 = new cls2(ref);
	}
}
