/**
 * Created by Александр on 21.02.2015.
 * Реализовать игру "Угадай число". Компьютер загадывает случайное число,
 * а человек пытается его отгадать. Для каждой попытки компьютер выдает,
 * больше или меньше введенное число, чем загаданное. Если человек угадал,
 * игра завершается.
 */
import java.util.Random;
import java.util.Scanner;

public class TriDva {
    public static void main(String[] args) {
        int number = new Random().nextInt(100) + 1; // случайное число от 1 до 100
        Scanner in = new Scanner(System.in);
        int guess;
        do {
            System.out.println("Попробуйте угадать число:");
            guess = in.nextInt();
            if (guess > number)
                System.out.println("Вы ввели слишком большое");
            else if (guess < number)
                System.out.println("Вы ввели слишком малое");
            else
                System.out.println("Вы угадали!");
        }
            while (guess != number);
    }
}
