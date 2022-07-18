package study02;

public class Tmember {
	private int TmemberID;
	private String TmemberName;
	private String TmemberGrade;
	int bonusPoint;
	double bonusRatio;

	public Tmember() {
		TmemberGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 계산
		return price;
	}
	
	public String showCustomerInfo() {
		return TmemberName + " 님의 등급은 " + TmemberGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다."; 
	}

	public int getTmemberID() {
		return TmemberID;
	}

	public void setTmemberID(int tmemberID) {
		TmemberID = tmemberID;
	}

	public String getTmemberName() {
		return TmemberName;
	}

	public void setTmemberName(String tmemberName) {
		TmemberName = tmemberName;
	}

	public String getTmemberGrade() {
		return TmemberGrade;
	}

	public void setTmemberGrade(String tmemberGrade) {
		TmemberGrade = tmemberGrade;
	}
}

