public class xhj {
	
	
	public int calcTotalTax(int elements,int[] a) {
		int totalTax=0;
		for(int i=0;i<elements;i++) {
			if(a[i]>=1000&&a[i]<2000) {
				totalTax +=100;
			}
			 if(a[i]>=2000&&a[i]<3000) {
				totalTax+=200;
			}
			 if(a[i]>=3000&&a[i]<4000) {
				totalTax+=300;
			}
			if(a[i]>=4000&&a[i]<5000) {
				totalTax+=400;
			}
		}
		return totalTax;
		
	}
	public static void main(String[] args) {
		
		xhj x = new xhj();
		int[] b = {1000,2000,3000,4000,5000};
		int elements = 5;
		System.out.println(x.calcTotalTax(elements, b));
		
		
		
	}

}
