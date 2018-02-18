package by.mitsko.lesson;

public class Task6 {

	public static void main(String[] args) {
		int b[] = new int[100];
		for (int i = 0, j = 1; i < 100; i++, j++) {
			b[i] = j;
			System.out.print( b[i]+" ");
	}
		int temp = 0;
		for (int i = 0, j = 1; i < 100; i=i+2, j=j+2) {
			temp = b[i];
			b[i] = b[j];
			b[j] = temp;
		}
			System.out.println();
		
			for (int i = 0; i<100; i++) {
				System.out.print( b[i]+" ");	
			}
			}
}
