package demo;

public class Connect_test {
	public static void main(String[] args) {
		Student student = new Student("root","123456");
		Student_Connect test = new Student_Connect(student);
		test.Connect();
	}
}
