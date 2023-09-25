
public class Sorting {
	static void sorting(int a[]){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				}
			}
		System.out.println("The Sorted Array is: ");
		for(int val:a) {
		System.out.print(val+" ");
		}
	}
	public static void main(String[] args) {
		int[] num = {32,43,12,23,56,45,67,56};
		sorting(num);
	}

}
