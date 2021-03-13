package com.carlos.arbolbinario.ArbolBinario;

public class NodoArbol {
    private NodoArbol izquierda;
    private NodoArbol derecha;
    private Integer contenido;

    public NodoArbol() {
    }

    public NodoArbol(NodoArbol izquierda, NodoArbol derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public NodoArbol(NodoArbol izquierda, NodoArbol derecha, int contenido) {
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.contenido = contenido;
    }

    public NodoArbol(int contenido) {
        this.contenido = contenido;
    }
    
    public NodoArbol getIzquierda() {
        return izquierda;
    }
    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }
    public NodoArbol getDerecha() {
        return derecha;
    }
    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }

    public Integer getContenido() {
        return contenido;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }

    public void agregarNodo(NodoArbol nodo){
        if(this.contenido==null){
            this.contenido=nodo.getContenido();
        }else{
            if(nodo.getContenido()>this.contenido){
                if(this.derecha==null){
                    this.derecha=nodo;
                }else{
                    this.derecha.agregarNodo(nodo);
                }
            }else{
                if(this.izquierda==null){
                    this.izquierda=nodo;
                }else{
                    this.izquierda.agregarNodo(nodo);
                }
            }
        }
    }
    
    public void recorridoPreOrden(){
        System.out.print(" "+this.contenido+" ");
        if(this.izquierda!=null){
            this.izquierda.recorridoInOrden();
        }
        if(this.derecha!= null){
            this.derecha.recorridoInOrden();
        }
    }
    
    public void recorridoInOrden(){
        if(this.izquierda!=null){
            this.izquierda.recorridoInOrden();
        }
        System.out.print(" "+this.contenido+" ");
        if(this.derecha!= null){
            this.derecha.recorridoInOrden();
        }
    }
    
    public void recorridoPostOrden(){
        if(this.izquierda!=null){
            this.izquierda.recorridoInOrden();
        }
        if(this.derecha!= null){
            this.derecha.recorridoInOrden();
        }
        System.out.print(" "+this.contenido+" ");
    }
    
    public NodoArbol buscarNodo(Integer contenido){
        NodoArbol tmp=null;
        if(this.contenido==contenido){
            tmp =this;
        }else{
            if(contenido>this.contenido){
                if(this.derecha!=null){
                    tmp = this.derecha.buscarNodo(contenido);
                }
            }else{
                if(this.izquierda!=null){
                    tmp = this.izquierda.buscarNodo(contenido);
                }
            }
        }
        return tmp;
    }
    
    @Override
    public String toString() {
        return "NodoArbol{" + "izquierda=" + izquierda + ", derecha=" + derecha + ", contenido=" + contenido + '}';
    }
}
