
public class Dummy1 {
public static void main(String[] args) {
	int [] arr = {5,2,7,6,3,1};
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]+" ");
	int k=2;
	for(int i=0;i<arr.length;i=i+2) {
		arr[0]=arr[2];
		int pos = (i+k)%arr.length;
		arr[i]=arr[pos];
	}
}
}
