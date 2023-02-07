//Serialization: Saving the state of an Object

class SerializationDemo
{
	public static void main(String[] args)
	{
		ObjectOutputStream os = new ObjectOutputStream( new FileOutputStream("Student.txt", true)); 
		Student s1 = new Student("Hcc", 1923, 1.23);
		os.writeObject(s1);
	}
}

class Student implements Serializable
{
	String name;
	int no;
	double x;
	Student(String 
 