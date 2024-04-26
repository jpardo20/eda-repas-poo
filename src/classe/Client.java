package classe;

public class Client extends Persona implements Comparable {
    private int codiClient;
    public Client(String _nom, int _edat, int _codiClient) {
        super(_nom, _edat);
            this.codiClient = _codiClient;
    }

    public int getCodiClient() {
        return this.codiClient;
    }
    
    public int compareTo (Object objecteClient) {
            return this.codiClient - ((Client)objecteClient).codiClient;
        }
        public boolean equals (Object objecteClient) {
            try {
                return this.compareTo(objecteClient) == 0;
            }
            catch (ClassCastException ce) {
                return false;
            }
        }

        public String rol(boolean especial) {
            return (especial)?"Client Especial":"Client";
        }
    }