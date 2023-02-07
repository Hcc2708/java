import java.io.*;

class FileReadWrite
{
	public static void main(String[] args)
	{
		try(FileInputStream fin = new FileInputStream("E:://X.txt");
			FileOutputStream fout = new FileOutputStream("E:://copid.txt"))
		{
			byte b;
			while((b = (byte)fin.read()) != -1)
				fout.write(b);
		}
		catch(IOException ef)
		{}
	}
}