public class Novo {
    public static void main(String[] args) {

       // Developer developer = new Developer("Luca", "Rossi");
        Company company = new Company("Illy");

       Bank mps = new Bank("Monte dei paschi");
       Bank intesa = new Bank("Intesa san paolo");
       
       Account googleAccount = mps.createAccount(1000.0);
        System.out.println(googleAccount);

        Account albertoAccount = mps.createAccount(0.0);

        Account antonioAcconunt = intesa.createAccount(50.0);

        /////////////////

        Account1 emanueleAccount = new Account1("IT1234567890123456789012345", 5000.0);

// oggetto Account per il conto di Claudio
        Account1 claudioAccount = new Account1("IT5432109876543210987654321", 1000.0);

// trasferimento di 1000.0 da Emanuele a Claudio
        emanueleAccount.transferTo(claudioAccount, 1000.0);

// Stampa i saldi dei conti correnti di Emanuele e Claudio
        System.out.println("Saldo di Emanuele: " + emanueleAccount.getAmount());
        System.out.println("Saldo di Claudio: " + claudioAccount.getAmount());



        //System.out.println(company.getNome() + " " + developer.getNome() + " " + developer.getCognome());

       // Cylinder cylinder = new Cylinder();




    }
    }
