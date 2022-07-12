package study02;

class ThisExample {
	int num1;
	int num2;
	int num3;

	public void setNum(int num3) {
		this.num3 = num3; // myNum.setNum = num3;와 같음
	}

	public void printThis() {
		System.out.println(this); // System.out.println(myNum);와 같음
	}
}

public class thisTest {
	public static void main(String[] args) {
		ThisExample myNum = new ThisExample();
		myNum.setNum(2000);
		System.out.println(myNum);
		myNum.printThis();
	}
}
