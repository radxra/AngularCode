 class P{
static int i=0;
}
class C extends P{
static int i=10;
}

public class xyz {
	
	public static void main(String args[]){
	P p = new P();
p.i++;
System.out.println(p.i);
	C c = new C();
c.i++;
System.out.println(c.i);
	P pc = new C();
	pc.i++;
	System.out.println(p.i); 
	}
}