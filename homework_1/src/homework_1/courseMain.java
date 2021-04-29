package homework_1;

public class courseMain {

	public static void main(String[] args) {

		Course course1 = new Course();
		course1.id = 1;
		course1.courseName = "Yazýlým Geliþtirici Yetiþtime Kampý(C# + Angular)";
		course1.educatorName = "Engin Demiroð";
		course1.progressBar = 100;

		Course course2 = new Course();
		course2.id = 2;
		course2.courseName = "Yazýlým Geliþtirici Yetiþtime Kampý(Java + React)";
		course2.educatorName = "Engin Demiroð";
		course2.progressBar = 35;
		
		Course[] courses = {course1,course2};
		
		for(Course course : courses) {
			System.out.println(course.courseName);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.searchButton(course1);
		courseManager.searchButton(course2);
		
		courseManager.searchEducator(course1);
		courseManager.searchEducator(course2);

	}

}
