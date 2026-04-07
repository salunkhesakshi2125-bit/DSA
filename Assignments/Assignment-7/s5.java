//check if all elements are even 
class Demo{
			public static void main(String [] args){
				int arr []= {2, 4, 6};
				Boolean result = f(arr,0);
				System.out.println("all elements are even: "+result);
			}
			static Boolean f(int arr [], int i){
				if(i==arr.length){
					return true;
				}
				if(arr[i]%2!=0){
					return false;
				}
				return f(arr,i+1);
			}
}
/*
o/p- all elements are even: true
*/