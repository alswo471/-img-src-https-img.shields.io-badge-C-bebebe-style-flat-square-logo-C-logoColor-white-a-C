package study02;

public class VIPTmember extends Tmember {
	private int agentID; //VIP �� ���� ���̵�
	double saleRatio; // ������
	
	public VIPTmember() {
//		TmemberGrade = "VIP"; ���� Ŭ������ private���� �̹Ƿ� ���� �߻� (private ������ get() �޼��带 ����� ���� ������ �� �ְ�, set() �޼��带 ����� ���� ������ �� �ֽ��ϴ�.)
		bonusRatio = 0.05;
		
	}
	
	public int getAgentID() {
		return agentID;
	}
}
