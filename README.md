## OO i herència. Repàs de qüestions fonamentals

Considereu les següents classes **`**`Persona`**`**, **`**`Client`**`** i **`Worker`** que presenten una relació jeràrquica:

```java
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

```

```java
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
```

```java
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
```
![mer](package.png)

Comencem amb unes quantes preguntes fàcils:

**1.** Quants atributs tenen els objectes de la classe **`Client`**?
   **a.** 1
   **b.** 2
   **c.** 3
   **d.** 4

**2.** La classe **`Treballador`** té un **mètode** anomenat **`rol`**. La seva **superclasse** també. El **mètode** **`rol`** de **`Treballador`** és ...
   **a.** Una redefinició del de **`Persona`**
   **b.** Una sobrecàrrega del de **`Persona`**
   **c.** No es pot saber
   
**3.** La **classe** **`Client`** té un **mètode** anomenat **`rol`**. La seva **superclasse** també. El mètode
   **`rol`** de **`Client`** és ...
   **a.** una **redefinició** del de **`Persona`**
   **b.** una **sobrecàrrega** del de **`Persona`**
   **c.** no es pot saber

**4.** Acceptarà el compilador això?
   `Client c = new Client ("A", 30, 2);`

   **a.** Sí
   **b.** No, perquè el mètode **`rol`** de **`Client`** té un paràmetre **`booleà`**.
   **c.** **`rol`**();

**5.** Acceptarà el compilador això?
>```java
>    Treballador treb5, treb51;
>    //...
>    // treb5 i treb51 estan inicialitzades
>    boolean iguals = treb5.equals(w2);
>```

   **a.** Sí
   **b.** No, perquè Worker no ha redefinit equals

**6.** Acceptarà el compilador això?
>```java
>   Persona pers6;
>   Treballador treb6;
>   ...
>   // pers6 i treb6 estan inicialitzades
>   pers6 = treb6; // primera assignació
>   treb6 = pers6; // segona assignació
>```
   **a.** La primera assignació sí però la segona no
   **b.** La segona assignació sí però la primera no
   **c.** Totes dues assignacions
   **d.** Cap de les dues assignacions

**7.** Acceptarà el compilador això?
```java
    Persona pers3;
    Client cli3;
    ...
    // pers3 i cli3 estan inicialitzades
    int cmp = cli3.compareTo(p);
```
   **a.** Sí, segur
   **b.** No, segur que no
   **c.** No es pot saber. Depèn de si p conté un objecte de **`Client`** o no.

**8.** Acceptarà el compilador això?
```java
   Comparable cli4 = new Client("CC", 33, 123);
```
   **a.** Sí
   **b.** no
