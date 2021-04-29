package schoolOperations;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Altun","Kerim","454384",1478,90);
		Student[] students = new Student[] {student1};
		StudentManager studentManager = new StudentManager();
		
		Instructor ýnstructor1 = new Instructor(2, "Demiroð", "Engin", "88545","Yazýlým Geliþtirme");
		InstructorManager ýnstructorManager = new InstructorManager();
		Instructor[] ýnstructors = new Instructor[] {ýnstructor1};
		
		for (Student student : students) {
			System.out.println(student.getFirstName()+student.getLastName());
			studentManager.chooseInstructor(ýnstructor1.getFirstName(),ýnstructor1.getLastName() );
			
			
			
		}
		for (Instructor instructor : ýnstructors) {
			System.out.println(instructor.getFirstName()+instructor.getLastName());
			ýnstructorManager.studentsWhoChose(student1.getFirstName(),student1.getLastName());
		}
		
		
		

	}

}
