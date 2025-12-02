package acticvities;

public class Activity4 {
public static void main(String[] args) {
	int[] nums= {30,12,33,1,24,3,99,20,34};
	insertionSort(nums);
	for(int num:nums) {
		System.out.println(num+" ");
	}
	}

public static void insertionSort(int[] arr) {
	for(int i=1;i<arr.length;i++) {
		int num=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>num) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=num;		
	}
}
}
