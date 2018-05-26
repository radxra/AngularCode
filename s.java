class p{
public p(){
super();
System.out.println("poo");
}
}

class s extends p{
	public s(int i){
	super();
	System.out.println("s class constructior");
}

	public static void main(String args[]){
	System.out.println("main ");
s obj =new s(12);
}
}
