package curriculumB;

public class Qes5 {

	
	    public static void main(String[] args) {

	        for (int b = 1; b <= 9; b++) {   
	            for (int a = 1; a <=20; a++) {
	                System.out.printf("%03d * %03d = %03d", a, b, a * b);
	                if (a != 20) {
	                    System.out.print(" || ");
	                }
	            }
	            System.out.println(); // 改行
	        }
	    }
	}
