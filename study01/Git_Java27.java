package study01;

public class Git_Java27 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2���� �迭 ����� ���ÿ� �ʱ�ȭ

		for (int i = 0; i < arr.length; i++) { // ��
			for (int j = 0; j < arr[i].length; j++) { // ��
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}
}
