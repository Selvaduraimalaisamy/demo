package teleapps;

public class InnerClass {

	public void motal() {
		hotel(this);
	}

	public void hotel(InnerClass id) {
		System.out.println("hotel");
	}

	public static void main(String[] args) {
		InnerClass is = new InnerClass();
		is.motal();
	}
}
