public class Oneprime {
    public static void primenumber(){
    int num=50;
    int count=0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
        }
        System.out.println(count);
        if(count!=0){
            System.out.println("not prime number");
        }
        else{
            System.out.println("prime number");
        }

    }
    public static void main(String[] args) {
        primenumber();
    }
    
}
