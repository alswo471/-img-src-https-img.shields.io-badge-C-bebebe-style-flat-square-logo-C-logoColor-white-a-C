package study02;

public class VIPTmember extends Tmember {
	private int agentID; //VIP 고객 상담원 아이디
	double saleRatio; // 할인율
	
	public VIPTmember() {
//		TmemberGrade = "VIP"; 상위 클래스가 private변수 이므로 오류 발생 (private 변수는 get() 메서드를 사용해 값을 가져올 수 있고, set() 메서드를 사용해 값을 지정할 수 있습니다.)
		bonusRatio = 0.05;
		
	}
	
	public int getAgentID() {
		return agentID;
	}
}
