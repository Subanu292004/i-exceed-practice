class demo
{
	hasA1 s1;
	String name,city;
	int age;
	demo(String name, String city, int age,hasA1 s1)
	{
		this.name=name;
		this.city=city;
		this.age=age;
		this.s1=s1;
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("City: "+city);
		System.out.println("Age: "+age);
		s1.displayDetails();
	}
}

class hasA2
{
	public static void main(String args[])
	{
		hasA1 s1 = new hasA1("abc","xyz",123);
		demo obj = new demo("Subanu","Coimbatore",21,s1);
		obj.display();
	}
}