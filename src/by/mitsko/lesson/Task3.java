package by.mitsko.lesson;

public class Task3 {

	public static void main(String[] args) {
		int b[] = new int[100];
		for (int i = 0, j = 2; i < 100; i=i+2, j=j+2) {
			b[i] = j;

			System.out.println(b[i]);
	}
	}
}
