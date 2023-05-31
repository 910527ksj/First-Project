package ex01;

public class ex004 {
	
	public static void main(String[] args) {
		Person p = new Person();
		
		System.out.println(p.walk());
		
	}
}


class Person{ // 사람이라는 설계도(틀)
	
	public String walk() { // 특정한 기능이나 동작( 행위 )
		return "한걸음 걸었음";
	}
	
	public String run() {
		return "뛰는 중";
	}
	
	public String stop() {
		return "멈춤";
	}
}