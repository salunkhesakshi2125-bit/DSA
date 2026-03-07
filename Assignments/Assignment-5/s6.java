//Armstrong number 
class Demo{
				public static void main(String [] args ){
					int n = 153;			
					int sum = 0;
					int num = n;
					while(n>0){
						int rem = n%10;
						sum = sum +(rem*rem*rem);
						n = n/10;
					}
					if(num == sum){
						System.out.println("Armstrong number ");
					}
					else{
						System.out.println(" Not Armstrong number ");
					}
				}
}

/*
o/p-Armstrong number

*/