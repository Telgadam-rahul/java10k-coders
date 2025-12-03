public class midnumber {
   public void midNumber(int num){
    int last = num%10;
    num/=10;
    int temp=num;
    int middle=0;
    while(temp>9){
      int digit =temp%10;
      middle = middle+digit;
      temp/=10;
    }

      if(temp+last==middle){
         System.out.println("equal");
      }
      else{
         System.out.println("not equal");
      }  
   }
    public static void main(String[] args) {
      midnumber obj1 = new midnumber();
      obj1.midNumber(75547);
    }

   }
