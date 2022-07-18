package study02;

public class TmemberTest1 {

	public static void main(String[] args) {
		Tmember customerLee = new Tmember();
		// CustomerID와 customerName은 protected 변수이므로 set() 메서드 호출
		customerLee.setTmemberID(2121001);
		customerLee.setTmemberName("지민재재");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPTmember customerKim = new VIPTmember();
		// CustomerID와 customerName은 protected 변수이므로 set() 메서드 호출
		customerKim.setTmemberID(2121002);
		customerKim.setTmemberName("이민재");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

	}

}
