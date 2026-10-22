


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author aylin
 */
public class Eva2_4_QUEUE {
    
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      //hacer una fila ejemplo:llega 1 se forma,llega 2 se pone atras del 1 y asi sucesivamente
      MyQueue queue = new MyQueue();
      
      queue.push(10);
      queue.push(20);
      queue.push(30);
      
      System.out.println("fila actual:");
      queue.imprimir();
      
      System.out.println("primero en la fila:" + queue.peek());
      
      System.out.println("Atendiendo a:" + queue.pop());
      
      System.out.println("fila despues de atender a uno:" );
      queue.imprimir();
      
   }
   
}
