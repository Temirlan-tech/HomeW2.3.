public class Bankaccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit (double sum) {
        amount += sum;
        System.out.println("Ваш баланс: " + getAmount());
    }

    public void Withdraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("Не хватает средств для совершения данной операции ");
        }
        amount = amount - sum;
        System.out.println("С вашего счета снято: " + sum);
    }


}
