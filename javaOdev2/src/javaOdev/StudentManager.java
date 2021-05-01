package javaOdev;

public class StudentManager{
	
	public void addStudent(Student student) {
		System.out.println(student.getFirstName() + " isimli ��renci eklenmi�tir");
	}
	
	public void takeCourse(Student student) {
		System.out.println(student.getFirstName() + ", " + student.getTakenCourse() + "isimli kursu ald�n�z");
	}
	
	public void listStudents(Student[] students) {
		System.out.println("��renciler");
		for(Student student : students) {
			System.out.println(student.getFirstName());
		}
	}

	
}
