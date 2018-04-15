public class Nodo {

    private int dato;
    private Nodo siguiente;

    public Nodo(int dato, Nodo n) {
        this.dato = dato;
        this.siguiente = n;
    }

    public Nodo() {
        this.dato = 0;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }


    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
