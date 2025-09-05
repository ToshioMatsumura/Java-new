
/*インスタンスフィールドの追加
問題1：インスタンスフィールドに「lastName」を追加しましょう


コンストラクタのオーバーロード
問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください

※順番はfirstNameの次

問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加し
lastNameフィールドの値をセットしてください*/
package self_introduction2;

class Person {
	private String name;
	private String lastName;
	private int age;
	private double height;
	private double weight;

	Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public void print() {
		System.out.println("名前は" + this.name() + "です");
		System.out.println("年は" + this.age() + "です");
	}
}