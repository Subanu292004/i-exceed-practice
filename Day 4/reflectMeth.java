import java.lang.reflect.Method;
class cls
{
	private void display()
	{
		System.out.println("Method within class");
	}
}
class reflectMeth
{
	public static void main(String args[]) throws Exception
	{
		Class<?> c = Class.forName("cls");
		Object o = c.getDeclaredConstructor().newInstance();
		Method m = c.getDeclaredMethod("display");
		m.setAccessible(true);
		m.invoke(o);
	}
}