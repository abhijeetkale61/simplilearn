package assistedproject;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,8};
		int length = arr.length;
	    selectionSort(arr);
	    System.out.println("The sorted elements are:");
	    for(int i:arr){

	        System.out.println(i);
	         }
	     }

	    public static void selectionSort(int[] arr){

	        for(int i=0;i<arr.length-1;i++){

	            int index =i;
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[j]<arr[index]){

	                    index =j;
	                }

	            }
	            int smallNumber = arr[index];
	            arr[index]= arr[i];
	            arr[i]= smallNumber;
	        }

	    }

	}


