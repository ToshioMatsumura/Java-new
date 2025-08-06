package curriculumB;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				
				
				System.out.print("0" + x + " " + "*" + " " + "0" + y + " " + "=" + " " + x * y + " || ");

				if ( x * y <= 9 ) {
					System.out.print("0" + x + " " + "* 0" + y + " " + "=" +"0" +x * y + " ");
//				} if else ( x * y <= 9 ){
//					System.out.print("0" + x + " " + "* 0" + y + " " + " " + x * y + " || ");
					
				}
			}
			System.out.println();
		}
	}
}