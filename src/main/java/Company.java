public class Company {



    private String nome;
    public int hiredDevelopers;
    private Developer[] developers;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Developer[] getDevelopers(String mario) {
        return developers;
    }

    public void setDevelopers(Developer[] developers) {
        this.developers = developers;
    }

    public Company(String nome) {
        this.nome = nome;
        this.hiredDevelopers = 0;
        this.developers = new Developer[15];
    }

    public void addDeveloper(Developer hiredDeveloper){
       // if (hiredDeveloper >= developers.length){
            System.out.println("L azienda nom può assumere");
        }


    public double payDevelopers(){

        return 0;
    }

}
