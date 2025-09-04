
/*
 	
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */

package qes28_29main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import qes28_29sub.Prefecture;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] data = {
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

		Prefecture[] prefectures = new Prefecture[data.length];

		for (int i = 0; i < data.length; i++) {
			String[] parts = data[i].split(":");
			prefectures[i] = new Prefecture(parts[0], parts[1], Double.parseDouble(parts[2]));
		}

		Scanner sc = new Scanner(System.in); //キーボード入力

		System.out.println("番号をカンマ区切りで入力してください（例: 8,5,9）：");

		String input = sc.nextLine(); //数字の入力受付

		String[] nums = input.split(",");//		入力した数字をリストに変換

		List<Prefecture> selectedList = new ArrayList<>();
		
		//===============================================================================
		System.out.println("昇順なら asc、降順なら desc を入力してください：");

		String order = sc.nextLine();
		
		for (String numStr : nums) {
			try {
				int index = Integer.parseInt(numStr.trim());

				if (index >= 0 && index < prefectures.length) {
					System.out.println(prefectures[index]);
				} else {
					System.out.println("番号" + index + "は存在しません");
				}
			} catch (NumberFormatException e) {
				System.out.println("無効な入力: " + numStr);
			}
		}

		
		
		
		// ④ 昇順・降順でソート
		if (order.equalsIgnoreCase("asc")) {
			selectedList.sort(Comparator.comparingDouble(Prefecture::getArea));
		} else if (order.equalsIgnoreCase("desc")) {
			selectedList.sort(Comparator.comparingDouble(Prefecture::getArea).reversed());
		} else {
			System.out.println("無効な入力です。昇順でソートします。");
			selectedList.sort(Comparator.comparingDouble(Prefecture::getArea));
		}

		System.out.println("\n選択された都道府県の情報:");
		for (Prefecture p : selectedList) {
			System.out.println(p);
		}

		
		
		// 選択した番号をリストに追加
		
		if (selectedList.isEmpty()) {
			System.out.println("選択された都道府県はありません。");
			sc.close();
			return;
		}

		sc.close();
	}

}
