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
		bonusPoint += price * bonusRatio; // ���ʽ� ����Ʈ ���
		return price;
	}
	
	public String showCustomerInfo() {
		return TmemberName + " ���� ����� " + TmemberGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�."; 
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

