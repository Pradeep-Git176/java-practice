package april;

public class SortingArray {
	 public static void main(String[] args) {
	        int[] arr = {67,89,45,67,89,23,45,13,46,79,87,56};
	        
	        for(int i=0;i<arr.length;i++) {
	            for(int j=i+1;j<arr.length;j++) {
	                int temp=0;
	                
	            if(arr[i]<arr[j]) {
	                temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;                                                                          
	            }
	            }
	            System.out.println(arr[i]);
	        }
	        
	        
	     }
	}

