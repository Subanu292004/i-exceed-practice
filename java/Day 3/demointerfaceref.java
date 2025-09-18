Interface inter1
{ 	
	public void getLength();
	public void op2();
}
class cls1 implements inter1
{
	@Override
	public void getLength()
	{
		System.out,print(1);
	}

	@Override
	public void op2()
	{
		System.out,print(1);
	}
}
class interfaceDemo
{
	public static void main(String args[])
	{
		cls1 c1 = new inter1();
		c1.getLength();
	}
}
