package andycpp;

import java.util.*;

public class ArryClassObj {
	static Random rand = new Random();
	static int pRand(int mod) {
		int b = rand.nextInt() % mod;
		System.out.println(rand.nextInt());
		System.out.println(b);
		return Math.abs(b + 1);
	}
	public static void main(String[] args) {
		Integer[] a = new Integer[pRand(20)];
		prt("length of a = " + a.length);
		for(int i = 0; i < a.length; i++) {
			a[i] = new Integer(pRand(500));
			prt("a[" + i + "] = " + a[i]);
		}
	}
	static void prt(String s) {
		System.out.println(s);
	}
}
