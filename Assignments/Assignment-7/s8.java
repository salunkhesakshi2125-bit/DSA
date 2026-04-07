////find maximum element
class Demo{
			public static void main(String [] args){
				int arr [] = {3, 9, 1, 7};
				int min= f(arr,0);
				System.out.println("minimum element is:"+min);
			}
			static int f(int arr[], int i){
				if(i==arr.length-1){
					return arr[i];
				}
				int minimum = f(arr,i+1);
				return Math.min(arr[i],minimum);
			}
}
/*
o/p- minimum element is:1
*/