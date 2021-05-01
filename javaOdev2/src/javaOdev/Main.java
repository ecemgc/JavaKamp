package javaOdev;

public class Main {

	public static void main(String[] args) {
	
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setId(1);
		instructor1.setEmail("engin@demirog.com");
		instructor1.setPassword("123456");
		instructor1.setCreatedCourse("Java");
		
		Instructor instructor2 = new Instructor();
		instructor2.setFirstName("ENGİN");
		instructor2.setLastName("Demirog");
		instructor2.setId(2);
		instructor2.setEmail("engin@engin.com");
		instructor2.setPassword("789456");
		instructor2.setCreatedCourse("c#");
		
		Student student1 = new Student();
		student1.setFirstName("ecem");
		student1.setLastName("günenç");
		student1.setId(11);
		student1.setEmail("ecem@gnc.com");
		student1.setPassword("147258");
		student1.setTakenCourse("Java");
		
		Student student2 = new Student();
		student2.setFirstName("berdan");
		student2.setLastName("akbulut");
		student2.setId(22);
		student2.setEmail("berdan@ablt.com");
		student2.setPassword("159357");
		student2.setTakenCourse("c#");
		
		Instructor[] instructors = {instructor1,instructor2};
		
		Student[] students = {student1,student2};
		 
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor1);
		System.out.println("  ");
		instructorManager.addCourse(instructor2);
		System.out.println("  ");
		instructorManager.listInstructors(instructors);
		System.out.println("  ");
		System.out.println("-----------");
		
		StudentManager studentManager = new StudentManager();
		System.out.println("  ");
		studentManager.addStudent(student1);
		System.out.println("  ");
		studentManager.takeCourse(student2);
		System.out.println("  ");
		studentManager.listStudents(students);
		System.out.println("-----------");
		
		UserManager userManager = new UserManager();
		System.out.println("  ");
		userManager.add(student1);
		System.out.println("  ");
		userManager.confirmedMail(student2);
		System.out.println("  ");
		userManager.del(instructor2);
		System.out.println("  ");
		userManager.addMultipleUser(students);
		
		
		
		
		
		
		
	}

}
