package study02;

public class MyDate2 {
	/**
	 * ��ó�� Ŭ���� ���ο��� ����� ������ �޼������ private���� �����ؼ� �ܺο��� �������� ���ϵ��� �ϴ� ���� ��ü ���⿡���� '��������(information hiding)'�̶�� �մϴ�.
	 */
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("�����Դϴ�.");
			} else {
				this.day = day;
			}
		}
	}
} 