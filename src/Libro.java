/* public class Libro {
    private int codice;
    private String titolo;
    private Utente utenteAssegnato;

    public Libro(int codice, String titolo) {
        this.codice = codice;
        this.titolo = titolo;
        this.utenteAssegnato = null;
    }

    public int getCodice() {
        return codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public Utente getUtenteAssegnato() {
        return utenteAssegnato;
    }

    public void setUtenteAssegnato(Utente utenteAssegnato) {
        this.utenteAssegnato = utenteAssegnato;
    }

    public String toString() {
        return "Libro{" +
                "codice=" + codice +
                ", titolo='" + titolo + '\'' +
                ", utenteAssegnato=" + utenteAssegnato +
                '}';
    }

    public void assegnaUtente(Utente utente) {
        if (utenteAssegnato != null) {
            throw new RuntimeException("Libro già in prestito!");
        } else {
            utenteAssegnato = utente;
        }
    }
    public void restituisciUtente() {
        utenteAssegnato = null;
    }
} */
