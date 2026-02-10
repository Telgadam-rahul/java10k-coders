public class Loop {
    public int sumOfNaturalNumbers(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum = sum +i;
        }
            return sum;
        }
    public static void main(String[] args) {
        Loop obj1 = new Loop();
        int result = obj1.sumOfNaturalNumbers(10);
    System.out.println(result);}
    }

    
