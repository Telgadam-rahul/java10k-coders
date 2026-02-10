public class Whileloop {
/*    public static void main(String[] args) {
        int i=1;
        while(i<=10){
        System.out.println(i);
        i++;
    }
}
}
 
  public static void main(String[] args) {
    int i=2;
    while(i<=50){
        System.out.println(i); if you want to print you have to start from i=1
        i+=2;
    }
  }
}

public static void main(String[] args) {
    
    int i =1;
    while(i<=10){
        System.out.println("10 x " + i + " = "+ (10*i));
        i++;
    }
    
}
}
 
 public static void main(String[] args) {
    int sum = 0;
    int n=1;
    while(n<=60){
        sum= sum+n;
        n++;
    }
    System.out.println(sum);
 }
}
 
public static void main(String[] args) {
    int number = 23456;
    int count =0;
    while(number!=0){
        number/=10;
        count++;

    }
    System.out.println(count);
}
}

public static void main(String[] args) {
    int n=5;
    int fact=1;
    while(n>0){
        fact = fact*n;
        n--;
    }
     System.out.println(fact);
}
}
*/
public static void main(String[] args) {
    int number=56793;
    while(number>0){
         int digit = number%10;
         System.out.print(digit+" ");
         number/=10;
    }
    
}
}