class parent
{
	String city="Bang";
	parent()
	{
		System.out.println("City in parent class: "+city);
	}
	parent(String name)
	{
		System.out.println("Name:"+name);
	}
	public void display(String city)
	{
		this.city=city;
		System.out.println(city);
	}
}
class child extends parent
{
	child()
	{
		super("subnu");
		city="Bangalore";
		System.out.println("Welcome to "+city);
	}
}
class inherit
{
	public static void main(String args[])
	{
		new child().display("cbe");
		parent ref=new child();
		ref.display("Madurai");
	}
}