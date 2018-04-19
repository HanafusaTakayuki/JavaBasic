package practice10;
/*
 * PTra10_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_04 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ User型の変数が3つ入る配列usersを宣言・確保してください
		User[] users = new User[3];
		for (int user = 0; user < users.length; user++) {
			users[user] = new User();
		}


		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		// ★ usersのサイズ分繰り返す制御構文を記述してください
		//----------- ループ start
		for (int count = 0 ; count < users.length; count++) {

			System.out.println((count + 1) + "人目の情報を入力します");		/* ##には、カウントを入れてください */
			System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

			// ★ コマンドプロンプトに入力された値を、String型の変数lineに格納してください
			String line = scanner.nextLine();

			// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
			String[] lineArray = line.split(",");

			// ★ 配列にした値を、users[カウント]の各フィールドに代入してください
			// ★ ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
			users[count].userId   = Integer.parseInt(lineArray[0]);
			users[count].userNm   = lineArray[1];
			users[count].mail     = lineArray[2];
			users[count].password = lineArray[3];
		}
		//----------- ループ end

		// ★ usersに格納されている全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
		for (int i = 0; i < users.length; i++) {
			System.out.println("===================================");
			System.out.println("USER_ID\t\t:" + users[i].userId);
			System.out.println("USER_Name\t:" + users[i].userNm);
			System.out.println("Mail\t\t:" + users[i].mail);
			System.out.println("Password\t:" + users[i].password);
		}

		System.out.println("===================================");

	}
}
