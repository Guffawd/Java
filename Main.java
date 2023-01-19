import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int questionNumber = 0;

        for (int i = 0; i < 10; i++) {
            int typeOfQuestion = rand.nextInt(2);
            double principal, rate, time, answer = 0;
            String question = "";

            if (typeOfQuestion == 0) {
                principal = rand.nextInt(10000) + 1;
                rate = (rand.nextInt(10) + 1) / 100.0;
                time = rand.nextInt(10) + 1;
                question = "What is the compound interest for a principal of " + principal + " with a rate of " + rate + " and a time of " + time + " years?";
                answer = principal * Math.pow(1 + rate, time) - principal;
            } else {
                principal = rand.nextInt(10000) + 1;
                rate = (rand.nextInt(10) + 1) / 100.0;
                time = rand.nextInt(10) + 1;
                question = "What is the simple interest for a principal of " + principal + " with a rate of " + rate + " and a time of " + time + " years?";
                answer = principal * rate * time;
            }

            System.out.println("Question #" + ++questionNumber + ": " + question);
            double userAnswer = scanner.nextDouble();

            if (Math.abs(userAnswer - answer) < 0.01) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answer);
            }
        }
        System.out.println("Quiz complete. Your score is " + score + " out of 10.");
    }
}

