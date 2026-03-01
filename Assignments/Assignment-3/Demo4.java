class Demo4{
			public static void main(String []args){
				int n=4;
				int count=1;
				for(int i=1;i<=n;i++){
					for(int j=1;j<=n-i;j++){
						System.out.print(" ");
					}
					for(int k=1;k<=i;k++){
						System.out.print(count+" ");
						count++;
					}
					System.out.println();
				}

				for(int i= n-1;i>=1;i--){
					for(int j=1;j<=n-i;j++){					
						System.out.print(" ");
					}
					for(int k=1;k<=i;k++){
						System.out.print(count+ " ");
						count++;
					}
					System.out.println();
				}
			}
}



/*
o/p-

    1
   2 3
  4 5 6
 7 8 9 10
 11 12 13
  14 15
    16
*/				