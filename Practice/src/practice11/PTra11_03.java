package practice11;
/*
 * PTra11_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_03 {

	/*
	 * ★ PTra11_03クラスに、クラスフィールドでint型のnumberを定義してください
	 */

	/*
	 * ★ PTra11_03クラスのコンストラクタを引数なしで定義してください
	 * ★ 処理は、クラスフィールドnumberに1を加算してください
	 */
	static int number;

	PTra11_03(){
		number += 1;
	}


	public static void main(String[] args) {

		// ★ sumメソッドを呼び出してください
		PTra11_03 var1 = new PTra11_03();
		PTra11_03 var2 = new PTra11_03();
		PTra11_03 var3 = new PTra11_03();
		PTra11_03 var4 = new PTra11_03();
		PTra11_03 var5 = new PTra11_03();

		var1.sum(1, 1);
		var2.sum(2, 2);
		var3.sum(3, 3);
		var4.sum(4, 4);
		var5.sum(5, 5);


	}

	public void sum(int x, int y) {
		System.out.println("sumメソッドを呼び出しました。" + x + "＋" + y + "＝" + (x + y));

		System.out.println("クラスフィールドnumber：" + number /* + ★ クラスフィールドnumberの出力をしてください */);
	}
}
