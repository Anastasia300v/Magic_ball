import java.util.Scanner;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] answers = {
                "Никаких сомнений",
                "Хорошие перспективы",
                "Дерзай, но не во вред своей учёбе",
                "Пока неясно, спроси позже",
                "Даже не думай",
                "Весьма сомнительно",
                "Сейчас не время для этого",
                "Сейчас лучше хорошо поспать и вкусно поесть"
        };

        System.out.println("Я знаю твоё будущее и помогу тебе!");
        System.out.println("Задай любой вопрос, на который можно ответить Да или Нет и напиши мне любое число, оно скрывает ответ на твой вопрос:");

        int number = scanner.nextInt();

        String prediction = answers[random.nextInt(answers.length)];
        System.out.println(prediction);

    }
}