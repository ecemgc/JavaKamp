package javaOdev;

public class StudentManager{
	
	public void addStudent(Student student) {
		System.out.println(student.getFirstName() + " isimli öğrenci eklenmiştir");
	}
	
	public void takeCourse(Student student) {
		System.out.println(student.getFirstName() + ", " + student.getTakenCourse() + "isimli kursu aldınız");
	}
	
	public void listStudents(Student[] students) {
		System.out.println("öğrenciler");
		for(Student student : students) {
			System.out.println(student.getFirstName());
		}
	}

	
}
