@FunctionalInterface
interface inf1
{
	public void display();
}

class optFunctInterface
{
	public static void main(String args[])
	{
		inf1 ref = new inf1()
	{
		public void display()
		{
			System.out.println("Optimized method");
		}
	};
        ref.display();

	}
}