package schoolOperations;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Altun","Kerim","454384",1478,90);
		Student[] students = new Student[] {student1};
		StudentManager studentManager = new StudentManager();
		
		Instructor �nstructor1 = new Instructor(2, "Demiro�", "Engin", "88545","Yaz�l�m Geli�tirme");
		InstructorManager �nstructorManager = new InstructorManager();
		Instructor[] �nstructors = new Instructor[] {�nstructor1};
		
		for (Student student : students) {
			System.out.println(student.getFirstName()+student.getLastName());
			studentManager.chooseInstructor(�nstructor1.getFirstName(),�nstructor1.getLastName() );
			
			
			
		}
		for (Instructor instructor : �nstructors) {
			System.out.println(instructor.getFirstName()+instructor.getLastName());
			�nstructorManager.studentsWhoChose(student1.getFirstName(),student1.getLastName());
		}
		
		
		

	}

}
