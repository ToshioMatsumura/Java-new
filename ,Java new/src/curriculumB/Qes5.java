package curriculumB;

public class Qes5 {

	
	    public static void main(String[] args) {

	        for (int b = 1; b <= 20; b++) {   
	            for (int a = 1; a <= 9; a++) {
	                System.out.printf("%03d * %03d = %03d", a, b, a * b);
	                if (a != 9) {
	                    System.out.print(" || ");
	                }
	            }
	            System.out.println(); // 改行
	        }
	    }
	}
