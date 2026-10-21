/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author aylin
 */
public class EVA2_3_LISTA_DOBLE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     
      ListaDoble lista = new ListaDoble();
      lista.agregar(100);
      lista.agregar(200);
      lista.agregar(300);
      lista.agregar(400);
      lista.agregar(500);
      
      System.out.println("Lista original:");
      lista.Imprimir(); 
      
      System.out.println("Lista al reves:");
      lista.ImprimirInv();

      System.out.println("\n Borrando en posicion 0 (el 100) ");
      lista.borrarEn(0);
      lista.Imprimir(); 
      lista.ImprimirInv(); 
      System.out.println("Longitud: " + lista.longitud());

      System.out.println("\n Insertando 99 en posicion 1 ");
      lista.insertarEn(99, 1);
      lista.Imprimir(); 
      lista.ImprimirInv();

      System.out.println("\n Borrando en medio, posicion 2 (el 300) ");
      lista.borrarEn(2);
      lista.Imprimir(); 
      lista.ImprimirInv();

      System.out.println("\n Borrando al final ");
      lista.borrarEn(lista.longitud() - 1);
      lista.Imprimir(); 

      System.out.println("\n Vaciando lista ");
      lista.vaciarLista();
      System.out.println("Vacia? " + lista.listaVacia());
}
   }