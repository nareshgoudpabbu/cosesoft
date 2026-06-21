import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      STUDENT PERFORMANCE REPORT");
        System.out.println("====================================");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int subjects = sc.nextInt();

        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        String highestSub = "";
        String lowestSub = "";

        String[] subjectNames = new String[subjects];
        int[] marks = new int[subjects];

        sc.nextLine();

        for (int i = 0; i < subjects; i++) {

            System.out.print("\nEnter Subject Name: ");
            subjectNames[i] = sc.nextLine();

            System.out.print("Enter Marks (0-100): ");
            marks[i] = sc.nextInt();
            sc.nextLine();

            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
                highestSub = subjectNames[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
                lowestSub = subjectNames[i];
            }
        }

        double percentage = (double) total / subjects;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";

        String result = (percentage >= 40) ? "PASS" : "FAIL";

        System.out.println("\n====================================");
        System.out.println("          REPORT CARD");
        System.out.println("====================================");

        System.out.println("Student Name : " + name);

        System.out.println("\nSubjects & Marks");

        for (int i = 0; i < subjects; i++) {
            System.out.println(subjectNames[i] + " : " + marks[i]);
        }

        System.out.println("\nTotal Marks      : " + total);
        System.out.println("Average          : " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade            : " + grade);
        System.out.println("Result           : " + result);

        System.out.println("\nHighest Scored Subject : "
                + highestSub + " (" + highest + ")");

        System.out.println("Lowest Scored Subject  : "
                + lowestSub + " (" + lowest + ")");

        System.out.println("====================================");
        System.out.println("      THANK YOU");
        System.out.println("====================================");

        sc.close();
    }
}
