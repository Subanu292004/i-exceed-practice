class employee
{
	private String name,desig;
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDesig(String desig)
	{
		this.desig = desig;
	}
	public String getName()
	{
		return name;	
	}
	public String getDesig()
	{
		return desig;	
	}

}
class encaps
{
	public static void main(String args[])
	{
		employee emp = new employee();
		emp.setName("Subanu");
		emp.setDesig("Trainee");
		System.out.println(emp.getName());
		System.out.println(emp.getDesig());
	}
}