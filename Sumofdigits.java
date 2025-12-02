public class Sumofdigits{

public void sumOfDigits(int num){
int sum=0;
while(num!=0){
    int rem =num%10;
    sum = rem+sum;
    num/=10;
}
    System.out.println("sum of digits is "+sum);
}
 public void  reverse(int num){
    int rev = 0;
    while(num!=0){
        int rem = num%10;
        rev = rev*10+rem;
        num/=10;
    }
    System.out.println("the reverse number is "+rev);
 }


public static void main(String[] args) {
   Sumofdigits obj1 = new Sumofdigits();
   obj1.sumOfDigits(101);
   obj1.sumOfDigits(567);
   obj1.reverse(721);
   obj1.reverse(765);

  
}
}