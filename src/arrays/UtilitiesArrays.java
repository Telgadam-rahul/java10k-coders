package arrays;
import java.util.Scanner;
public interface UtilitiesArrays {
	public static int[]  getArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		if(size<=0) {
			return null;
		}
		else {
			int[] arr = new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("enter " + i  +  " index value:");
				int ele = sc.nextInt();
				
				arr[i]= ele;
			}
			return arr;
		}
	}

}
