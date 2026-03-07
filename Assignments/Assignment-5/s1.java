//count digits 
class Demo{
		public static void main(String [] args){
			int n = 54321;
			int count = 0;
			while(n>0){
				int rem = n%10;
				count++;
				n = n/10;
			}
			System.out.println("Digits in number :"+count);
		}
}

/*
o/p-Digits in number :5

*/