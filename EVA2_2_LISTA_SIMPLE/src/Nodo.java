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
   //costructores
      public Nodo(){
      siguiente = null; //esto es muy importante,marca fin de la lista
   }
   public Nodo(int valor) { //poner el valor a guardar,al momento de crear el Nodo
      this.valor = valor;
      this.siguiente= null;
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
   
}





