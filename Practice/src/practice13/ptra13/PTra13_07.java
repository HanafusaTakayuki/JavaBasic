/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		SuperHero hero = new SuperHero();
		Slime slime = new Slime();
		hero.setName("勇者（装備あり）");
		slime.setName("スライム");

		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		Item item = new Item("こんぼう", 4);

		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
		hero.setEquipment(item);

		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

		boolean game = false;
		String win, lose;

		while(true) {

			Attack(hero.getName());
			game = slime.damage(hero.attack());
			if (game) {
				Death(slime.getName());
				win = hero.getName();
				lose = slime.getName();
				break;
			}

			Attack(slime.getName());
			game = hero.damage(slime.attack());
			if (game) {
				Death(hero.getName());
				win = slime.getName();
				lose = hero.getName();
				break;
			}

		}

		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		System.out.println(win + "は" + lose + "との戦闘に勝利した");
	}

	static void Attack(String name){
		System.out.println(name + "の攻撃");
	}

	static void Death(String name) {
		System.out.println(name + "は倒れた\n");
	}
}


