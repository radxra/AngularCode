class s{
public static void main(String args[]){
System.out.println("parent class");
}
}

class p
{
 public p(){
String [] args =new String[10];
super.main(args);
}

public static void main(String args[]){

System.out.println("child class");
}

}