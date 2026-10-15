/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aylin
 */
public class ListaSimple {
   private Nodo inicio;
   private Nodo fin;
   private int length;
   
   public ListaSimple(){
      inicio =  null; //al crear la lista,se crea vacia
      fin=null;
      length = 0;
   }
   //siempre se agrega al final de la lista
   public void agregar (int Valor){
      Nodo nuevo = new Nodo(Valor); //creo el nodo para el valor insertar
      if(inicio ==null){
         inicio = nuevo;
        fin=nuevo;
       //nuevo es el primer nodo de la lista
      }else {//lista con nodos
         //movernos al final
       /* Nodo temp = inicio;
          while(temp.getSiguiente() != null){
            temp =temp.getSiguiente();
         }
         temp.setSiguiente(nuevo); */   //conecto nuevo al final de la lista
         fin.setSiguiente(nuevo);
         fin = nuevo;
     }
      length++;
   }
   public void Imprimir (){
      int []valor = new int[length];
      Nodo temp= inicio;
      int i =0;
      while (temp  !=null){
         valor[i]= temp.getValor();
         System.out.print("["+ temp.getValor()+"]");
         temp=temp.getSiguiente();
         i++;
      }
      for(i=length - 1; i>=0; i--){
         System.out.println("["+ valor[i]+"]");
      }
   }
   //0(?)
      public int longitud(){
         int cont =0;
        Nodo temp =  inicio;
      while (temp  !=null){
         cont++;
         temp = temp.getSiguiente();
      }
      return cont;
   }
      //o(1)
      public boolean listaVacia(){
         if(inicio==null){
            return true;
         }else{
            return false;
         }
      }
      public void vaciarLista(){
         inicio = null;
         fin=null;
         length=0;
      }
      public int ValorEn(int posicion)throws RuntimeException{
         //excepcion
         //validar pocision
         //1 que posiciones  osn validas? de 0(cero)a N-1 (N es la cantidad de nodos)
         int tama = longitud();
         if(posicion>=0 && posicion < tama){
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++){
               temp=temp.getSiguiente();
            }
            return temp.getValor();
         }else{
            throw new RuntimeException("la posicion"+posicion+ "no es valida");
         }
      }
      
     //regresa la primer aparicion del valor en la lista
      //regresa la posicion
      //0(??)
      public int encontrar (int valor){
        Nodo temp = inicio;
    int posicion = 0;

    while (temp != null) {
        if (temp.getValor() == valor) {
            return posicion;
        }

        temp = temp.getSiguiente();
        posicion++;
    }

    return -1;
      }
       public void insertarEn(int valor, int posicion){
          int tama= longitud();
        if(posicion < 0 || posicion > longitud()){
            throw new RuntimeException("La posicion " +  posicion + "no es valida!");
        }else{
            Nodo nuevo = new Nodo(valor);
            if(posicion == 0){
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                if(fin == null){
                    fin = nuevo;
                }
            }else if(posicion == longitud()){
                fin.setSiguiente(nuevo);
                fin = nuevo;
            }else{
                Nodo temp = inicio;
                for (int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }
        }
    }
      public void borrarEn (int posicion){
        if (posicion < 0 || posicion >= longitud()) {
            throw new RuntimeException("la posicion " + posicion + "no es valida para borrar");
        }
        if (posicion == 0) {
            inicio = inicio.getSiguiente();
            if (inicio == null) {
                fin = null;
            }
        }
        else{
            Nodo temp = inicio;
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            if (temp.getSiguiente() == null) {
                fin = temp;
            }
        }
        } 
         public void invertir(){
           int tama = longitud();
           for (int i = tama-1; i >=0; i--){
              System.out.println("[" + ValorEn(i) + "]");
        }
           System.out.println("");
       }
}
   
