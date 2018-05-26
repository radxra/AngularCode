
class cos
{
public void cos(){
System.out.println("inside cos not constructor");
}

} 
class sin extends cos{
public void sin(){
System.out.println("inside cos not constructor");
}
}

class tan extends sin{
	public static void main(String args[]){
	System.out.println("main method");
	sin obj = new sin();
	super.sin();
	}

}