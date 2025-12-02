public class fact {
    public void factorial(int number){
        int fact=1;
        while(number!=0){
            fact = fact*number;
            number--;
        }
        System.out.println("factorial is " + fact);
    }
    public static void main(String[] args) {
        fact obj1 = new fact();
        obj1.factorial(3);
        obj1.factorial(6);

    }
}
