//check if any element is negative
class Demo{
			public static void main(String [] args){
				int arr[] = {1, 2, -3, 4};
				Boolean result = f(arr,0);
				System.out.println("negative element present: "+result);
			}
			static Boolean f(int arr[], int i){
				if(i==arr.length){
					return false;
				}
				if(arr[i]<0){
					return true;
				}
				return f(arr,i+1);
			}
}
/*
o/p- negative element present: true
*/