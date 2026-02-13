package arrays;

public class EvenOdd {

	public static void main(String[] args) {
	int[] arr =UtilitiesArrays.getArray();
	   
		   for(int ele:arr) {
			   if(ele%2==0) {
				   System.out.println("the given "+ele+" is even");
				   
			   }
			   else {
				   System.out.println("given array"+ele+" is odd");
			   }
	   }

	}

}
