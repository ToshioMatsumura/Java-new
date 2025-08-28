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
package sub;

import java.util.Random;

public class Character {

	private String name; // 名前

	private int hp; // HP

	private int mp; // MP

	private int attack; // 攻撃力

	private int speed; // 素早さ

	private int defense; // 防御力

	public Character(String name) {

		this.name = name;

		Random rand = new Random();

		this.hp = rand.nextInt(1000); // 0〜999
		this.mp = rand.nextInt(1000);
		this.attack = rand.nextInt(500);
		this.speed = rand.nextInt(1000);
		this.defense = rand.nextInt(100);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	class Adventurer extends Character {
		public Adventurer(String name) {
			super(name); // スーパークラス(Player)のコンストラクタ呼び出し
		}
	}
}