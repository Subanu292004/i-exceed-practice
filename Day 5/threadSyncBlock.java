class cls1
{
	
	public void call(String msg)
	{
		synchronized(this) 
		{
			System.out.println("Hi");
			System.out.println(msg);
			System.out.println("Bye");
  		}
	}

}
class cls2 extends Thread
{
	Thread t = new Thread(this);
	String msg;
	cls1 ref;
	cls2(cls1 ref,String msg)
	{
		this.ref=ref;
		this.msg=msg;
		t.start();
	}
	public void run()
	{
		ref.call(msg);
	}
}
class threadSyncBlock
{
	public static void main(String args[])
	{
		cls1 ref = new cls1();
		cls2 obj1 = new cls2(ref,"Obj 1");
		cls2 obj2 = new cls2(ref,"Obj 2");
		cls2 obj3 = new cls2(ref,"Obj 3");
	}
}
