class Demo{
			public static void  main(String [] args){
				int n = 3;
				fun(n);
			}
			 static void fun(int n){
				if(n==0){
					return;
				}
				System.out.print(n+" ");
				fun(n-1);
				System.out.print((n+1)+" ");		
			}
}

/*
o/p- 3 2 1 2 3 4
*/			