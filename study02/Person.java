package study02;

public class Person {
	String name;
	float height;
	float weight;
	
	/** 자바 컴파일러가 자동으로 제공하는 디폴트 생성자 자바 컴파일러는 생성자가 하나도 없는 경우에만 디폴트 생성자를 제공 디폴트 생성자 직접 추가*/
	public Person() {} 
	
	
	/**
	 * 사람 이름을 매개변수로 입력받아서
	 * Person 클래스를 생성하는 생성자
	 */
	
	public Person(String pname) {
		name = pname;
	}
	
	//이름 키, 몸무게를 매개변수로 입력받는 생성자
		public Person(String pname, float pheight, float pweight) {
			name = pname;
			height = pheight;
			weight = pweight;
		}
}

	
