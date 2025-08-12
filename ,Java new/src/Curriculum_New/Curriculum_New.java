package Curriculum_New;

import java.util.Random;

public class Curriculum_New {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void printHello(String name, int version) {
		System.out.println("Hello " + name + " " + version);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multiplyAndPrint(int a, int b) {
		System.out.println(a * b);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.println(num);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void addAndPrint(double a, double b) {
		System.out.println(a + b);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] generateRandomNumbers(int count) {
		Random rand = new Random();
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			int num;
			do {
				num = rand.nextInt(100) + 1; // 1～100の乱数（0は出ない）
			} while (num == 0);
			result[i] = num;
			System.out.println(num);
		}
		return result;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static void printAverage(int[] arr) {
		double sum = 0;
		for (int num : arr) {
			sum += num;
		}
		double avg = sum / arr.length;
		System.out.println(avg);
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean isAverageAbove50(int[] arr) {
		double sum = 0;
		for (int num : arr) {
			sum += num;
		}
		double avg = sum / arr.length;
		boolean result = avg >= 50;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {

	// 作成したメソッドをここで呼び出してください

		// Q1呼び出し
		printHello("JavaSE", 11);

		// Q2呼び出し
		multiplyAndPrint(3, 5);

		// Q3呼び出し
		int[] sampleArray = { 1, 2, 3, 4, 5 };
		printArray(sampleArray);

		// Q4呼び出し
		addAndPrint(2.5, 3.7);

		// Q5呼び出し
		int[] randomNumbers = generateRandomNumbers(5);

		// Q6呼び出し
		printAverage(randomNumbers);

		// Q7呼び出し
		isAverageAbove50(randomNumbers);
	}
}