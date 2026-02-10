public class Greatest{
    public int largestOf3(int a,int b, int c){
        if((a>b)&&(a>c)){
            return a;
        }
        else
        if((b>a)&&(b>c)){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String [] args){
        Greatest obj1 = new Greatest();
        int result = obj1.largestOf3(10,20,50);
        System.out.println("the largest is:"+result);


        }
    }
    

