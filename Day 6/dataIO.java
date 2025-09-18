import java.io.*;

class dataIO
{
	public static void main(String args[]) throws Exception
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("demo.txt"));
		dos.writeInt(21);
		dos.writeBoolean(false);
		dos.writeLong(1234567);
		dos.close();

		DataInputStream dis = new DataInputStream(new FileInputStream("demo.txt"));
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readLong());
		dis.close();	
	}
}