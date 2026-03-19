class Demo{
			public static void  main(String [] args){
				int n = 8;
				fun(n);
			}
			 static void fun(int n){
				if(n<=1){
					System.out.print(n+" ");	
					return;
				}
				System.out.print(n+" ");	
				fun(n/2);
				System.out.print(n+" ");	
			}
}

/*
o/p- 8 4 2 1 2 4 8
*/			