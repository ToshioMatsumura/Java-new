/*インスタンスフィールドの追加
問題1：インスタンスフィールドに「lastName」を追加しましょう


コンストラクタのオーバーロード
問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください

※順番はfirstNameの次

問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加し
       lastNameフィールドの値をセットしてください*/

package self_introduction3;

class Main{
	 public static void main(String[] args){
	  Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
	  person1.print();

	  Person person2 = new Person("山田", "花子", 22, 1.5, 40);
	  person2.print();

	  Person.printCount();
	 }
	}