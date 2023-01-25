import java.util.Random;

public class Utente {
    private String unNome;
    private String unCognome;

    public Utente(String unNome, String unCognome) {
        this.unNome = unNome;
        this.unCognome = unCognome;
    }

    public String getUnNome() {
        return unNome;
    }

    public String getUnCognome() {
        return unCognome;
    }

    public String toString() {
        return "Nome: " + this.unNome + ", Cognome: " + this.unCognome;
    }

    public int generaCodice() {
        Random random = new Random();
        int n = random.nextInt(999999999);
        return n;1
    }

    public void stampaInfo() {
        System.out.println("il Nome e': " + getUnNome());
        System.out.println("il Cognome e': " + getUnCognome());
        System.out.println("Il codice del libro e': " + generaCodice());
    }
}
