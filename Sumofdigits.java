public class Sumofdigits{

public void sumOfDigits(int num){
int sum=0;
while(num!=0){
    int rem =num%10;
    sum = rem+sum;
    num/=10;
}
    System.out.println(sum);
}


public static void main(String[] args) {
   Sumofdigits obj1 = new Sumofdigits();
   obj1.sumOfDigits(101);
   obj1.sumOfDigits(567);
  
}
}