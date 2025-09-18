class sample
{ 
    	StringBuilder s=new StringBuilder("Helloo");
	sample()
	{
		System.out.println("Length: "+s.length());
		System.out.println("Insert: "+s.insert(0,"Hi"));
		System.out.println("Delete: "+s.delete(0,2));
		System.out.println("Delete char at 5: "+s.deleteCharAt(5));
		System.out.println("Replace: "+s.replace(2,3,"llll"));
		System.out.println("Reverse: "+s.reverse());
		System.out.println("Index of l is: "+s.indexOf("l"));
		System.out.println("Append: "+s.append("All"));
		System.out.println("Substring: "+s.substring(0,5));
		System.out.println("Conversion to string: "+s.toString());
	}
}
class stringBuilderMethods
{
	public static void main(String args[])
	{
		new sample();
	}
}