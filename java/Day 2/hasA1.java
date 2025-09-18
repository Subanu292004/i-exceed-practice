class hasA1
{
	
	String compName, compCity;
  	int empid;

	hasA1(String compName,String compCity, int empid)
	{
		this.compName=compName;
		this.compCity=compCity;
		this.empid=empid;
	}
	
	public void displayDetails()
	{
		System.out.println("Name of the company: "+compName);
		System.out.println("City of the company: "+compCity);
		System.out.println("Employee id: "+empid);
	}
	
}
