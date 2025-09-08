/*インスタンスフィールドの追加
問題1：インスタンスフィールドに「lastName」を追加しましょう


コンストラクタのオーバーロード
問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください

※順番はfirstNameの次

問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加し
       lastNameフィールドの値をセットしてください*/

package self_introduction3;

class Vehicle {
	private String owner; //←課題33 問題1

	public String getOwner() {                         //課題33 問題3
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;

	}
}

class Car extends Vehicle {

}                                        //←課題33 問題2

class Bicycle extends Vehicle {

}

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
//		person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
//		person2.print();

		Car car = new Car();
		
		Bicycle bicycle = new Bicycle();

		//	 ownerを設定
//		car.setOwner(person1.fullName());
//		bicycle.setOwner(person2.fullName());
                                                   //課題33問題4
		//出力
//		System.out.println(car.getOwner());
//		System.out.println(bicycle.getOwner());
		
		person1.buy(car);
		person2.buy(bicycle);
	}

	//	  Person.printCount();
}
