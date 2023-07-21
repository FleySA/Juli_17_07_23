import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ввод от пользователя с помощью клавиатуры.
        System.out.println(" Введите ваше имя : ");
        String userName = scanner.nextLine();

        System.out.println("Привет, " + userName + "!");
    }
}