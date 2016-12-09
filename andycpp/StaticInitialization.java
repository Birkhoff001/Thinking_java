package andycpp;

class Bowl {   
	Bowl(int marker) {   
		System.out.println("111111---------------");
		System.out.println("Bowl(" + marker + ")");   
		}   
	void f(int marker) {  
		System.out.println("2222222-----------");
		System.out.println("f(" + marker + ")");   
		} 
	} 

class Table {   
	
	static Bowl b1 = new Bowl(1);   
	Table() {    
		System.out.println("4444-----------");
		System.out.println("Table()");     
		System.out.println("5555-----------");
		b2.f(1);  
		System.out.println("6666-----------");
		}   
	void f2(int marker) {     
		System.out.println("7777-----------");
		System.out.println("f2(" + marker + ")");   
		System.out.println("8888-----------");
		} 
	static Bowl b2 = new Bowl(2); 
	
} 
 
class Cupboard {   
	Bowl b3 = new Bowl(3); 
	static Bowl b4 = new Bowl(4);   
	Cupboard() {     
		System.out.println("99999-----------");
		System.out.println("Cupboard()");    
		System.out.println("00000-----------");
		b4.f(2);  
		System.out.println("090909-----------");
		}   
	void f3(int marker) {     
		System.out.println("080808-----------");
		System.out.println("f3(" + marker + ")");  
		System.out.println("060606-----------");
		}   
	static Bowl b5 = new Bowl(5); 
}
public class StaticInitialization {
	public static void main(String[] args) {  
		System.out.println("050505-----------");
		System.out.println(       
				"Creating new Cupboard() in main");
		System.out.println("040404-----------");
		new Cupboard();  
		System.out.println("030303-----------");
		System.out.println(       
				"Creating new Cupboard() in main"); 
		System.out.println("020202-----------");
		new Cupboard();     
		System.out.println("010101-----------");
		t2.f2(1); 
		System.out.println("1010-----------");
		t3.f3(1);   
		System.out.println("1212-----------");
		}   
	static Table t2 = new Table();   
	static Cupboard t3 = new Cupboard(); 
}
