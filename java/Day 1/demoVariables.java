class student
{ 
   String name;  //--------> Instance variable
   int age;
   static String college="SIET";  //-------> Class variable
   
   student(String name,int age) //-------> Local variable
   {
      this.name=name;
      this.age=age;
      display();
   }
   public void display()
   {
      System.out.println("Name:"+name);
      System.out.println("Age:"+age);
      System.out.println("College:"+student.college);

   }
}
class demoVariables
{
  public static void main(String args[])
  {
     student s1=new student("Subanu",21);
     student s2=new student("abc",20);
  }
}