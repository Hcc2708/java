import java.nio.file.*;
import java.io.*;

class PathDemo
{
	static public void main(String[] args) throws IOException
	{
		Path p = Paths.get("ABC","X", "Y.txt"); // current working directory.
		System.out.println(p.isAbsolute());
		System.out.println(p.toAbsolutePath());
		System.out.println("is path exist " + Files.exists(p));
		//if(Files.exists(p)) {Files.delete(p);} IOException need to be caught or thrown
		//Files.deleteIfExists(p); IOException need to be caught or thrown
        Path src = Paths.get("E://sem 4//MTH302//CORRELATION.pdf");
	    Path dst = Paths.get("E://sem 4//CSE316 Operating System//XYZ.pdf");
		Files.copy(src, dst);
	}
}