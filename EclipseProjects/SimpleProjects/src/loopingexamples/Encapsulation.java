package loopingexamples;

public class Encapsulation {

	int x = 5;
	
	public int getX() {
		return x;
	}
	

	public void setX(int x) {
		this.x = x;
	}

	void printHello() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		
		Encapsulation enc = new Encapsulation();
		System.out.println(enc.x);
		enc.printHello();
		
	}
}
