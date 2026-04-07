//find maximum element
class Demo{
			public static void main(String [] args){
				int arr [] = {3, 9, 1, 7};
				int max= f(arr,0);
				System.out.println("maximum element is:"+max);
			}
			static int f(int arr[], int i){
				if(i==arr.length-1){
					return arr[i];
				}
				int maximum = f(arr,i+1);
				return Math.max(arr[i],maximum);
			}
}
/*
o/p- maximum element is:9
*/