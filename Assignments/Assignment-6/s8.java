class Demo{
			public static void  main(String [] args){
				int n = 4;
				fun(n);
			}
			 static void fun(int n){
				if(n<=0){
					return;
				}
				fun(n-1);
				System.out.print(n+" ");	
				fun(n-2);
			}
}

/*
o/p- 1 2 3 1 4 1 2
*/			