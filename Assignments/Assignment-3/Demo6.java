class Demo6 {
    				public static void main(String[] args) {
       					int n = 3;
        				int size = 2 * n - 1;

        				for (int i = 1; i <= size; i++) {
            					for (int j = 1; j <= size; j++) {
							int top = i;
                					int left = j;
                					int bottom = size - i + 1;
                					int right = size - j + 1;

                					int min = Math.min(Math.min(top, bottom),Math.min(left, right));
							int value = n - min + 1;

                					System.out.print(value + " ");
           					 }
           				 	System.out.println();
       					 }
    				}
}


/*

o/p-

3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3

*/