package study01;

public class Git_Java22 {
	public static void main(String[] args) {
		int i;
		int j;

		for (i = 2; i <= 9; i++) { // 2�ܺ��� 9�ܱ��� �ݺ��ϴ� �ܺ� �ݺ���
			for (j = 1; j <= 9; j++) { // �� �ܿ��� 1~9�� ���ϴ� ���� �ݺ���
				System.out.println(i + "X" + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
