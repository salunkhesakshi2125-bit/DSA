// find second max
class Demo{
			public static void main(String args[]){		
				int arr [] = {10, 5, 8, 20, 15};
				int max1 = f1(arr, 0);
				int max2 = f2(arr , 0 , max1);
				System.out.println(max2);
			}
			static int f1(int arr[] , int i){
				if(i == arr.length-1 ){
					return arr[i];
				}
				int maximum = f1(arr , i+1);
				return Math.max(arr[i],maximum);
			}
			static int f2(int [] arr, int i, int max1){
				if(i == arr.length-1){
					return arr[i];
				}
				int maximum2 = f2(arr , i+1 , max1);

				if(arr[i] == max1){
					return maximum2;
				}
				return Math.max(arr[i] , maximum2);
			}

}

/*
o/p-15
*/
			