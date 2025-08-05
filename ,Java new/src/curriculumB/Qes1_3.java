package curriculumB;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//		System.out.println("ユーザー名を入力してください。");

		Scanner scanner = new Scanner(System.in);

		System.out.print("ユーザー名を入力してください: ");

		String username = scanner.nextLine();
//		入力できるようになる

		if (username.length() > 10) {
			System.out.println("名前を10文字以内にしてください");

		} else if (username == null || username.length() == 0) {
			System.out.println("名前を入力してください");

		} else {
			System.out.println("ユーザー名「" + username + "」を登録しました");
		}

		scanner.close();
	}
}


