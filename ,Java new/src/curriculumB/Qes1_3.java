package curriculumB;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//		System.out.println("ユーザー名を入力してください。");

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.print("ユーザー名を入力してください: ");

		String username = scanner.nextLine();
		//		入力できるようになる

		if (username.length() > 10) {
			System.out.println("名前を10文字以内にしてください");

		} else if (username == null || username.length() == 0) {
			System.out.println("名前を入力してください");

		} else if (!username.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("半角英数字のみで名前を入力してください");

//			return;

		} else {
			System.out.println("ユーザー名「" + username + "」を登録しました");
		}
		int rounds = 0; //じゃんけんの回数をカウントするため

		boolean win = false;//勝ったかの判断

		while (!win) { //勝つまでループする
			rounds++;

			System.out.println("手を選んでください (0: グー, 1: チョキ, 2: パー)");
			int playerChoice = scanner.nextInt();

			int opponentChoice = random.nextInt(3);

			String[] hands = { "グー", "チョキ", "パー" };
			System.out.println(username + "の手は「" + hands[playerChoice] + "」");
			System.out.println("相手の手は「" + hands[opponentChoice] + "」");

			if (playerChoice == opponentChoice)
				System.out.println("DRAW あいこ もう一回しましょう！");

			else if ((playerChoice == 0 && opponentChoice == 1) || (playerChoice == 1 && opponentChoice == 2)
					|| (playerChoice == 2 && opponentChoice == 0)) {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				win = true; // 勝ったのでゲーム終了
			} else {
				// 負けた場合のメッセージ
				if (playerChoice == 0) {
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");

				} else if (playerChoice == 1) {
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");

				} else if (playerChoice == 2) {
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
				}
			}
		}

		// 勝つまでにかかった回数を表示
		System.out.println("勝つまでにかかった合計回数は" + rounds + "回です");
		scanner.close();

	}
}
