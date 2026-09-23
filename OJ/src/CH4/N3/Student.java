package CH4.N3;

import java.util.Scanner;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void addBonus(int bonus) {
        score += bonus;

        if (score > 100) {
            score = 100;
        }
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public static void applyBonus(Student[] students, int bonus) {
        for (int i = 0; i < students.length; i++) {
            students[i].addBonus(bonus);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int bonus = scanner.nextInt();

        Student[] students;

        // 학생 n명의 객체를 저장할 배열을 생성하는 코드 채워넣기
        students = new Student[n];
        
        for (int i = 0; i < students.length; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            //  학생 객체를 생성하여 배열의 i번째 인덱스에 저장하는 코드 채워넣기
            students[i] = new Student(name, score);
        }

        applyBonus(students, bonus);

        int topIndex = 0;

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                students[i].getName() + " " + students[i].getScore()
            );

            if (students[i].getScore() > students[topIndex].getScore()) {
                topIndex = i;
            }
        }

        scanner.close();
    }
}