public class Middlechar {
    public void stringchar(String name) {
       int len= name.length();
       if(len%2==0){
        int first = (len/2)-1;
        int second = len/2;
       for(int i=1;i<len;i++){
       if(i==first){
        System.out.print(name.charAt(first));
       }
       if(i==second){
        System.out.println(name.charAt(second));
       }
    }
}
       else{
       int len1 = name.length();
       int third = len/2;
       for(int n=1;n<len1;n++){
        if(n==third){
            System.out.print(name.charAt(third));
        }
       }

}
    }  
    
public static void main(String[] args) {
    Middlechar obj1 = new Middlechar();
    obj1.stringchar("wonder");
    obj1.stringchar("world");
    System.out.println();
    obj1.stringchar("6969");
}
}
