class l{
String name;
int roll;
static int count;

{
count++;
}
public l(String name,int roll){
this.name = name;
this.roll = roll;
}

public l(){
this.name = "radx";
this.roll = 999;
}

public static void main(String args[]){
l obj2 = new l("ajay",123);
l obj = new l();
System.out.println("name:"+obj.name+"and "+count);
}

}