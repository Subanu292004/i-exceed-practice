interface collegeData
{
	public void collegeDetails(String name,String city);
	public void studentDetails(String name,int rollNo);
}
interface hostelData
{
	public void hostelDetails(int block,int roomNo);
	public void studentDetails(String name,int rollNo);

}
class studentData implements collegeData, hostelData
{
	@Override
	public void collegeDetails(String name,String city)
	{
		System.out.println("College Name "+name);
		System.out.println("City "+city);
	}

	@Override
	public void studentDetails(String name,int rollNo)
	{
		System.out.println("Student Name "+name);
		System.out.println("Roll No "+rollNo);
	}

	@Override
	public void hostelDetails(int block,int roomNo)
	{
		System.out.println("Block no "+block);
		System.out.println("Room No "+roomNo);	
	}


}
class multipleInherit
{
	public static void main(String args[])
	{
 		studentData obj = new studentData();
		obj.collegeDetails("SIET","Coimbatore");
		obj.studentDetails("Subanu",21);
		obj.hostelDetails(1,206);
	}
}