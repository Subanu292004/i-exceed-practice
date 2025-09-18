class student
{
    String s1="String 1"; // String by literal - it is immutable
    String s2=new String("String 2"); //String by object
    StringBuffer s3=new StringBuffer("String 3"); //String buffer - it is mutable
    StringBuilder s4=new StringBuilder("String 4");
    student()
    {
    	<--String methods-->	

    	 System.out.println("Length: "+s1.length());
     	 System.out.println("Upper Case: "+s1.toUpperCase());
     	 System.out.println("Lower Case: "+s1.toLowerCase());

  //String buffer methods

  System.out.println("\n Append:"+s3.append("Appended"));

  //String builder methods
  }
  
}

class demoString
{
  public static void main(String args[])
  {
    student s1=new student();
  }
}