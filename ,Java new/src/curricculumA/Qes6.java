package curricculumA;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String name = "山田太郎";

		int age = 18;

		double height = 170.5;

		double weight = 62.2;

		String food = "寿司";

		System.out.println("初めまして" + name + "です");

		System.out.println("年齢は" + age + "歳です");

		System.out.println("身長は" + height + "cmです");

		System.out.println("体重は" + weight + "kgです");

		System.out.println("好きな食べ物は" + food + "です");

		System.out.println("BMIは" + (weight / ((height / 100) * (height / 100))) + "です");
		//	↑↑↑↑ここまでQ6と7↑↑↑↑

		name = "鈴木一郎";

		age = 24;

		height = 168.5;

		weight = 64.2;

		food = "オムライス";

		System.out.println();
		System.out.println("初めまして" + name + "です");

		System.out.println("年齢は" + age + "歳です");

		System.out.println("身長は" + height + "cmです");

		System.out.println("体重は" + weight + "kgです");

		System.out.println("好きな食べ物は" + food + "です");

		System.out.println("BMIは" + (weight / ((height / 100) * (height / 100))) + "です");
		//		↑↑↑↑ここまでQ8↑↑↑↑

		name = "鈴木一郎";

		age = age + 24;

		height = height + 168.5;

		weight = weight + 64.2;

		food = "オムライス";

		double bmi2 = weight / ((height / 100) * (height / 100));

		System.out.println();
		System.out.println("初めまして" + name + "です");

		System.out.println("年齢は" + age + "歳です");

		System.out.println("身長は" + height + "cmです");

		System.out.println("体重は" + weight + "kgです");

		System.out.println("好きな食べ物は" + food + "です");

		String.format("%.1f", bmi2);

		double bmi3 = ((double) Math.round(bmi2 * 100)) / 100;
		System.out.println("BMIは" + bmi3 + "です");
	}

}
