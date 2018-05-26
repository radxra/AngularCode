class testfloat
{
	public static void main(String args[]){
	byte b= 10;
	b+=1;//is valid because internal type casting is happening
	System.out.println(b);
	 //error: incompatible types: possible lossy conversion from int to byte
        

	}

}