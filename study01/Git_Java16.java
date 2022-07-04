package study01;

public class Git_Java16 {
	public static void main(String[] args) {
		int age = 0;
		int fare;

		if (age < 13) {
			fare = 500;
			System.out.println("어린이입니다.");
		} else if (age < 20) {
			fare = 1000;
			System.out.println("중, 고등학생입니다.");
		} else {
			fare = 1400;
			System.out.println("일반인입니다.");
		}
		System.out.println("버스 요금은 " + fare + "원 입니다.");
	}
}
