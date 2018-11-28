
public class Lab5 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Section cap1 = new Section("Play boy");
		cap1.add(new ImageProxy("Pamela Anderson"));
		Section cap2 = new Section("Auto Show");
		cap2.add(new ImageProxy("My dream BMW"));
		cap2.add(new ImageProxy("My car is a Trabi"));
		cap1.print();
		cap2.print();
		long endTime = System.currentTimeMillis();
		System.out.println("Time: " + (endTime - startTime));
	}
}
