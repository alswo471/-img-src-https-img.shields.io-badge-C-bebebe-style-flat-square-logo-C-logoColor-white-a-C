package study02;

public class StudentTest3 {
	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum); // serialNum ������ �ʱ갪 ���
		studentLee.serialNum++; // static ���� �� ����
		
		Student3 studentSon = new Student3();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNum);  //������ �� ���
		System.out.println(studentLee.serialNum); // ������ �� ���
	}
}