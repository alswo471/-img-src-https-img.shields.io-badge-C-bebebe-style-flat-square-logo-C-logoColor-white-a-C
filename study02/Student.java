package study02;

public class Student {
	int studentID; // �й�
	String studentName; // �л��̸�
	int grade; // �г�
	String address; // ��� ��

	// �л��� �̸��� ��ȯ�ϴ� �޼���
	public String getStudentName() {
		return studentName;
	}

	// �л��� �̸��� �ο��ϴ� �޼���
	public void setStudentName(String name) {
		studentName = name;
	}

	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // �̸�, �ּ� ���
	}
}