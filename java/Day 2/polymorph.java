class sample1
{ 
	sample1(int x)
	{
		System.out.println("Parent class");
	}
 	public void display(int x)
	{
		System.out.println("x="+x);
	}
	public void display(int x,int y)
	{
		System.out.println("x="+x+" y="+y);
	}

}
class sample2 extends sample1
{
	sample2()
	{
		super(5);
		System.out.println("Child class");
	}
	public void display(int x)
	{
		System.out.println(x);
	}
	
}
class polymorph
{
	public static void main(String args[])
	{
		
		new sample2().display(1);
	}
}
