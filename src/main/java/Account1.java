public class Account1 {
    private String IBAN;
    private double amount;

    public Account1(String IBAN, double amount) {
        //diverso !=
        if (IBAN.length() != 27) {
            throw new IllegalArgumentException("IBAN deve essere lungo 27 caratteri.");
        }
        this.IBAN = IBAN;
        this.amount = amount;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getAmount() {
        return amount;
    }

    public void transferTo(Account1 to, double amount) {
        if (amount > this.amount) {
            throw new IllegalArgumentException("Non hai abbastanza soldi sul conto.");
        }
        this.amount -= amount;
        to.amount += amount;
    }

    public static void transfer(Account from, Account1 to, double amount) {
        from.transferTo(to, amount);
    }
}
