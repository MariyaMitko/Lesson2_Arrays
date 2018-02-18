package by.mitsko.lesson;

public class Task10 {

	public static void main(String[] args) {
		int b[] = new int[50];
		int c[] = new int[50];
		for (int i = 0, j = 1; i < 50; i++, j++) {
			b[i] = (int) (Math.random() * 50);
			System.out.print(b[i] + " ");
		}
		System.out.println();
		for (int i = 0, j = 1; j < 50; i++, j++) {
			c[i] = (int) (Math.random() * 50);
			System.out.print(c[i] + " ");
		}

		System.out.println();

		int temp1 = 0;
		for (int i = 0, j = 1; j < 50; i = i + 2, j = j + 2) {
			temp1 = c[i];
			c[i] = b[j];
			b[j] = temp1;
		}
		System.out.println();
		for (int i = 0; i < 50; i++) {

			System.out.print(b[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < 50; i++) {
			System.out.print(c[i] + " ");

		}
	}

}
