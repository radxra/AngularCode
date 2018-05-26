class oops{
public int i=0;
public oops(){
System.out.println("inside oops");
}
}
class splash extends oops{
public static void main(String args[]){
oops ob=new oops();
}
}