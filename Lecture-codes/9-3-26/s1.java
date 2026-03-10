import java .util.*;
class Demo{
				public static void main(String []args){
					Scanner sc= new Scanner(System.in);
					System.out.println("enter number :");
					int n = sc.nextInt();
					int sqr=(n*n);
					
					if(sqr%100==n){
						System.out.println("Automorphic");
					}
					else{
						System.out.println(" Not Automorphic");
					}
				}
}

/*
o/p-
enter number :
25
Automorphic
*/