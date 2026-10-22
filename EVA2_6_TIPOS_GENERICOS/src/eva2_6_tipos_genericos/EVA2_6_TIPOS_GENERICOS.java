/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_tipos_genericos;

/**
 *
 * @author aylin
 */
public class EVA2_6_TIPOS_GENERICOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      //int-->Integer,double
      Ejemplo<ListaDoble> prueba = new Ejemplo<>(new ListaDoble());
      Ejemplo<Integer> prueba2 = new Ejemplo<>(10);
      //prueba.
   }

}
class ListaDoble{
   
}

class Ejemplo <T>{
  private T dat;
  
   public Ejemplo(T dat){
      this.dat = dat;
   }
   public T getDat() {
      return dat;
   }

   public void setDat(T dat) {
      this.dat = dat;
   }
}