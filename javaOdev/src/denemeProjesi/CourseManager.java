package denemeProjesi;

public class CourseManager {
	
	public void signUp(Course course) {
		System.out.println(course.name + " kursuna kay�t olundu");
	}

	
	public void addedWebSite(Course course) {
		System.out.println("bu kurs " + course.date + " tarihinde sitemize eklenmi�tir");
	}
}
