package study02;

public class StudentTest3 {
	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); // serialNum 변수의 초깃값 출력
		studentLee.serialNum++; // static 변수 값 증가
		
		Student3 studentSon = new Student3();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);  //증가된 값 출력
		System.out.println(studentLee.serialNum); // 증가된 값 출력
	}
}