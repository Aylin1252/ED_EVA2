



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aylin
 */
public class MyQueue {
  
    private Nodo inicio;
    private Nodo fin;
    public int longitud;

    public MyQueue() {
        inicio = null; 
        fin = null;
        longitud = 0;
    }

  
    public void imprimir() {
        Nodo temp = inicio;
        while(temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }

    public int longitud() {
        return this.longitud;
    }

    
    public boolean listaVacia() {
        return inicio == null;
        
    }

    
    public void vaciarLista() {
        inicio = null;
        fin = null;
        longitud = 0;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if(listaVacia()) { 
            inicio = nuevo;
            fin = nuevo;
        } else { 
            fin.setSiguiente(nuevo); 
            nuevo.setAnterior(fin); 
            fin = nuevo; 
        }
        longitud++;
    }

    public void inversa() {
        Nodo temp = fin;
        while(temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getAnterior();
        }
        System.out.println("");
    }

    public int valorEn(int posicion) {
        if(posicion < 0 || posicion >= this.longitud) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else{
            Nodo temp = inicio;
            for( int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getValor();
        }
    }

    public void insertarEn(int valor, int posicion) {
        if(posicion < 0 || posicion > (longitud-1)) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
        Nodo nuevo = new Nodo(valor);
        if(posicion == 0) { 
            nuevo.setSiguiente(inicio);
            if(inicio != null) {
                inicio.setAnterior(nuevo);
            }
            inicio = nuevo;
            if(fin == null) { 
                fin = nuevo;
            }
        } else if(posicion == (longitud-1)) { 
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        } else { 
            Nodo temp = inicio;
            for(int i = 0; i < (posicion-1); i++) {
                temp = temp.getSiguiente();
            }
            nuevo.setSiguiente(temp.getSiguiente());
            nuevo.setAnterior(temp);
            temp.getSiguiente().setAnterior(nuevo);
            temp.setSiguiente(nuevo);
        }
        longitud++;
    }

    public void borrarEn(int posicion) {
        if(posicion < 0 || posicion > (longitud-1)) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
        if(posicion == 0) { 
            inicio = inicio.getSiguiente();
            if(inicio != null) {
                inicio.setAnterior(null);
            } else {
                fin = null; 
            }
        } else if(posicion == (longitud-1)) { 
            fin = fin.getAnterior();
            fin.setSiguiente(null);
        } else { 
            Nodo temp = inicio;
            for(int i = 0; i < (posicion-1); i++) {
                temp = temp.getSiguiente();
            }
            
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            temp.setAnterior(temp.getAnterior().getAnterior());
        }
        longitud--;
    }

    
    public void push(int valor) {
        agregar(valor);
    }

    
    public int peek() {
        if (listaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return valorEn(0);
    }

  
    public int pop() {
        if (listaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = valorEn(0);
        borrarEn(0);
        return valor;
    }
} 

