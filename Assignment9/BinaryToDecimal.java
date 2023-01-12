class BinaryToDecimal{
	static void printArr(int x[]){
		for(int p:x){
			System.out.println(p +" ");
		}
	}
	static void BinaryToDecimal(int x[]){
		int sum = 0;
		int power = 1;
		for ( int i = 0; i<x.length;i++){
			sum+=(x[i]*power);
			power*=2;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int arr[]={1,1,1,0};
		BinaryToDecimal(arr);
	}
}
