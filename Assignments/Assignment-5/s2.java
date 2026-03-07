//Extract digit
class Demo{
				public static void main(String [] args){
					int n = 5382;
					while(n>0){
						int rem = n%10;
						System.out.println(rem);
						n = n/10;
					}
				}
}

/*
o/p-
2
8
3
5
*/