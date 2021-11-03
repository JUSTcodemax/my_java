package assignment;

public class Latin {

	public static void main(String[] args) {
		Latin la = new Latin();
		int k[][] = la.assigin(4);   //Assign values
		la.print(k);
	}
	int n;
	int data;
	int[][] arr;
	public int[][] assigin(int n){
		arr = new int[n][n];
		for(int row=0;row<arr.length;row++) {//arr.length=length of columns
			for(int col=0;col<arr[row].length;col++) {
				data = row+col+1;
				if(data<=n) {
					arr[row][col]=data;
				}
				else {
					arr[row][col]=data%n;
				}
			}
		}
		return arr;
	}
	public void print(int[][] arr) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
