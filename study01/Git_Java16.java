package study01;

public class Git_Java16 {
	public static void main(String[] args) {
		int age = 0;
		int fare;

		if (age < 13) {
			fare = 500;
			System.out.println("����Դϴ�.");
		} else if (age < 20) {
			fare = 1000;
			System.out.println("��, ����л��Դϴ�.");
		} else {
			fare = 1400;
			System.out.println("�Ϲ����Դϴ�.");
		}
		System.out.println("���� ����� " + fare + "�� �Դϴ�.");
	}
}
