class Student{
	String name;
	int rollNumber;
	char grade;

public void displayDetails() {
	System.out.println("Name:"+name);
	System.out.println("rollNumber:"+rollNumber);
	System.out.println("grade:"+grade);
}
}

public class Main {
      public static void main(String[] args) {
        Student student = new Student();
        student.name = "Aish";
        student.rollNumber = 9;
        student.grade = 'A';
        student.displayDetails();
    }
}

    

