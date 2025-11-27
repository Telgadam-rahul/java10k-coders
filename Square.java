public class Square {
    int a =5;
    public static void square(){
        System.out.println(5*5);
    }
    public static void cube(){
        square();
        System.out.println(5*5*5);
    }
    public static void main(String[] args) {
       cube();
    }
    }
    

