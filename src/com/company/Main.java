package com.company;

public class Main {

    public static void main(String[] args) {
        public void csv() {
        }

        public void answers() {
            int score = 0;
            String questions[] = {
                    "Вопрос 1", "Вопрос 2", "Вопрос 3", "Вопрос 4", "Вопрос 5"};
            int answers[] = {1, 1, 2, 1, 1};
            try (Scanner scanner = new Scanner(System.in)) {
                for (int i = 0; i < questions.length; i++) {
                    System.out.printf("Вопрос №%d: %s\nВведите ответ:\n", i + 1, questions[i]);
                    score += scanner.nextInt() == answers[i] ? 1 : 0;
                }
                System.out.println("Спасибо");
                int result = (int) (100.0f * (float) score / (float) questions.length);
                System.out.printf("Ваш средний балл составляет: %d%%\n", result);
            }
        }
    }
}
