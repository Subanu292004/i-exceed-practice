class student
{
    String s1="String "; 
    String s2=new String("string1,string2,string3"); 

    student()
    {

    	 System.out.println("Length: "+s1.length());
     	 System.out.println("Upper Case: "+s1.toUpperCase());
     	 System.out.println("Lower Case: "+s1.toLowerCase());
	 System.out.println("Character at 1 is: "+s1.charAt(1));
	 System.out.println("Equals: "+s1.equals(s2));
	 System.out.println("equalsIgnoreCase: "+s1.equalsIgnoreCase(s2));
	 System.out.println("Index of t is: "+s1.indexOf("t"));
	 System.out.println("Substring: "+s1.substring(0,3));
	 System.out.println("Concatination: "+s1.concat("1"));
	 System.out.println("Replace: "+s1.replace("i","u"));
	 System.out.println("Trim: "+s1.trim());
	 System.out.println("Starts with check: "+s1.startsWith("Str"));
	 System.out.println("Ends with check: "+s1.endsWith("ng"));
	 String spl[]=s2.split(",");


    }
  
}

class stringMethods
{
  	public static void main(String args[])
  	{
   	 	student s1=new student();
  	}
}