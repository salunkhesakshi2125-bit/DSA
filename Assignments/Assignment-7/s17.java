//sum of negative element
class Demo{
			public static void main(String [] args){
				int arr [] = {1,-2,3,-4,5};
				int sum = f(arr,0);
				System.out.println(sum);
			}
			static int f(int arr[] ,int i){
				if(i == arr.length){
					return 0;
				}
				int add =0;
				if(arr[i]<0){
					add = add+arr[i];
				}
				return add+f(arr,i+1);
				
			}
}

/*
o/p-
-6
*/