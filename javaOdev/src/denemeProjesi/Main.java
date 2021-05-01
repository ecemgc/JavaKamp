package denemeProjesi;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course("C# + ANGULAR",1,"2 ay s�recek","�cretsiz","9 ocak" );
		
		Course course2 = new Course("JAVA + REACT",2,"2 ay s�recek","�cretsiz","21 nisan");
		
		Course course3 = new Course("Giri� i�in temel",3,"python java c#","�cretsiz","-" );
		
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course : courses) {
			System.out.println("-----------");
			System.out.println(course.name);
			System.out.println(course.id);
			System.out.println(course.detail);
			System.out.println(course.price);
			System.out.println(course.date);
		};
		
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "s�k sourlan sorular";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "kampa haz�rl�k";
		
		Category category3 = new Category();
		category3.id = 3;
		category3.name = "giri� yap";
		
		
		CourseManager coursemanager = new CourseManager();
		coursemanager.signUp(course1);
		coursemanager.signUp(course2);
		coursemanager.signUp(course3);
		coursemanager.addedWebSite(course1);
		coursemanager.addedWebSite(course2);
		coursemanager.addedWebSite(course3);
		
		
				
		
				
		
		
		
		
		
		
	}

}
