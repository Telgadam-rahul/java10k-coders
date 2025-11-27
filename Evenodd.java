public class Evenodd {
    public void evenOdd(){
        String even="even numbers are:";
        String odd="odd numbers are: ";
        for(int i=1;i<=20;i++){
            if(i%2==0){
                even = even +i+ " ";
            }
            else{
                odd = odd + i + " ";
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
    public static void main(String[] args) {
        Evenodd obj1 = new Evenodd();
        obj1.evenOdd();
    }
    
}
