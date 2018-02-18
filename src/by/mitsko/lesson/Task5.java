package by.mitsko.lesson;

public class Task5 {

	public static void main(String[] args) {
		int b[] = new int[100];
		for (int i = 0, j = 1; i < 100; i++, j++) {
			b[i] = (int) (Math.random() * 100);
			if (b[i] % 2 == 0) {
				System.out.println(b[i]);
			}
		}
	}
}
