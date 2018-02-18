package by.mitsko.lesson;

public class Task9 { 

	public static void main(String[] args) {
		int b[] = new int[10];
        int min = b[0];
        
		for ( int i = 0;  i < 10; i++) {
			b[i] = (int)(20 + Math.random() * 40); 
			System.out.print(b[i] + " ");
			if (min>b[i] && b[i] !=0) {
           	min = b[i];
				}
           			}

		System.out.println("Minimum: " + min);
		System.out.println();
          for (int i = 0, j = 1; i<10; i++, j++) {
           double d = (double)b[i]/(double)min; 
	System.out.print(d+" ");
}
		}
}

