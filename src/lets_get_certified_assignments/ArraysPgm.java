package lets_get_certified_assignments;

public class ArraysPgm {
    public static void main(String[] args) {
        studentGrades();
    }

    private static void studentGrades() {
        int[][] studentsGrades = {{77, 68, 86}, {96, 76, 45}};

        outputGrades(studentsGrades);

        int count = 1;
        for (int[] student : studentsGrades) {
            System.out.println("Student " + count + " grades: ");

            double avg = calcAverageGrade(student);
            System.out.println("Average grade: " + avg);

            int minGrade = calcMinimumGrade(student);
            System.out.println("Minimum grade: " + minGrade);

            int maxGrade = calcMaximumGrade(student);
            System.out.println("Maximum grade: " + maxGrade);

            count++;
        }
    }

    public static int calcMinimumGrade(int[] studentGrades) {
        int min = studentGrades[0];
        for (int grade : studentGrades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    public static int calcMaximumGrade(int[] studentGrades) {
        int max = studentGrades[0];
        for (int grade : studentGrades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    private static double calcAverageGrade(int[] studentGrades) {
        int sum = 0;
        for (int grade : studentGrades) {
            sum += grade;
        }
        return (double) sum / studentGrades.length;
    }

    private static void outputGrades(int[][] studentsGrades) {
        System.out.println("Grades using enhanced-for loop:");
        for (int[] student : studentsGrades) {
            for (int grade : student) {
                System.out.print(grade + " ");
            }
            System.out.println();
        }

        System.out.println("Grades using traditional-for loop:");
        for (int i = 0; i < studentsGrades.length; i++) {
            for (int j = 0; j < studentsGrades[i].length; j++) {
                System.out.print(studentsGrades[i][j] + " ");
            }
            System.out.println();
        }
    }
}
