package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline;

	int run() {

		gasoline -= 1;

		int run = 0;

		if (gasoline >= 0) {
			run = new java.util.Random().nextInt(16);
		} else {
			run = -1;
		}

		return run;

	}
}
