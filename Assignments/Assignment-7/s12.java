// check strictly increasing
class Demo{
			public static void main(String [] args){
				int arr [] ={1, 2, 3, 3};
				Boolean  result = f(arr,0);
				System.out.println(result);
			}
			static Boolean f(int arr [] , int i){
				if(i == arr.length-1){
					return true;
				}
				if(arr[ i ]>=arr[i+1]){
					return false;
				}
				 return f(arr, i+1);
			}
}

/*
o/p-false
*/