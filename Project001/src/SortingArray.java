
public class SortingArray {
	
		public int secHighestNum(int[] arr,int num) {
			int min=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<arr[min]) {
						min=j;
					}
				}
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
				
			}
			return arr[num-1];
		}
	}



