/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_fibonacci;



/**
 *
 * @author aylin
 */
public class EVA2_11_FIBONACCI {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      //Para resolverlo tenemos que usar un ciclo
    
        int n= 0;
        System.out.print("Hasta que posicion quieres Fibonacci?: ");
        
        //El Fibonacci empieza en 1, 1
        int a = 1; 
        int b = 1; 
        
        if (n == 0) {
            System.out.println("Fibonacci(0) = " + a);
        } else if (n == 1) {
            System.out.println("Fibonacci(0) = " + a);
            System.out.println("Fibonacci(1) = " + b);
        } else {
            System.out.println("Fibonacci(0) = " + a);
            System.out.println("Fibonacci(1) = " + b);
            
            // AQUI ESTA EL CICLO
            for (int i = 2; i <= n; i++) {
                int c = a + b; 
                System.out.println("Fibonacci(" + i + ") = " + c);
                a = b;
                b = c;
            }
        }
   }
}
        
        
   