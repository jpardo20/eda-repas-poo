package classe;

public abstract class Persona {
    private String nom;
    private int edat;

    public Persona (String _nom, int _edat) {
        this.nom = _nom;
        this.edat = _edat;
    }
    public String getNom() {
        return this.nom;
    }

    public int getEdat() {
        return this.edat;
    }

    public String rol() {
        return "Persona";
    }
}
