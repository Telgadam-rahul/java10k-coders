public class Canvote {
    public  String canVote(int age){
        if(age>=18){
            return "elgible to vote";
        }
        else
        {
            return "not elgible to vote";
        }
        
        }
        public static void main(String[] args) {
            Canvote obj1 = new Canvote();
            String result = obj1.canVote(33);
             System.out.println(result);
                
                }
             }
    

