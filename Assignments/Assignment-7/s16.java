// count elements divisible by 2
class Demo{
			public static void main(String [] args){
				int arr [] = {2,4,5,6,9};
				int result = f(arr,0,2);
				System.out.println(result);
			}
			static int f(int arr [] , int i, int x){
				if(i == arr.length){
					return 0;
				}
				int count = 0;
				if(arr[i]%x==0){
					count ++;
				}
				return count + f(arr,i+1,x);
			}
}

/*
o/p-3
*/