//print divisors of number 
class Demo{
				public static void main(String [] args){
					int n = 12;
					for(int i=1;i<=n;i++){
						if(n%i==0){
							System.out.print(i+" ");
						}
					}
				}
}

/*
o/p-1 2 3 4 6 12

*/