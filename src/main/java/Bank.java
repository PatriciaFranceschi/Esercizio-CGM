public class Bank {

    public String name;
    private int nextIban;

    public Bank (String name){
        this.name = name;
        this.nextIban = 0;
    }

    public Account createAccount (double amount){

        Account account = new Account(nextIban, amount);
        nextIban++;
        return account;
    }
}
