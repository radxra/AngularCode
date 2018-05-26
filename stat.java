class stat{

static
{
m1();
//System.out.println(x); illegel forward reference
}
public static void main(String args[])
{
System.out.println("inside main method");
}
public static void m1(){
System.out.println(x);
}
public static int x= 10;


}