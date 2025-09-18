abstract class sample1
{
	int x;
	sample1(int x)
	{
		this.x=x;
	}
	abstract public void display();
}
class sample2 extends sample1
{

	sample2(int x)
	{
		super(x);
	}
	@Override
	public void display()
	{
	 	System.out.println(x);
	}
}

class abstr
{
	public static void main(String args[])
	{
	  	new sample2(2).display();
	}
}