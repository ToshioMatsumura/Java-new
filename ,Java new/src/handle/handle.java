/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */

package handle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class handle {

	private String greeting;
	private String sushi;
	private String explain;
	private String dateTime;

	public handle(String greeting, String sushi, String explain) {
		this.greeting = greeting;
		this.sushi = sushi;
		this.explain = explain;

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		this.dateTime = now.format(fmt);
	}

	public void printMessage() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.greeting);
		System.out.println(this.sushi);
		System.out.println(this.explain);
		System.out.println("今の現在日時は" + this.dateTime + "です");
	}

}
