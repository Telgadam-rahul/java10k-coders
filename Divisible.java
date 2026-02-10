public class Divisible {
    public static String div(int num){
        if(num%5==0&&num%11==0){
            return "num is divisible by 5 and 11";
        }
        else if(num%11==0){
            return "num is divisble by 11";
        }
        else if(num%5==0){
            return "number is divisible by 5";
        }
        else{
            return "it is not divisible by anyone";
        }
        }
        public static void main(String[] args) {
            div(55);
            System.out.println((div(75
                
            )));
        }
    }
    

