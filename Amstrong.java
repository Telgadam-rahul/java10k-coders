public class Amstrong{
 public int getPower(int base, int exp){
   int power = 1;
   for(int i=1;i<=exp;i++){
      power = power *base;

   }
   return power;
}
     public int getpowerofnum(int num){
      int count = 0;
      while(num!=0){
         count++;
         num/=10;
      }
      return count;
         
      }
      public boolean isamstrong(int num){
         int count = getpowerofnum(num);
         int temp = num;
         int sum = 0;
         while(num!=0){
         int rem = num%10;
         sum = sum+getPower(rem, count);
         num/=10;
      }
      return temp==sum;
     }
     public static void main(String[] args) {
      Amstrong obj1 = new Amstrong();
      boolean result = obj1.isamstrong(153);
      System.out.println(result? "armstrong": "not amstrong");
     }
   }



