/*package basicClass;

public class Animal {

	public static void main(String[] args) {
		Animal outer = new Animal();
		Dog dog1 = outer.new Dog();
		System.out.println(name);
		
	}

	// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
	class Dog {
		String name = "ポチ";

	}

	// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
class Dog {
	int count = 1;
}

// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

*/
package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		Animal outer = new Animal();

		Dog dog1 = outer.new Dog(); // 内部クラスの生成方法

		System.out.println("動物の名前: " + dog1.name);

		System.out.println("動物の数: " + dog1.count);

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String dateTime = now.format(fmt);
		System.out.println("現在の日時: " + dateTime);
	}

	// 内部クラスに public は付けない
	class Dog {
		String name = "ポチ";
		int count = 1;
	}
}
