package ie.gcd.Assignment10;

public class QuickSort {

	public static void sort(int[] A, int low, int high){
		if(low<=high){
			int pivot= partition(A, low, high);
			sort(A,low,pivot-1);
			sort(A,pivot+1,high);
		}
	}
	public static int partition(int[] A, int low, int high){
		int x = A[low];
		while(true){
			while (A[high]>x){
				high--;
			}
			while (A[low]<x){
				low++;
			}
			if (low<high){
				int temp;
				temp = A[low];
				A[low] = A[high];
				A[high] = temp;
			}
			else{
				return high;
			}
		}
		
	}

	public static String arrayToString(int[] a){
		String stringArray ="";
		for(int i =0; i<a.length; i++){
			stringArray+= a[i] + " ";
		}
		return stringArray;

	}


	public static void main(String[] args){
		int[] a = new int[]{10,1,2,6,7};
		
		System.out.println(arrayToString(a));
		
		sort(a, 0, a.length-1);
		System.out.println(arrayToString(a));
	}
}
