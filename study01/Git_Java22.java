package study01;

public class Git_Java22 {
	public static void main(String[] args) {
		int i;
		int j;

		for (i = 2; i <= 9; i++) { // 2단부터 9단까지 반복하는 외부 반복문
			for (j = 1; j <= 9; j++) { // 각 단에서 1~9를 곱하는 내부 반복문
				System.out.println(i + "X" + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
