public class UglyHarshad {
//     public static void main(String[] args) {

//         int num = 30; 
//         int temp = num; 

//         if (num <= 0) {
//             System.out.println(num + " is NOT an Ugly Number");
//         } else {

            
//             while (temp % 2 == 0) {
//                 temp /= 2;
//             }

            
//             while (temp % 3 == 0) {
//                 temp /= 3;
//             }

            
//             while (temp % 5 == 0) {
//                 temp /= 5;
//             }

//             if (temp == 1) {
//                 System.out.println(num + " is an Ugly Number");
//             } else {
//                 System.out.println(num + " is NOT an Ugly Number");
//             }
//         }
//     }
// }

//     public void harshad(int num){
//         int temp =num;
//         int sum =0;
//         while(temp>0){
//           int result=  temp%10;
//           sum = sum+result;
//           temp/=10;
//         }
//         if(num%sum==0){
//             System.out.println("harshad");
//         }
//         else{
//             System.out.println("not harshad");
//         }
//     }
//     public static void main(String[] args) {
//         UglyHarshad obj1 = new UglyHarshad();
//         obj1.harshad(18);
//     }
// }
