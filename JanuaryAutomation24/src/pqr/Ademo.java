package pqr;

import abc.AccessDemo;

public class Ademo {

	public static void main(String[] args) {
		
	AccessDemo ad = new AccessDemo();
	ad.abcd("Manoj", 1);
//	ad.mnop("ancd",12);  out side package we cannot access default method
	}

}
