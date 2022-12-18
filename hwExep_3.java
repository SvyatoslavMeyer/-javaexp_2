import java.util.Scanner;
// Разработайте программу, которая выбросит Exception, 
// когда пользователь вводит пустую строку. Пользователю 
// должно показаться сообщение, что пустые строки вводить нельзя.
public class hwExep_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter not empty string: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new RuntimeException("You have entered an empty string");
        }

        System.out.println(input);
    }
}
