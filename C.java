   import java.util.Scanner;
   public class C{
    //1.number check
//     public void checkNumber(int num){
//      if(num>0){
//         System.out.println("positivenumber");
//     }
//      else if(num<0){
//     System.out.println("negative");
//     }
//     else{
//         System.out.println("zero");
//     }
//    }
//     public static void main(String[] args) {
//      C ref = new C();
     
//         ref.checkNumber(34);
//      }
// }
   // 2.greatest of three numbers
   // public static void main(String[] args) {
   //    int num1=20;
   //    int num2=40;
   //    int num3=30;
   //    if(num1>=num2&&num1>=num3){
   //       System.out.println("num 1 is greater");
   //    }
   //    else if(num2>=num1&&num2>=num3){
   //       System.out.println("num2 greater");
   //    }
   //    else{
   //       System.out.println("num3 is greater");
   //    }
      
   // }


   // }
   //3.leap year or not
//    public void leapYear(int year){

//         if (year % 400 == 0) {
//             System.out.println("Leap year");
//         } 
//         else if (year % 4 == 0 && year % 100 != 0) {
//             System.out.println("Leap year");
//         } 
//         else {
//             System.out.println("Not a leap year");
//    }
// }
// public static void main(String[] args) {
//    C ref =new C();
//    ref.leapYear(2020);
// }
// 4.vowel or consonant

//     public static void main(String[] args) {

//         char ch = 'a';

//         if (ch == 'a' || ch == 'e' || ch == 'i' || 
//             ch == 'o' || ch == 'u' ||
//             ch == 'A' || ch == 'E' || ch == 'I' ||
//             ch == 'O' || ch == 'U') {

//             System.out.println(ch + " is a vowel");
//         } 
//         else {
//             System.out.println(ch + " is a consonant");
//         }
//     }
// }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter an integer: ");
//         int num = sc.nextInt();
//         System.out.println("enter integer2 :");
//         int num2 =sc.nextInt();

//         if (num % 2 ==0) {
//             System.out.println(num + " is Even");
         
//         } else {
//             System.out.println(num + " is Odd");
         
//         }
//         if(num2 %2==0){
//          System.out.println(num2+"is even");

//         }
//           else {
      
//             System.out.println(num2+"is odd");
//         sc.close();
//     }
// }
//    }

 //6.marks
//     public static void main(String[] args) {

//         int marks = 82;

//         if (marks > 35) {          
//             System.out.println("Pass");

//             if (marks > 75) {      
//                 System.out.println("Distinction");
//             }

//         } else {
//             System.out.println("Fail");
//         }
//     }
// // }
//  public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         System.out.println("Choose operation:");
//         System.out.println("1. Addition (+)");
//         System.out.println("2. Subtraction (-)");
//         System.out.println("3. Multiplication (*)");
//         System.out.println("4. Division (/)");

//         int choice = sc.nextInt();

//         switch (choice) {
//             case 1:
//                 System.out.println("Result = " + (a + b));
//                 break;
//             case 2:
//                 System.out.println("Result = " + (a - b));
//                 break;
//             case 3:
//                 System.out.println("Result = " + (a * b));
//                 break;
//             case 4:
//                 if (b != 0)
//                     System.out.println("Result = " + (a / b));
//                 else
//                     System.out.println("Cannot divide by zero");
//                 break;
//             default:
//                 System.out.println("Invalid choice");
//         }

//         sc.close();
//     }
// }
// public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter age: ");
//         int age = sc.nextInt();

//         if (age >= 18) {
//             System.out.println("Eligible to vote");
//         } else {
//             System.out.println("Not eligible to vote");
//         }

//         sc.close();
//     }
// }
public static void main(String[] args) {

        int temp = 15;

        if (temp < 0) {
            System.out.println("Cold");
        } 
        else if (temp <= 20) {
            System.out.println("Warm");
        } 
        else {
            System.out.println("Hot");
        }
    }
}