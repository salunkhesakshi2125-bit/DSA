class Demo{
			public static void  main(String [] args){
				int n = 2;
				fun(n);
			}
			 static void fun(int n){
				if(n==0){
					return;
				}
				fun(n-1);
				System.out.print(n*n+" ");	
				fun(n-1);	
			}
}

/*
o/p- 1 4 1
*/			