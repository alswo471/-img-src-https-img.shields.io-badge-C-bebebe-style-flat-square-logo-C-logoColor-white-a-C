package study01;

public class Git_Java20 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;

		do {
			// �־��� ������ ���� �ƴϴ��� ������ �� �� ������
			sum += num;
			num++;
		} while (num <= 10);

		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}
}
