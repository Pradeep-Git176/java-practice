package may;

public class ArraySorting {
	 public void sortingArray(int[] num) {

	        num = new int[] { 34, 545, 2, 1, 14, -54, 4 };

	        for (int i = 0; i < num.length; i++) {

	            for (int j = i + 1; j < num.length; j++) {
	                int temp = 0;
	                if (num[i] > num[j]) {
	                    temp = num[i];
	                    num[i] = num[j];
	                    num[j] = temp;
	                }
	            }
	            System.out.print(num[i] + "\t");
	        }

	    }

	    public static void main(String[] args) {
	        ArraySorting arysort = new ArraySorting();
	        arysort.sortingArray(null);
	    }

	}


