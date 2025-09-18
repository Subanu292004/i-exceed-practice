import java.io.*;
class student implements Serializable
{
    String name,dept,city;
	
	student(String name, String dept, String city)
	{
		this.name = name;
		this.city = city;
		this.dept = dept;
	}
}
class employee implements Serializable
{
   String name;
   int id;

	employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}
class objIO
{
	public static void main(String args[]) throws Exception
	{
		
		student s = new student("Subanu","IT","coimbatore");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		oos.writeObject(s);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		student s2 = (student)ois.readObject(); // deserialization
		System.out.println(s2.name);
		System.out.println(s2.city);
		System.out.println(s2.dept);

		student s3 = new student("abc","mno","xyz");
		ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("oos.txt"));  // usage of same txt file leads to overwriting
		oos2.writeObject(s3);
		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("oos.txt"));
		System.out.println(s3.name);

		employee emp = new employee("Subanu",123);
		ObjectOutputStream oos3 = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		oos3.writeObject(emp);
		ObjectInputStream ois3 = new ObjectInputStream(new FileInputStream("oos.txt"));
		employee emp2 = (employee)ois3.readObject();
		System.out.println(emp2.name);

				
	}
}