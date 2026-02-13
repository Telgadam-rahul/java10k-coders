package arrays;

public class CopyNumber {

	public static void main(String[] args) {
		int[] arr = UtilitiesArrays.getArray(); 
		int[]a =new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			a[i]=arr[i];
		}
		for(int i:arr) {
			System.out.print("the copied elements from array are:"+" "+i);
		}

	}

}
