package study02;

public class Student2 {
	int studentID;
	// studentName 변수를 private으로 선언 
	private String studentName; 
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	//학생 이름을 받아오거나 지정할 수 있도록 getStudentName()메서드와 setStudentName()메서드를 추가
}