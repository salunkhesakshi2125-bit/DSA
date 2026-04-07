// sum of element at odd index
class Demo{
			public static void main(String [] args){
				int arr [] = {10,20,30,40,50};
				int sum = f(arr,0);
				System.out.println("sum of elements at odd index: "+sum);
			}
			static int f(int arr[], int i ){
				if(i==arr.length){
					return 0;
				}
				int sum = 0;
				if(i%2!=0){
					sum=sum+arr[i];
				}
				return sum+f(arr,i+1);
			}
}
/*
o/p- sum of elements at odd index: 60
*/
				