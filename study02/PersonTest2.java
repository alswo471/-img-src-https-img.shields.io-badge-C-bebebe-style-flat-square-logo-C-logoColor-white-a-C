package study02;

public class PersonTest2 {
	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "민재";
		personKim.weight = 73.5f; 
		personKim.height = 175.0f;
		
		Person personLee = new Person("이순신", 175, 75);
	}
}