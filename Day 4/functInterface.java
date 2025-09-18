@FunctionalInterface
interface inf1
{
	public void display();
}
class c1 implements inf1
{

	@Override
	public void display()
	{
		System.out.println("Functional interface methos");
	}
}
class functInterface
{
	public static void main(String args[])
	{
		new c1().display();
	}
}