interface a{
void m1();
}
interface b{
int m1();
}

class abc2 implements a,b
{
public int m1(){
System.out.println("inside m1 int");
}
public void m1(){
System.out.println("inside m1 void");
}

}

class abc 
{
		public static void main(String args[]){
	abc2 obj =new abc2();
	obj.m1();
}
}