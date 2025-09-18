import java.io.*;
class byteArrIO
{
	public static void main(String args[]) throws Exception
	{
		String s = "hi this is subanu!!";
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write(s.getBytes());
		
		FileOutputStream fos1 = new FileOutputStream(new File("baos.txt"));
		FileOutputStream fos2 = new FileOutputStream("baos2.txt");

		bos.writeTo(fos1);
		bos.writeTo(fos2);
		bos.writeTo(new FileOutputStream("baos3.txt"));

		FileInputStream fis1 = new FileInputStream("baos.txt");
		FileInputStream fis2 = new FileInputStream("baos2.txt");
		FileInputStream fis3 = new FileInputStream("baos3.txt");

		
		int i=0;
		while((i=fis3.read())!=-1)
		{
			System.out.print((char)i);
		}
				
	}
}