public class reverse {
    public static void main(String[] args) {
        
    int number = 26789;
    int reverse=0;
    while(number!=0){
        reverse = reverse*10+number%10;
        number/=10;
        
    }
    System.out.println(reverse);
    
    }}
