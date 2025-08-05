package curriculumA;

public class Qes6to13 {

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

		age = 30;

		height = 168.5;

		weight = 64.2;

		food = "オムライス";

		System.out.println();//改行用
		System.out.println("初めまして" + name + "です");

		System.out.println("年齢は" + age + "歳です");

		System.out.println("身長は" + height + "cmです");

		System.out.println("体重は" + weight + "kgです");

		System.out.println("好きな食べ物は" + food + "です");

		System.out.println("BMIは" + (weight / ((height / 100) * (height / 100))) + "です");
		//		↑↑↑↑ここまでQ8↑↑↑↑

		System.out.println(); //改行用
		System.out.println(age >= 25);
		//		↑↑↑↑ここはQ10↑↑↑↑

		/*String strAge = String.valueOf(age);
		
		String strHeight = String.valueOf(height);
		
		String strWeight = String.valueOf(weight);
		
		System.out.println();//改行用
		System.out.println(strAge + strHeight + strWeight);*/
		//		↑↑↑↑ここはQ11↑↑↑↑  

		String input1 = "30";

		int number1 = Integer.parseInt(input1.trim());

		System.out.println(number1);

		String input2 = "168.5";

		double number2 = Double.parseDouble(input2);

		System.out.println(number2);
		//		ここはQ12

		System.out.println();//改行用
		boolean bool = (number1 >= 25 || number2 >= 160);
		System.out.println(bool);

		//		ここはQ13

		name = "鈴木一郎";

		age = age + 24;

		height = height + 168.5;

		weight = weight + 64.2;

		food = "オムライス";

		double bmi2 = weight / ((height / 100) * (height / 100));

		System.out.println();//改行用
		System.out.println("初めまして" + name + "です");

		System.out.println("年齢は" + age + "歳です");

		System.out.println("身長は" + height + "cmです");

		System.out.println("体重は" + weight + "kgです");

		System.out.println("好きな食べ物は" + food + "です");

		String.format("%.1f", bmi2);

		double bmi3 = ((double) Math.round(bmi2 * 100)) / 100;
		System.out.println("BMIは" + bmi3 + "です");
		//		↑↑↑↑ここまでQ9↑↑↑↑

	}

}
