public class Middigits {
    public boolean middigit(int num){
        int last = num%10;
        num/=10;
        int temp = num;
        while(temp>9){
         temp = temp/10;
        int first = temp;
        
        int midpart = num;
        while(midpart>9){
            int digit = midpart%10;
            if(!(digit<=first&&digit<=last)){
                return false;
            }
        }
        midpart/=10;
    }
    return true;
        }
    
     public static void main(String[] args) {
        Middigits obj1 = new Middigits();
        boolean result = obj1.middigit(1672);
        System.out.println(result);
    }
}



