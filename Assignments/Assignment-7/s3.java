// count occurrences 
class Demo{
			public static void main(String args[]){
				int arr[] = {1, 2, 2, 3, 2};
				int target = 2;
				int result = f(arr,0,target);
				System.out.println("occurrences of target: "+result);
			}
			static int f(int arr[] , int i ,int target){
				if(i==arr.length){
					return 0;
				}
				int count = 0;
				if(arr[i]==target){
					count++;						
				}
				return count+f(arr, i+1,target);
			}
}
/*
o/p- occurrences of target: 3
*/