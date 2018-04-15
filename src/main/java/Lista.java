public class Lista {
    private Nodo primero;
    private int largo;

    public void push(Nodo n){
        if(largo == 0){
            this.primero = n;
        }
        else {
            Nodo auxiliar = this.primero;
            //while (!auxiliar.getSiguiente().equals(null)) {
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(n);
        }
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

    public int getCantidad() {
        return largo;
    }

    public Nodo eliminar(int posicion) {
        if (posicion <0 || posicion> this.largo){
            return null;
        }

        if(posicion ==1 && this.largo ==1)
        {
            return this.pop();
        }

        int contador = 0;
        Nodo puntero = this.primero;
        while(contador< posicion-1){
            contador++;
            puntero = puntero.getSiguiente();
        }
        Nodo retorno = puntero;

        puntero.setSiguiente(retorno.getSiguiente());
        return retorno;
    }


    //consultar n elemento
    //intercambiar posiciones
    //orden ascandente
    //orden descendente
    //eliminar segmento
}
