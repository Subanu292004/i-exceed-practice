import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

class demoBuffIO
{
	public static void main(String args[]) throws Exception
	{
		BufferedOutputStream bos =  new BufferedOutputStream(new FileOutputStream("demo.txt"));
		String s = "Bye guys";
		bos.write(s.getBytes());
		bos.close();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("demo.txt"));
		int i=0;
		while((i=bis.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}
