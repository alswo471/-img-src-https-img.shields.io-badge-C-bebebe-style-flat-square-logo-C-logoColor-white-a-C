package study02;

public class Person {
	String name;
	float height;
	float weight;
	
	/** �ڹ� �����Ϸ��� �ڵ����� �����ϴ� ����Ʈ ������ �ڹ� �����Ϸ��� �����ڰ� �ϳ��� ���� ��쿡�� ����Ʈ �����ڸ� ���� ����Ʈ ������ ���� �߰�*/
	public Person() {} 
	
	
	/**
	 * ��� �̸��� �Ű������� �Է¹޾Ƽ�
	 * Person Ŭ������ �����ϴ� ������
	 */
	
	public Person(String pname) {
		name = pname;
	}
	
	//�̸� Ű, �����Ը� �Ű������� �Է¹޴� ������
		public Person(String pname, float pheight, float pweight) {
			name = pname;
			height = pheight;
			weight = pweight;
		}
}

	
