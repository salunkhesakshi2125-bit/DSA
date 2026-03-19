class Demo{
			public static void  main(String [] args){
				int n = 3;
				fun(n);
			}
			 static void fun(int n){
				if(n<=0){
					return;
				}
				System.out.print("A"+n+" ");	
				fun(n-1);
				System.out.print("B"+(n*2)+" ");	
			}
}

/*
o/p- A3 A2 A1 B2 B4 B6
*/			