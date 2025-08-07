package curriculumB;

import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students;

        // 生徒の人数を2以上で受け取るループ
        do {
            System.out.print("生徒の人数を入力してください（2以上）: ");
            students = scanner.nextInt();
        } while (students < 2);

        String[] subjects = { "英語", "数学", "理科", "社会" };
        double[][] scores = new double[students][subjects.length];

        // 各生徒の点数入力
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects.length; j++) {
                System.out.printf("%d人目の『%s』の点数を入力してください : ", (i + 1), subjects[j]);
                scores[i][j] = scanner.nextDouble();
            }
        }

        System.out.println();

        // 各生徒の平均点
        for (int i = 0; i < students; i++) {
            double sum = 0;
            for (int j = 0; j < subjects.length; j++) {
                sum += scores[i][j];
            }
            double average = sum / subjects.length;
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), average);
        }

        System.out.println();

        // 各教科の平均点 + 全体の平均点
        double totalSum = 0;
        for (int j = 0; j < subjects.length; j++) {
            double subjectSum = 0;
            for (int i = 0; i < students; i++) {
                subjectSum += scores[i][j];
            }
            double subjectAverage = subjectSum / students;
            System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], subjectAverage);
            totalSum += subjectSum;
        }

        double overallAverage = totalSum / (students * subjects.length);
        System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);

        scanner.close();
    }
}
