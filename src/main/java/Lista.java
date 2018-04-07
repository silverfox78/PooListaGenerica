public class Lista {
    private Nodo primero;
    private int largo;

    public void push(Nodo n){
        Nodo auxiliar = this.primero;
        while(!auxiliar.getSiguiente().equals(null)){
            auxiliar = auxiliar.getSiguiente();
        }
        auxiliar.setSiguiente(n);
        largo++;
    }

    public Nodo pop(){
        if (this.primero.equals(null)){
            return null;
        }
        Nodo retorno = this.primero;
        retorno.setSiguiente(null);
        this.primero = this.primero.getSiguiente();
        return retorno;
    }

    public Nodo peek(){
        return this.primero;
    }

    public void inserta(Nodo n, int posicion){
        if(posicion == 1){
            n.setSiguiente(this.primero);
            this.primero = n;
            this.largo++;
            return;
        }

        if(posicion > this.largo){
            this.push(n);
            return;
        }

        Nodo auxiliar = this.primero;
        for (int i = 2; i < posicion; i++){
            auxiliar = auxiliar.getSiguiente();
        }
        n.setSiguiente(auxiliar.getSiguiente());
        auxiliar.setSiguiente(n);
        this.largo++;
    }
}
