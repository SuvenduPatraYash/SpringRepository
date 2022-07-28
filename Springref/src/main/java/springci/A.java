package springci;

public class A {
	private int x;
	private B b;

	public A(int x, B b) {
		super();
		this.x = x;
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", b=" + b + "]";
	}

}