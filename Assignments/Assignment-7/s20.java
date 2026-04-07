//find the sum of digits of elements
class Demo{
			public static void main(String[]args){
				int [] arr = {12, 34, 5};
				int result = f(arr,0);
				System.out.println(result);
			}
			static int f(int [] arr , int i){
				if(i == arr.length){
					return 0;
				}
				int sum = 0;
				int temp = arr[i];
				while(temp != 0){
				sum += temp % 10;
				temp = temp / 10;
			}

			return sum + f(arr,i+1);
		}
}

/*
o/p-15
*/