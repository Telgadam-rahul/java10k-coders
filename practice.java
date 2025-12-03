public class practice {
    public void factorial(int num) {
        int fact = 1;
        while (num>= 1) {
            fact = fact * num;
            num--;
        }
            System.out.println(fact);
        
    }
    public void midchar(String name){
        int len = name.length();
       if(len%2==0){
        int first = (len/2)-1;
        int second = len/2;
        for(int i = 1;i<=len;i++){
            if(i==first){
                System.out.print(name.charAt(first));
            }
            if(i==second) {
                System.out.print(name.charAt(second)); 
            }
        }
    }
             else {
                int len1 = name.length();
                int third = len/2;
                for (int n = 1; n < len1; n++) {
                if (n == third) {
                    System.out.print(name.charAt(third));
                }
            }
        }
             
       }

    public static void main(String[] args) {
        practice obj1 = new practice();
        obj1.factorial(3);
        obj1.factorial(4);
        obj1.midchar("wonder");
    }
}
