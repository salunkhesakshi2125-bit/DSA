// check array is palindrome
class Demo{
			public static void main (String [] args){
				int arr [] = {1,2,3,2,1};
				Boolean result = f(arr, 0, arr.length-1);
				System.out.println("Array is palindrome: "+result);
			}	
			static Boolean f(int arr[], int start, int end){
				if(start >=end){
					return true;	
				}
				if(arr[start] != arr[end]){
					return false;
				}
				return f(arr,start+1,end-1);
			}
}
/*
o/p- Array is palindrome: true
*/