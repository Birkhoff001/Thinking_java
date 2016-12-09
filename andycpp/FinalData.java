package andycpp;

class Value {
	int i = 1;
}

public class FinalData {
	final int i1 = 9;
	static final int I2 = 99;
	public static final int I3 = 39;
	final int i4 = (int) (Math.random()*20);
	static final int i5 = (int) (Math.random()*20);
	
	Value v1 = new Value();
	final Value v2 = new Value();
	static final Value v3 = new Value();
	final Value v4 = new Value();   //Pre-Java 1.1 Error: no initializer
	final int[] a = {12, 13, 14, 15, 16};
	
	public void prt(String s) {
		System.out.println(s + ":¡¡" + "i4 = " + i4 + ", i5 = " + i5);
	}
	
	public static void main(String[] args) {
		FinalData fd1 = new FinalData();
//		fd1.v2.i++;
		System.out.println("fd1.v2.i++: " + fd1.v2.i++);
		fd1.v1 = new Value();
		System.out.println("v1, v2, v3, v4 = " + 
		fd1.v1.i + fd1.v2.i + fd1.v3.i + fd1.v4.i);
		for(int i = 0; i < fd1.a.length; i++) {
			fd1.prt("fd1.a[" + i + "]" + fd1.a[i]);
		}
		fd1.prt("fd1");
		
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData();
		fd2.prt("fd2");
	}	
}
