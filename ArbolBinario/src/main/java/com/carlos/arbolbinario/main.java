package com.carlos.arbolbinario;

import com.carlos.arbolbinario.ArbolBinario.NodoArbol;

public class main {
    
    public static void main(String[] args) {
        NodoArbol arbol = new NodoArbol();
        
        arbol.agregarNodo(new NodoArbol(12));
        arbol.agregarNodo(new NodoArbol(20));
        arbol.agregarNodo(new NodoArbol(5));
        
        
        arbol.recorridoInOrden();
        System.out.println("");
        arbol.recorridoPostOrden();
        System.out.println("");
        arbol.recorridoPreOrden();
        System.out.println("");
        
        System.out.println(arbol.toString());
    }
}
