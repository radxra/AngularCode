class Ex23
{

	public static void main(String args[]) throws Exception{
	if(true)
	int i=20;
	Student s = new Student();
	//Object o = Class.forName(args[0]).newInstance();
	//System.out.println("object create for class: "+o.getClass().getName());
	}

}

//when you are creating constructor with args, jvm will not generate no-args by default.
//and newInstance method should contain no-args method so this programme will give
//instantiation error at runtime.


//Exception in thread "main" java.lang.InstantiationException