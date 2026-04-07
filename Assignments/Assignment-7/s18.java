//check all elements are unique
class Demo{
			public static void main(String[]args){
				int [] arr = {1,2,3,4};
				boolean result = f(arr,0);
				System.out.println(result);
			}

			static boolean f(int [] arr , int index){
				if(index == arr.length){
					return true;
				}

				for(int i = index+1 ; i < arr.length; i++){
					if(arr[i] == arr[index]){
						return false;
					}
				}
				return f(arr,index+1);
			}	
}

/*
o/p-true
*/