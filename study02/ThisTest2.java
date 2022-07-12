package study02;

 class ThisEx {
	String name;
	int age;

	ThisEx() {
		this("이름 업음", 1); // this를 사용해 ThisEx(String, int) 생성자 호출
	}

	ThisEx(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ThisTest2 {

	public static void main(String[] args) {
		ThisEx noName = new ThisEx();
		ThisEx myName = new ThisEx("민재" , 25);
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println(myName.name);
		System.out.println(myName.age);

	}
}
