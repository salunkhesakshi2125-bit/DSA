class Demo{
			public static void  main(String [] args){
				int n = 4;
				fun(n);
			}
			 static void fun(int n){
				if(n==0){
					System.out.print(n+" ");
					return;
				}
				fun(n-2);
				System.out.print(n+" ");	
				fun(n-2);	
			}
}

/*
o/p- 0 2 0 4 0 2 0
*/			