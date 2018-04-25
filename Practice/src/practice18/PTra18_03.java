/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import practice18.entity.Player;


public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> playerArr = new ArrayList<>();

		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))){

			while(scanner.hasNext()) {

				String[] status = scanner.nextLine().split(",");
				Player player = new Player();
				player.setPosition(status[0]);
				player.setName(status[1]);
				player.setCountly(status[2]);
				player.setTeam(status[3]);
				playerArr.add(player);

			}

		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした");
		}

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
//		for (Player line: playerArr) {
//			if (line.getTeam().equals("レアル・マドリード") || line.getTeam().equals("バルセロナ")) {
//				System.out.println(line.getTeam());
//				playerArr.remove(line);
//			}
//		}

		Iterator<Player> it = playerArr.iterator();
		while(it.hasNext()) {

			Player player = it.next();
			if (player.getTeam().equals("レアル・マドリード") || player.getTeam().equals("バルセロナ")) {
//				System.out.println(player.toString());
				it.remove();
				}

		}

		// ★ 削除後のArrayListの中身を全件出力してください
		for (Player line: playerArr) {
			System.out.println(line.toString());
		}


	}
}
