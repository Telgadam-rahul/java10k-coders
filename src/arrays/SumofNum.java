package arrays;

public class SumofNum {
	
    
	public static void main(String[] args) {
		int[] arr =UtilitiesArrays.getArray();
		if(arr!=null) {
			int sum=0;
			for(int i:arr) {
				
				sum+=i;
			}
			
			System.out.println("the sum of elements is:"+sum);
           
           }
		
			else {
				System.out.println("invalid");
			}
	}

}
