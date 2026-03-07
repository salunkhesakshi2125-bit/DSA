//Co-prime number
class Demo{
				public static void main (String [] args){
					int a=8;
					int b=15;
					int gcd=0;
					while(a!=0 && b!=0){		
						if(a>b){
							a=a%b;
						}else{
							b=b%a;
						}
					}
					if(a==0){
						gcd=b;
					}else{
						gcd=a;
					}
					if(gcd==1){
						System.out.println("Coprime number ");
					}else{
						System.out.println("not coprime number ");
					}
				}
}

/*
o/p- Coprime number

*/