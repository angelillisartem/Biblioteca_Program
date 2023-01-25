import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = in.next();
        System.out.println("Cognome: ");
        String cognome = in.next();

        Utente utente = new Utente(nome, cognome);
        utente.stampaInfo();
    }
}