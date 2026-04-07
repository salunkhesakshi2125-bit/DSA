//find first occurrence
class Demo{
			public static void main(String [] args){
				int arr[] = {5, 2, 3, 2, 4};
				int target = 2;
				int result = f(arr, 0, target);
				System.out.println("index of first occurrence of target :"+result);
			}
			static int f(int arr[], int i, int target){
				if(i==arr.length){
					return -1;
				}
				if(arr[i]==target){
					return i;
				}
				return f(arr, i+1,target);
			}
}
/*
o/p- index of first occurence of target :1
*/