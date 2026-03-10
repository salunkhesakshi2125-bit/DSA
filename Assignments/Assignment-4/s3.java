class Demo{
			public static void main(String[]args){
				int n = 4 ;
				for(int i = 1 ; i <= n ; i++){
					for(int j = 1 ; j <= n ; j++){
						System.out.print(i+" ");
					}
					System.out.println();
				}
			}
}

/*
o/p-
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4

time complexity : O(n^2)
space complexity : O(1)

*/