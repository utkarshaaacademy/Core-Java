package abc;

public class NewAccessDemo {

	public static void main(String[] args) {
		AccessDemo ad = new AccessDemo();
		ad.abcd("Gayatri", 13);   // public
		ad.mnop(null, 0);         // default
	}

}
