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
            } catch (LimitException error){
                System.err.println(error.getMessage());
                System.out.println("На вашем балансе только : " + optima.getAmount());

                try {
                    optima.Withdraw((int) (error.getRemainingAmount()));

                } catch (LimitException error1){
                    System.out.println(error.getMessage());
                }
                break;
            }
        }
    }
}
