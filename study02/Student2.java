package study02;

public class Student2 {
	int studentID;
	// studentName ������ private���� ���� 
	private String studentName; 
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	//�л� �̸��� �޾ƿ��ų� ������ �� �ֵ��� getStudentName()�޼���� setStudentName()�޼��带 �߰�
}