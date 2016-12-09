package andycpp;
import java.util.*;
public class MathOps {
	static void prt(String s) {
		System.out.println(s);
	}
	
	static void pInt(String s, int i) {
		prt(s + "=" + i);
	}
	
	static void pFloat(String s, float f) {
		prt(s + "=" + f);
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		int i, j, k;
		j = rand.nextInt() % 100;
		k = rand.nextInt() % 100;
		pInt("j", j); pInt("k", k);
		
		float u, v, w;
		v = rand.nextFloat();
		w = rand.nextFloat();
		pFloat("v", v); pFloat("w", w);
	}
}
