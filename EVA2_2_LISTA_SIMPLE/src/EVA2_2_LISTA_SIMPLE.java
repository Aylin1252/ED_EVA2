/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author aylin
 */
public class EVA2_2_LISTA_SIMPLE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      ListaSimple lista = new ListaSimple();
      /*int []arreglo = new int [1000000];
     long ini,fin,tiempo;
     ini = System.nanoTime();//tomamos la hora antes de empezar
      for (int i=0; i<arreglo.length;i++){
         arreglo[i]=(int)(Math.random()*100);
      }
     fin = System.nanoTime();//tomamos la hora despues de realizar el proceso
     tiempo= fin-ini;
     System.out.println("tiempo arreglo ="+tiempo);
   

    ini = System.nanoTime();
    for (int i = 0; i < 1000000;i++){
        lista.agregar((int)(Math.random()*100));
}

   fin = System.nanoTime();
   tiempo = fin - ini;
   System.out.println("tiempo lista"+ tiempo);*/
      System.out.println("tamaño de la lista:"+lista.longitud());
      lista.agregar(100);
      lista.agregar(200);
      lista.agregar(300);
      lista.agregar(400);
      lista.agregar(500);
      lista.Imprimir();
      System.out.println("tamaño de la lista:"+lista.longitud());
      System.out.println("valor de la posicion 0: " +lista.ValorEn(0));
      System.out.println("valor 100 en la posicion:"+lista.encontrar(100));
      System.out.println("valor 100 en la posicion:"+lista.encontrar(300));
      System.out.println("valor 100 en la posicion:"+lista.encontrar(500));
      System.out.println("valor 100 en la posicion:"+lista.encontrar(700));
      
      
      lista.insertarEn(259, 1);
     
     lista.Imprimir();
     lista.borrarEn(1);
     System.out.println("lista despues de borrar");
     lista.Imprimir();
     System.out.println("tamaño:"+lista.longitud());
     lista.Imprimir();
     lista.vaciarLista();
     lista.Imprimir();
     System.out.println("tamaño de la lista:"+ lista.longitud());
     lista.invertir();
      }
}
