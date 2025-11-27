public class Neonall{
    public boolean getNeon(int num){
        int square= num*num;
        int sum=0;
        int temp =num;
        while(square>0){
            int rem = square%10;
            sum= sum+rem;
            square/=10;
        }
     return sum==temp;
        }
        public static void main(String[] args) {
            Neonall obj1 = new Neonall();
            for(int i=1;i<=1000;i++){
                boolean result = obj1.getNeon(i);
           if(result){
            System.out.println(i);

           }
        
            }
            }
}
