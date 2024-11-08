package exo3;

public class Carac {

    private String caractere;

    // Constructeur avec paramètre
    public Carac(String caract) {
        this.caractere = caract;
    }

    // Constructeur sans paramètre
    public Carac() {
        this.caractere = "";
    }

    public boolean estVoyelle() {
        
        return "aeiouyAEIOUY".contains(caractere);
    }

    public static void main(String[] args) {
    	Carac carac1 = new Carac("a");
        System.out.println("Est-ce une voyelle? " + carac1.estVoyelle());
        
        Carac carac2 = new Carac("b");
        System.out.println("Est-ce une voyelle? " + carac2.estVoyelle());
    }
}