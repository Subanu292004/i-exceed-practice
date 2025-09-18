class student
{
	String name;
	int rollno;
	hostel ht;
	student(String name,int rollno)
	{
	 	ht = new hostel(1,2);
		this.name=name;
		this.rollno=rollno;	
	}

	public void studentDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollno);
		ht.hostelDetails();
	}
}
class hostel
{
	int blockno,roomno;
	hostel(int blockno, int roomno)
	{
		this.blockno=blockno;
		this.roomno=roomno;
	}
	public void hostelDetails()
	{
		System.out.println("Block no: "+blockno);
		System.out.println("Room no: "+roomno);

	}
}
class compositionDemo
{
	public static void main(String args[])
	{
 		student s = new student("Subanu",21);
		s.studentDetails();
	}
}