package section.thirteen.threads;

/**
 * Created by cravo on 13/09/2016.
 */
public class ThreadTests {

	public static void main(String... args) {
		new Thread(() -> System.out.println("Running")).start();
		new Thread(() -> System.out.println("Running2")).start();
		new Thread(() -> System.out.println("Running3")).start();
		new Thread(() -> System.out.println("Running4")).start();
		new Thread(() -> System.out.println("Running5")).start();
		new Thread(() -> System.out.println("Running6")).start();
		new Thread(() -> System.out.println("Running7")).start();
	}
}
