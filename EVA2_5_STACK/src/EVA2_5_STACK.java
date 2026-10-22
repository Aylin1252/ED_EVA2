/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



/**
 *
 * @author aylin
 */
public class EVA2_5_STACK {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      MyStack stack = new MyStack();

        
        stack.push(10);
        stack.push(20);
        stack.push(30);

       
        System.out.println("Pila:");
        stack.imprimir();

        
        System.out.println("Ultimo elemento: " + stack.peek());

       
        System.out.println("Elemento eliminado: " + stack.pop());

        
        System.out.println("Pila despues de eliminar un elemento:");
        stack.imprimir();
    }
}
