package study02;

public class TmemberTest1 {

	public static void main(String[] args) {
		Tmember customerLee = new Tmember();
		// CustomerID�� customerName�� protected �����̹Ƿ� set() �޼��� ȣ��
		customerLee.setTmemberID(2121001);
		customerLee.setTmemberName("��������");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPTmember customerKim = new VIPTmember();
		// CustomerID�� customerName�� protected �����̹Ƿ� set() �޼��� ȣ��
		customerKim.setTmemberID(2121002);
		customerKim.setTmemberName("�̹���");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

	}

}
