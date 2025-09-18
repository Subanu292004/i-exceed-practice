interface inter1
{ 	
	public void getLength();
	public void reverseString();
}
class cls1 implements inter1
{
	StringBuilder name=new StringBuilder("Subanu");

	@Override
	public void getLength()
	{
		System.out.println("Length of string is "+name.length());
	}

	@Override
	public void reverseString()
	{
		System.out.println("Reversal of string is "+name.reverse());
	}
	public int getIndexOf(char c)
	{
		return name.indexOf(String.valueOf(c));
	}
}
class interfaceDemo
{
	public static void main(String args[])
	{
		inter1 c1 = new cls1();
		c1.getLength();
		c1.reverseString();
		System.out.println("Index of u in the string is "+((cls1)c1).getIndexOf('u'));
	}
}
