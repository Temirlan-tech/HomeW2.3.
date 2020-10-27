public class Bankaccount {

    private double amount;

    public double getAmount() {
        return this.amount;
    }

    public void deposit (double sum) {
        this.amount += sum;
        System.out.println("Ваш баланс: " + getAmount());
    }

    public void Withdraw(int sum) throws LimitException {
        if (sum > this.amount){
            throw new LimitException("Не хватает средств для совершения данной операции !!!", this.amount);
        }
        this.amount = this.amount - sum;
        System.out.println("С вашего счета снято: " + sum);
    }

}
