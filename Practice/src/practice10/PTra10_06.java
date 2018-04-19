package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		Car[] cars = new Car[3];
		cars[0] = new Car();
		cars[1] = new Car();
		cars[2] = new Car();

		cars[0].color = "Gray";
		cars[1].color = "Red";
		cars[2].color = "Yellow";

		cars[0].gasoline = 30;
		cars[1].gasoline = 60;
		cars[2].gasoline = 100;


		// 目的地までの距離
		final int DISTANCE = 500;

		for (int i = 0; i < cars.length; i++) {

			// 進んだ距離と時間とガソリンを初期化
			int n = 0;
			int x = 0;
			int totalDistance = 0;

			while(true) {
				totalDistance += cars[i].run();
				x = cars[i].gasoline;

				/*
				System.out.print("進んだ距離: " + cars[i].run);
				System.out.print("\tのこり距離: " + (DISTANCE - totalDistance));
				System.out.println("\t ガソリン: " + x);
				*/

				n++;
				if (x < 0) {
					System.out.println(cars[i].color + "の車は目的地に到達できませんでした。");
					break;
				}
				if (totalDistance >= DISTANCE) {
					System.out.println(cars[i].color + "の車は目的地まで" + n + "時間かかりました。");
					System.out.println("残りのガソリンは、" + x + "リットルです。");
					break;
				}
			}
		}

	}
}
