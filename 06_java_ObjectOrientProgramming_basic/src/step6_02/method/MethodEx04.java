package step6_02.method;


//this : 객체 (오브젝트,인스턴스) 자신
class Zealot {
	int shield = 60;
	int hp = 100;
	
	void showStatus() {
		System.out.println("shield : " + this.shield);
		System.out.println("hp : " + this.hp);
		System.out.println();
	}
}


public class MethodEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zealot z1 = new Zealot();
		z1.shield = 0;
		z1.showStatus();
		
		Zealot z2 = new Zealot();
		z2.shield = 50;
		z2.showStatus();
		
		Zealot z3 = new Zealot();
		z3.showStatus();
		
		
		
	}

}
