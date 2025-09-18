class student
{
   student()
   {
      System.out.println("This is a constructor");
   }
   
   {
      System.out.println("This is Instance initialization block");
   }
   
   static
   {
      System.out.println("This is static block");
   }
}
class demoBlocks
{
  public static void main(String args[])
  {
      new student();
  }
}