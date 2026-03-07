//palindrome number 
class Demo{
				public static void main(String [] args){
					int n = 121;
					int rev = 0;
					int num = n;
					while (n>0){
						int rem = n%10;
						rev = rev *10+rem;
						n = n/10;
					}
					if(rev==num){
						System.out.println("Palindrome number ");
					}
					else{
						System.out.println(" Not palindrome  ");
					}
				}
}

/*
o/p-
Palindrome number

*/