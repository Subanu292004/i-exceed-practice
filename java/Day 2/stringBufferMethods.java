class student
{
	StringBuffer s = new StringBuffer("Hello");
	
	student()
	{
		System.out.println("Append: "+s.append("All"));
		System.out.println("Insertion: "+s.insert(0,"Hi"));
		System.out.println("Deletion: "+s.delete(0,2));
		System.out.println("Reverse: "+s.reverse());
		System.out.println("Capacity: "+s.capacity());
		System.out.println("Length: "+s.length());
		System.out.println("Character at index 1 is: "+s.charAt(1));
		System.out.println("Conversion to string: "+s.toString());
	}
}

class stringBufferMethods
{ 	
	public static void main(String args[])
	{ 
		student obj = new student();
	}
}