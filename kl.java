class kl
{
public kl(){
System.out.println("hello constructor");
}

{
System.out.println("instance block");
}

static{
System.out.println("static block");
}
}

class m extends kl
{
public static void main(String[] args)
{
kl obj=new kl();
}
}