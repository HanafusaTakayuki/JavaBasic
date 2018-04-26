/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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
			while (scanner.hasNext()) {
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


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		Collections.shuffle(playerArr);
		int gk = 0,
			df = 0,
			mf = 0,
			fw = 0;

		for (Player player: playerArr) {
			switch(player.getPosition()){
				case "GK":
					if (gk < 1) {
						System.out.println(player.toString());
						gk++;
					}
					break;

				case "DF":
					if (df < 4) {
						System.out.println(player.toString());
						df++;
					}
					break;

				case "MF":
					if (mf < 4) {
						System.out.println(player.toString());
						mf++;
					}
					break;

				case "FW":
					if (fw < 2) {
						System.out.println(player.toString());
						fw++;
					}
					break;
			}
		}

//		for (Iterator<Player> it = playerArr.iterator(); gk < 1;){
//			Player player = it.next();
//			if (player.getPosition().equals("GK")) {
//				System.out.println(player.toString());
//				gk++;
//			}
//
//		}
//		for (Iterator<Player> it = playerArr.iterator(); df < 4;){
//			Player player = it.next();
//			if (player.getPosition().equals("DF")) {
//				System.out.println(player.toString());
//				df++;
//			}
//
//		}
//		for (Iterator<Player> it = playerArr.iterator(); mf < 4;){
//			Player player = it.next();
//			if (player.getPosition().equals("MF")) {
//				System.out.println(player.toString());
//				mf++;
//			}
//
//		}
//		for (Iterator<Player> it = playerArr.iterator(); fw < 2;){
//			Player player = it.next();
//			if (player.getPosition().equals("FW")) {
//				System.out.println(player.toString());
//				fw++;
//			}
//		}

	}
}
