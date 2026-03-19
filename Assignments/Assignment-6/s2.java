class Demo{
			public static void  main(String [] args){
				int n = 2;
				fun(n);
			}
			 static void fun(int n){
				if(n==0){
					return;
				}
				System.out.print("X ");
				fun(n-1);
				System.out.print("Y ");	
				fun(n-1);	
			}
}

/*
o/p- X X Y Y X Y
*/			