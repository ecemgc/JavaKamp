package javaOdev;

public class InstructorManager{
	
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getCreatedCourse() + " isimli kursunuz sisteme eklendi");
	}
	
	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli eğitmen eklenmiştir");
	}
	
	public void listInstructors(Instructor[] instructors) {
		System.out.println("eğitmenler:");
		for(Instructor instructor : instructors) {
			System.out.println(instructor.getFirstName());
		}
	}

}
