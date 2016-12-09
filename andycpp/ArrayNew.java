package andycpp;

import java.util.*;

public class ArrayNew {
	static Random rand = new Random();
	static int pRand(int mod) {
		int bb = Math.abs(rand.nextInt()) % mod;
		int b = bb + 1;
		System.out.println("bb = " + bb);
		System.out.println("b = " + b);
		return Math.abs(rand.nextInt()) % mod + 1;
	}
	public static void main	(String[] args) {
		int[] a;
		a = new int[pRand(20)];
		prt("length of a = " + a.length);
		for(int i = 0; i < a.length; i++)
			prt("a[" + i + "] = " + a[i]);
	}
	static void prt(String s) {
		System.out.println(s);
	}
}
