interface collegeData
{
	public void collegeDetails();
	default public void studentDetails()
	{
		System.out.println("College");
	}	
}
interface hostelData
{
	public void hostelDetails();
	default public void studentDetails()
	{
		System.out.println("Student");
	}
}
class studentData implements collegeData,hostelData
{ 
	@Override
	public void collegeDetails(){}
	@Override
	public void hostelDetails(){}
	@Override
	public void studentDetails()
	{
		System.out.println("Overriden data");
		hostelData.super.studentDetails();
		collegeData.super.studentDetails();
	}
 	 
}
class defaultDemo
{
	public static void main(String args[])
	{
		studentData sd = new studentData();
		sd.collegeDetails();
		sd.hostelDetails();
		sd.studentDetails();
	}
}