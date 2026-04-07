//find last occurrence 
class Demo{
			public static void main(String [] args){
				int arr[] = {5, 2, 3, 2, 4};
				int target = 2;
				int result = f(arr, arr.length-1, target);
				System.out.println("index of last occurrence of element : "+ result);
			}
			static int f(int arr [] , int i , int target){
				if(i<0){
					return -1;
				}
				if(arr[i]==target){
					return i;
				}
				return f(arr,i-1,target);
			}
}
/*
o/p- index of last occurrence of element : 3
*/