import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bankaccount optima = new Bankaccount();

        Scanner scanner = new Scanner(System.in);

        optima.deposit(20000.00);

        while (true) {
            System.out.println("Введите сумму: ");
            int sum = scanner.nextInt();

            try {
                optima.Withdraw(sum);

                System.out.println("Ваш баланс: " + optima.getAmount());
                if (optima.getAmount() ==0){
                    break;
                }
            } catch (LimitException error){
                System.err.println(error.getMessage());
                System.out.println(optima.getAmount() - optima.getAmount());
                System.out.println("Вы обналичили весь остаток: " + optima.getAmount());
                break;
            }
        }
    }
}
