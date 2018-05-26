public class HelloWorld{

     public static void main(String []args){
        System.out.println("permutations of below given string are : ");
        String str = "ABC";
        int last = str.length()-1;
        int fix = 0;
        HelloWorld obj = new HelloWorld();
       obj.permute(str,fix,last);
     }
     
     
     
     private void permute(String str, int fix, int last){
         if(fix==last){
             System.out.println(str);
         }
         else{
             for(int i = fix; i<=last;i++){
                 str = swap(str,fix,i);
                 permute(str,fix+1,last);
                 str = swap(str,fix,i);
             }
             
         }
         
         
     }
     public String swap(String str, int index1, int index2){
         char temp;
         char[] characters =str.toCharArray();
         temp = characters[index1];
         characters[index1] = characters[index2];
         characters[index2] = temp;
         return String.valueOf(characters);
     }
     
     
}