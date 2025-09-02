package qes28_29sub;

//フィールド（3つ）
public class Prefecture {

	public String name;

	public String capital;

	public double area;

	// コンストラクタ（引数3つを受け取る）
	public Prefecture(String name, String capital, double area) {
		this.name = name; // フィールド name に引数 name を代入
		this.capital = capital; // フィールド capital に引数 capital を代入
		this.area = area; // フィールド area に引数 area を代入
	}

	// toString() をオーバーライドして見やすく表示
	@Override
	public String toString() {
		return "都道府県名：" + name + "\n"
				+ "県庁所在地：" + capital + "\n"
				+ "面積：" + area + "km2\n";
	}
}
