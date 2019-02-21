package DemoClass;

public class StudentID {

	String name;
	int rollNo;

	public void assignValues(String name, int rollNo) {

		System.out.println("Name of Student   " + name);
		System.out.println("RollNo of Student   " + rollNo);
		System.out.println("===============================");
	}

	public static void main(String[] args) {

		StudentID Studentobj = new StudentID();
		Studentobj.assignValues("John", 20);
		Studentobj.assignValues("June", 21);

	}

}
