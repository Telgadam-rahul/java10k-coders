public class Loanapproval {
    public String  checkLoanApproval(double salary, int creditScore){
        if(salary>80000.0d&&creditScore>750){
            return "loan approved immediately";
        }
        
        else if(salary>=50000.0d&&salary<80000.0d&&creditScore>=650&&creditScore<750){
            return "loan approved with higher intrest";
        } 
        else if(salary>=30000.0d&&salary<50000.0d&&creditScore>=500&&creditScore<650){
            return "Co-signed Required";
        }
       else{
        return "not eligible";
       }
        }
        public static void main(String[] args) {
            System.out.println(new Loanapproval().checkLoanApproval(20000.0d,300));
            
            
        }
    }
    

