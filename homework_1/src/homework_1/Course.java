package homework_1;

public class Course {
	public Course() {
			System.out.println("Bu kursu seçtiniz");
		}

	public Course(int id,String courseName,String educatorName,double progressBar) {
		this();
		this.id = id;
		this.courseName = courseName;
		this.educatorName = educatorName;
		this.progressBar = progressBar;
	}
	
	int id;
	String courseName;
	String educatorName;
	double progressBar;
}
