//check if array contain target
class Demo{
			public static void main(String[] args){
				int arr [] = {1, 2, 3, 4};
				Boolean result = f(arr,0,3);
				System.out.println(result);
			}
			static Boolean f(int arr [] , int i , int target){
				if(i == arr.length){
					return false;
				}
				if(arr[i] == target){
					return true;
				}
				return f(arr,i+1,target);
			}
}

/*
o/p-true
*/