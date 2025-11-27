public class Primenumber {
    public static void primenumber(){
        int i;
        int count=0;
        int num=50;
        for(i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
       System.out.println(count);
        if(count!= 2){
            System.out.println(" not a prime number");
        }
        else{
            System.out.println(" prime number");
        }
    }
    public static void main(String[] args) {
        primenumber();
    }
}



        
