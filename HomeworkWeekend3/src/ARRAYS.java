import java.util.Arrays;
//import java.util.Scanner;


public class ARRAYS {
// METHOD#1 
	public static boolean equalArrays(int n, int m) {
		
		int[] array1 = new int[n];
		int[] array2 = new int[m];
		int counter = 0;
		
	if(array1.length == array2.length) {
		for(int i=0; i<array1.length; i++) {
			if(array1[i] == array2[i])
				counter++;
			}			
		}
	if(counter == array1.length && counter == array2.length)
			return true;
	else
		return false;
	}
	//METHOD#2
	public static int[] sumOfArrays(int[] a, int[] b) {
		
	if(a.length > b.length) {
		int[] sum = new int[a.length];
		for(int i=0; i<b.length; i++) {
			sum[i] = b[i] + a[i]; 
		}
		for(int j=b.length; j<a.length; j++) {
			sum[j] += a[j];
		} return sum;
	}else {
		int[] sum = new int[b.length];
		for(int i=0; i<a.length; i++) {
			sum[i] = b[i] + a[i]; 
		}
		for(int j=a.length; j<b.length; j++) {
			sum[j] += b[j];
	}
		return sum;
	}
}
	// METHOD#3 
	public static int[] Arrays2in1(int[] a, int[] b) {
		int leng = a.length + b.length;
		int counter = 0;
		int[] sum = new int[leng];
		
		for(int i=0; i<a.length; i++) {
			sum[i] += a[i];
		}
		for(int i=a.length; i<leng; i++) {
			sum[i] += b[counter];
			counter++;
	}
		return sum;
	}
	
	 //MAIN#2 AND MAIN#3
	public static void main(String[] args) {
		
		int[] a = new int[]{1,2,3,4,5};
		int[] b = new int[]{1,2,3,4,5};
		
		System.out.println(Arrays.toString(Arrays2in1(a,b)));
	
	
	// MAIN#1 
/*	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input length of first and second array");
		int n = input.nextInt();
		int m = input.nextInt();
		
		int[] array1 = new int[n];
		int[] array2 = new int[m];
		
		System.out.println("Insert num in first array");
		for(int i=0; i<n; i++) {
			array1[i] = input.nextInt();
		}
		System.out.println("Insert num in second array");
		for(int j=0; j<m; j++) {
			array2[j] = input.nextInt();
		}
			System.out.println(equalArrays(n,m));
		input.close();*/
	
}
}
		
		
		
	
	