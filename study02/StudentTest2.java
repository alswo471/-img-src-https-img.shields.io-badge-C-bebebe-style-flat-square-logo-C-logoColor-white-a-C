package study02;

public class StudentTest2 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "이상원"; // 오류발생
		
		// setStudentName() 메서드 활용해 private 변수에 접근 가능
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
		
		/**
		 * studentName 멤버 변수에 이름 값을 직접 대입하는 것이 아니고 setStudentName()메서드를 활용하여 값을 대입할 수 있습니다.
		 * 즉 외부 클래스에서 private 변수에 직접 접근할 수는 없지만, public 메서드를 통하면 private변수에 접근할 수 있습니다.
		 */
	}
}