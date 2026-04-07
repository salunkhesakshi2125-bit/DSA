// count elements greater than 3
class Demo{
			public static void main(String [] args){
				int arr [] ={1, 5, 3, 7, 2};
				int result = f(arr,0,3);
				System.out.println(result);
			}
			static int f(int arr[] , int i , int x){
				if(i == arr.length){
					return 0;
				}
				int count = 0;
				if(arr[i]>x){
					count++;
				}
				return count + f(arr,i+1,x);
			}
}

/*
o/p-2
*/