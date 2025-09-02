package qes28_29sub;

public class Prefecture {

	private String name;

	private String capital;

	private double area;

	//	コンストラクタ
	public Prefecture(String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}

	//	ゲッター
	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return String.format("%s (%s): %.1f km2", name, capital, area);
	}
}