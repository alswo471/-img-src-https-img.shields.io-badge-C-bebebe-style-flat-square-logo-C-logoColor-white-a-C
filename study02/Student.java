package study02;

public class Student {
	int studentID; // 학번
	String studentName; // 학생이름
	int grade; // 학년
	String address; // 사는 곳

	// 학생의 이름을 반환하는 메서드
	public String getStudentName() {
		return studentName;
	}

	// 학생의 이름을 부여하는 메서드
	public void setStudentName(String name) {
		studentName = name;
	}

	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // 이름, 주소 출력
	}
}