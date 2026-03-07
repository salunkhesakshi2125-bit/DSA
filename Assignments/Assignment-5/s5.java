//sum of digit 
class Demo{
				public static void main(String [] args ){
					int n = 543;
					int sum = 0;
					while(n>0){
						int rem = n%10;
						sum =  sum + rem;
						n = n/10;
					}
					System.out.println(sum);
		
				}
}

/*
o/p-12

*/