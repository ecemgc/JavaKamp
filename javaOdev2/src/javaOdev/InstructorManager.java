package javaOdev;

public class InstructorManager{
	
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getCreatedCourse() + " isimli kursunuz sisteme eklendi");
	}
	
	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli eðitmen eklenmiþtir");
	}
	
	public void listInstructors(Instructor[] instructors) {
		System.out.println("eðitmenler:");
		for(Instructor instructor : instructors) {
			System.out.println(instructor.getFirstName());
		}
	}

}
