package classe;

public class Treballador extends Persona {
        private int numContracte;
        public Treballador (String _nom, int _edat, int numContracte) {
            super(_nom, _edat);
            this.numContracte = numContracte;
        }
        public String rol() {
            return "Treballador";
        }

        public String treballa() {
            return "treballa a ...";
        }
    }