





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author aylin
 */
public class Nodo {
   private int valor;
   private Nodo siguiente;
   private Nodo anterior;
   //agregar previo del codigo setprevio etc
      public Nodo(int valor){
      this.valor = valor;
      this.siguiente = null; //esto es muy importante,marca fin de la lista
      this.anterior = null;
   }
   
   public int getValor(){
      return valor;
   }
   public void setValor(int valor) {
      this.valor=valor;
   }
   public Nodo getSiguiente(){
      return siguiente;
   }
   public void setSiguiente(Nodo siguiente){
      this.siguiente=siguiente;
   }
   public Nodo getAnterior(){
      return anterior;
      
   }
   public void setAnterior(Nodo Anterior){
      this.anterior = anterior;
   }
}





