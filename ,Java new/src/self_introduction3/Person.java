
/*インスタンスフィールドの追加
問題1：インスタンスフィールドに「lastName」を追加しましょう


コンストラクタのオーバーロード
問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください

※順番はfirstNameの次

問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加し
       lastNameフィールドの値をセットしてください*/

package self_introduction3;

class Person {
	private static int count = 0;
	private String firstName;
	private String lastName; //追加した情報　
	private int age;
	private double height, weight;

	Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName; //ここも追加
		this.age = age;
		this.height = height;
		this.weight = weight;

		Person.count++;  //人数カウントを増やすもの
	}

	public String fullName() {
		return this.firstName + this.lastName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}