public class Positive {
    public String posOrNeg(int num){
        if(num>0){
            return "given number is positive";
        }
        else{
            return "given number is negative";
        }
    }
    public static void main(String[] args) {
        Positive obj1 = new Positive();
        String result = obj1.posOrNeg(25);
        System.out.println(result);
    }
    
}
