class Student{}
class Customer{}

class Intance
{
	public static void main(String args[]) throws Exception{
	Object o = Class.forName(args[0]).newInstance();
	System.out.println("object create for class: "+o.getClass().getName());
	}

}