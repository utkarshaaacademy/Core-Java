package abc;

public class AccessDemo {
	String name;
	int rollno;
	public void abcd(String n, int r) {
	//	n= "Ravi";
	//	r = 10;
		System.out.println(n);
		System.out.println(r);
	}
	void mnop(String n, int r) {
			n= "Ravi";
			r = 10;
			System.out.println(n);
			System.out.println(r);
		}
	public static void main(String[] args) {
		AccessDemo ad = new AccessDemo();
		ad.abcd("Vinit", 12);   // public
		ad.mnop(null, 0);       // default
	}
}
