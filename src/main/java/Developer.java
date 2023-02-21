public class Developer implements Employee {

    public String nome;
    public String cognome;
   private  Account account;

    public Developer(String nome, String cognome, Account account) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Developer() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public void doWork() {

    }

    @Override
    public void getSalary() {

    }

}
