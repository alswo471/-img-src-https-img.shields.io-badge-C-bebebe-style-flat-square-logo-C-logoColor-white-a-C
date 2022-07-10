package study02;

public class MyDate2 {
	/**
	 * 이처럼 클래스 내부에서 사용할 변수나 메서서드는 private으로 선언해서 외부에서 접근하지 못하도록 하는 것을 객체 지향에서는 '정보은닉(information hiding)'이라고 합니다.
	 */
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("오류입니다.");
			} else {
				this.day = day;
			}
		}
	}
} 