/*java.nio.file.Path 

absolute path : any path starting from root, in windows it start from drive

relative path : start with current working directory.*/

/*Paths and Files are Utility class*/

import java.nio.file.*;

class PathDemo 
{
	public static void main(String [] args) 
	{
		Path p = Paths.get("ABC", "X", "Y");
		System.out.println(p);
		System.out.println(p.toAbsolutePath());
		Path src = Path
		if(Files.exists(p)) System.out.println("Exists");
		else System.out.println("Path does not exist");
	}
}