//find index of smallest element 
class Demo{
			public static void main(String [] args){
				int arr [] = {5,2,8,1,3};
				int result = fun(arr,0);
				System.out.println(result);
			}
			static int fun(int [] arr , int i){
				if(i == arr.length-1){
					return i;
				}
				int min = fun(arr,i+1);
		
				if(arr[i] < arr[min]){
					return i;
				}
				return min;
			}
}

/*
o/p-3
*/