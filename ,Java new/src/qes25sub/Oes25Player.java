/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
package qes25sub;

import java.util.Random;

public class Oes25Player extends Qes25Character {

	private static final Random rand = new Random();

	// コンストラクタ
	public Oes25Player(String name) {
		super(
				name,
				getRandomStatus(), // HP
				getRandomStatus(), // MP
				getRandomStatus(), // 攻撃力
				getRandomStatus(), // 素早さ
				getRandomStatus() // 防御力

		);
	}

	// ランダムなステータスを返すメソッド
	private static int getRandomStatus() {
		//    	private static final Random rand = new Random();

		return rand.nextInt(1000) + 1; // 1〜1000の数値
	}
}
