import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
class IOStream
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fos = new FileOutputStream(new File("demo.txt"));
		String s = "Hi this is subanu";
		fos.write(s.getBytes());
		fos.close();
		FileInputStream fis = new FileInputStream("demo.txt");
		int i=0;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}