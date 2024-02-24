package Package;

public class algos {
	void binary_search(int[] a, int size, int target) {
		  int l = 0;
		  int r = size - 1;
		  
		  while (l<=r)
		  {
			  int mid = l + (r-l) / 2;
			  int value = a[mid];
			  System.out.println("The Middle Value Is:" + value);
			  
			  if(value < target)
			  {
				  l = mid + 1;
			  }
			  else if(value > target)
			  {
				  r = mid - 1;
			  }
			  else {
				  System.out.println(mid);
				  return;
			  }
		  }
		  System.out.println("FAILURE");
		}
		
	    void bubs(int[] a, int n) {
	    	
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < a.length - 1; j++) { 
	                if (a[j] > a[j + 1]) {
	                    swap(a, j, j + 1); 
	                }
	            }
	        }
	    }

	    
	    void insertion(int[] array, int n) {
	      /* Key is aka temp.*/
	      for(int i = 1; i < n; i++) {
	    	  int key = array[i];
	    	  int j = i - 1;
	    	  
	    	  // Check if we need to shift element the right
	    	  while(j>=0 && array[j]>key)
	    	  {
	    		  array[j+1] = array[j];
	    		  j--;
	    	  }
	    	  // Insert key into opening
	    	  array[j+1] = key;
	      }
	    }
	    
	    void Quick_Sort(int[] a, int start, int end) {
	      if(end <= start) return;						// base case
	      int pivot = partition(a, start, end);
	      Quick_Sort(a, start, pivot - 1);
	      Quick_Sort(a, pivot + 1, end);
	    }
	    int partition(int[] a, int start, int end) {
	      int pivot = a[end];
	      int i = start - 1;
	      for(int j = start; j <= end - 1; j++) {
	        if (a[j] < pivot) {
	    	  i++;
	    	  int temp = a[i];
	    	  a[i] = a[j];
	    	  a[j] = temp;
	    	}
	      }
	      i++;
		  int temp = a[i];
		  a[i] = a[end];
		  a[end] = temp;
	      
	    	
	      return i;
	    }
	    
	    
	    public static void swap(int[] array, int i, int j) {
	    	
	        if (i >= 0 && i < array.length && j >= 0 && j < array.length) {
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
}
