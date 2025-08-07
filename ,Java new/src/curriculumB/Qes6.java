package curriculumB;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	
 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random rand = new Random();

	        System.out.println("商品を「、」区切りで入力してください：");
	        String input = scanner.nextLine();

	        String[] items = input.split("、");

	        for (String item : items) {
	            // トリムして前後の空白を除去
	            item = item.trim();

	            // 残り台数の初期化（テレビ・ディスプレイ用に毎回ランダム生成）
	            int randomStock = rand.nextInt(12); // 0〜11

	            switch (item) {
	                case "テレビ":
	                case "ディスプレイ":
	                    // ディスプレイのときだけ最大11から引く
	                    int displayStock = item.equals("ディスプレイ") ? (11 - randomStock) : randomStock;
	                    System.out.println(item + "の残り台数は" + displayStock + "台です");
	                    break;
	                case "パソコン":
	                case "冷蔵庫":
	                case "扇風機":
	                case "洗濯機":
	                case "加湿器":
	                    int stock = rand.nextInt(12); // 0〜11
	                    System.out.println(item + "の残り台数は" + stock + "台です");
	                    break;
	                default:
	                    // 条件演算子で「正しい商品名かどうか」をチェック → falseなのでメッセージ出力
	                    String msg = !item.equals("") ? "『 " + item + " 』は指定の商品ではありません" : "";
	                    System.out.println(msg);
	                    break;
	            }
	        }

	        scanner.close();
	    }
	}


