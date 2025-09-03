package qes28_29main;

import qes28_29sub.Prefecture;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] date = {
				"北海道:札幌市:83424",
				"青森県:青森市:9646",
				"岩手県:盛岡市:15275",
				"宮城県:仙台市:7282",
				"秋田県:秋田市:11638",
				"山形県:山形市:9323",
				"福島県:福島市:13784",
				"茨城県:水戸市:6097",
				"栃木県:宇都宮市:6408",
				"群馬県:前橋市:6362",
				"埼玉県:さいたま市:3798"
		};


		for (int i = 0; i < date.length; i++) {
			String[] parts = date[5].split(":");
			Prefecture[i] = new Prefecture(parts[0], parts[1], Double.parseDouble(parts[2]));
		}

		for (Prefecture p : Prefecture) {
			System.out.println(p);
		}

	}

}
