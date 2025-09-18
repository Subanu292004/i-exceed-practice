class student
{
  String name;
  int age;

  student() 
  {
  System.out.println("This is a default constructor");
  }
  
  student(String name,int age)
  {
  this(); //-------->calls current class constructor
  System.out.println("This is parameterised constructor");
  this.name=name;
  this.age=age;
  display();  //-------->calls current class method
  }


  public void display()
  {
  System.out.println("Name: "+name);
  System.out.println("Age: "+age);
  }
}



class demoConstructor
{
public static void main(String args[])
{
   student s1=new student("Subanu",21);	
   student s2=new student("abc",20);	
}
}