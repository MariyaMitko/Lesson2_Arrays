package by.mitsko.lesson;

public class Task8 {

	public static void main(String[] args) {
		int b[] = new int[100];
		for (int i = 0, j = 1; i < 100; i++, j++) {
			b[i] = (int) (Math.random() * 101);
			System.out.print( b[i]+ " ");
	}
		int temp = 0;
		for (int i = 0, j = 1; i < 100; i=i+2, j=j+2) {
			if (b[i]%2 == 0 && b[i+1]%2 !=0) {
			temp = b[i];
			b[i] = b[i+1];
			b[i+1] = temp;
		}
		} System.out.println(); 
		
			for (int i = 0; i<100; i++) {
				System.out.print( b[i]+" ");	
			}
			}
}



