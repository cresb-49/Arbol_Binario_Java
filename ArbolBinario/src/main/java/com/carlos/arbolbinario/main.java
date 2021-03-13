package com.carlos.arbolbinario;

import com.carlos.arbolbinario.ArbolBinario.NodoArbol;

public class main {
    
    public static void main(String[] args) {
        NodoArbol arbol = new NodoArbol();
        
        arbol.agregarNodo(new NodoArbol(12));
        arbol.agregarNodo(new NodoArbol(20));
        arbol.agregarNodo(new NodoArbol(5));
        arbol.agregarNodo(new NodoArbol(45));
        arbol.agregarNodo(new NodoArbol(33));
        arbol.agregarNodo(new NodoArbol(52));
        arbol.agregarNodo(new NodoArbol(24));
        arbol.agregarNodo(new NodoArbol(15));
        arbol.agregarNodo(new NodoArbol(10));
        arbol.agregarNodo(new NodoArbol(88));
        arbol.agregarNodo(new NodoArbol(83));
        arbol.agregarNodo(new NodoArbol(2));
        arbol.agregarNodo(new NodoArbol(104));
        
        
        arbol.recorridoInOrden();
        System.out.println("");
        arbol.recorridoPostOrden();
        System.out.println("");
        arbol.recorridoPreOrden();
        System.out.println("");
        
        //System.out.println(arbol.toString());
        
        NodoArbol bus = arbol.buscarNodo(10);
        if(bus==null){
            System.out.println("No existe el nodo con el contenido");
        }else{
            System.out.println("Nodo: "+bus.getContenido());
        }
    }
}
