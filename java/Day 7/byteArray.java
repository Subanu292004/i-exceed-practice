import java.io.*;
class byteArray
{
	public static void main(String args[])
	{
		byte[] s = {1,2,3,4};
		String str="hi hello";
		ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());
		int i=0;
		while((i=bis.read())!=-1)
		{
			System.out.print((char)i);
		}
	}	
}