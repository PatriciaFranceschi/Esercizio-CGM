public class Account {

    public int IBAN;
    public double amount;


    public Account(int iban, double amount){
        this.IBAN = iban;
        this.amount = amount;
    }
    public int getIBAN(){
        return this.IBAN;
    }

    public double getAmount(){
        return this.amount;
    }

    public void transfertTo(Account to, double amount){
        if(amount < 0.0){
            System.out.println("Non fare il furbo");
            return;
        }
        if (this.amount<amount){
            System.out.println("Non hai i fondi necessari x il bonifico");
            return;
        }
        this.amount -= amount;
        to.amount += amount;
    }
    public static void transferTo(Account from, Account to, double amount ){

    }

    @Override
    public String toString(){
        return String.format("IBAN: %d, amount: %f", IBAN, amount);
    }

    public void transferTo(Account1 to, double amount) {
    }
}

