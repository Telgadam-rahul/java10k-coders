package arrays;
import java.util.Scanner;
public class Element {

	public static void main(String[] args) {
		int[] arr =UtilitiesArrays.getArray();
		if(arr!=null) {		
		System.out.print("the element are:");
		for(int e :arr) {
			System.out.println(e+ " ");
		}
		}
		else {
			System.out.println("invalid array");
	}
		Scanner rs= new Scanner(System.in);
		System.out.println("enter the element:");
		int rel=rs.nextInt();
		boolean search=false;
		 int position=-1;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==rel) {
				 search=true;
				 position=i+1;
				 break;
				 
			 }
		 }
		 if(search) {
			 System.out.println("element find at position:"+position);
			 }
		 else {
			 System.out.println("element not found in array");
		 }
		 }
	
	
}
