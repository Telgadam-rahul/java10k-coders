public class Amstrong{
 public int getpower(int base, int exp){
   int power = 1;
   for(int i=1;i<=exp;i++){
      power = power*base;
   }
   return power;
}
public int getpowerofnumber(int num){
   int count = 0;
   while(num!=0){
      count++;
      num/=10;
   }
   return count;
}
public boolean amStrongnumber(int num){
   int count=getpowerofnumber(num);
   int sum = 0;
   int temp = num;
   while(temp!=0){
   int rem = temp%10;
   sum = sum+ getpower(rem,count);
   temp/=10;
   }
return num==sum;
}

public static void main(String[] args) {
   Amstrong obj1 = new Amstrong();
   boolean result = obj1.amStrongnumber(153);
   System.out.println(result?"amstrong":"not amstrong");
}



}

