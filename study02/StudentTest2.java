package study02;

public class StudentTest2 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "�̻��"; // �����߻�
		
		// setStudentName() �޼��� Ȱ���� private ������ ���� ����
		studentLee.setStudentName("�̻��");
		
		System.out.println(studentLee.getStudentName());
		
		/**
		 * studentName ��� ������ �̸� ���� ���� �����ϴ� ���� �ƴϰ� setStudentName()�޼��带 Ȱ���Ͽ� ���� ������ �� �ֽ��ϴ�.
		 * �� �ܺ� Ŭ�������� private ������ ���� ������ ���� ������, public �޼��带 ���ϸ� private������ ������ �� �ֽ��ϴ�.
		 */
	}
}