import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListaTest {
    @Test
    public void AnexaPrimerNodo(){
        int esperado = 1;
        Lista lista = new Lista();
        Nodo nodo = new Nodo();
        nodo.setDato(1);
        nodo.setSiguiente(null);
        lista.push(nodo);
        int resultado = lista.getCantidad();
        assertEquals(esperado, resultado);
    }

    @Test
    public void AnexarDosNodos() {
        int esperado = 2;
        Lista lista = new Lista();
        Nodo nodo1 = new Nodo(2, null);
        Nodo nodo2 = new Nodo (3, null);
        lista.push(nodo1);
        lista.push(nodo2);
        int resultado = lista.getCantidad();
        assertEquals(esperado, resultado);
    }

    @Test
    public void EliminarUnNodoConUnNodo() {
        Nodo nodo = new Nodo(2, null);
        Nodo esperado = nodo;
        Lista lista = new Lista();
        lista.push(nodo);
        Nodo respuesta = lista.eliminar(1);
        assertEquals(esperado, respuesta);
    }

    @Test
    public void EliminarUnNodoListaVacia(){
        Nodo esperado = null;
        Lista lista = new Lista();
        Nodo respuesta = lista.eliminar(10);
        assertEquals(esperado, respuesta);
    }

    @Test
    public void EliminaPrimerNodoConDosNodos(){
        Nodo nodo1 = new Nodo(2, null);
        Nodo nodo2 = new Nodo(5, null);
        Nodo esperado = nodo1;
        Lista lista = new Lista();
        lista.push(nodo1);
        lista.push(nodo2);
        Nodo respuesta = lista.eliminar(1);
        assertEquals(esperado.getDato(), respuesta.getDato());
    }

    @Test
    public void EliminaSegundoNodoConDosNodos(){
        Nodo nodo1 = new Nodo(2, null);
        Nodo nodo2 = new Nodo(5, null);
        Nodo esperado = nodo2;
        Lista lista = new Lista();
        lista.push(nodo1);
        lista.push(nodo2);
        Nodo respuesta = lista.eliminar(2);
        assertEquals(esperado.getDato(), respuesta.getDato());
    }

    @Test
    public void EliminaDosNodosConDosNodos(){
        Nodo nodo1 = new Nodo(2, null);
        Nodo nodo2 = new Nodo(5, null);
        Nodo esperado = nodo1;
        Lista lista = new Lista();
        lista.push(nodo1);
        lista.push(nodo2);
        Nodo respuesta = lista.eliminar(2);
        respuesta = lista.eliminar(1);
        assertEquals(esperado.getDato(), respuesta.getDato());
    }

    @Test
    public void ValidaAnexaUnNodoConUltimoValor(){

    }

    @Test
    public void ValidaAnexaDosNodosConUltimoValor(){

    }

    @Test
    public void ValidaUltimoValorListaVacia(){

    }

    @Test
    public void EliminaPrimerNodoListaVacia(){}

    @Test
    public void EliminaPrimerNodoListaUnNodo(){}

    @Test
    public void EliminaSegundoNodoListaTresNodos(){}

    @Test
    public void ConsultaPrimerValorNodo(){
        Nodo nodo1 = new Nodo(2, null);
        Lista lista = new Lista();
        lista.push(nodo1);
        int esperado = 2;
        assertEquals(esperado, lista.getValor(1));
    }
}
