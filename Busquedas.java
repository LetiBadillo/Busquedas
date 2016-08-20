package vectores;
import java.util.*;
/**
 *
 * @author ASUS
 */
public abstract class Busquedas  {
    protected Vector vector= new Vector();
   
public void setVector(Vector v){ //constructor
        this.vector=v;
    }
public Vector getVector(){
    //Obtener vector (regresa el valor del vector, debe ser capaz de identificar que objeto Secuencial o Binario lo llama)
 Vector vector= this.vector;
 return this.vector;  
}
public static void solicitar(){ //M�todo que solicita el elemento que se buscar�
    System.out.println("Introduzca el n�mero que busca.");
    
}
public static void mostrarVector(Vector v){ 
    for (int i=0; i<v.size(); i++){ //Recorre el vector e imprime sus elementos
        System.out.print(" "+v.elementAt(i));
}
}
public void mostrarResultado(Vector v, int i){ //Utilizando el m�todo de b�squeda imprime la posici�n del elemento en el vector
    int q= Buscar(v, i); 
    if(q==-1){ //m�todo buscar regres� -1, significa que no se encontraron coincidencias
    
    System.out.println("El n�mero no se encuentra en el vector.");
    }else{ //si es diferente de -1, imprime la posici�n devuelta+1
        System.out.println("El elemento se encuentra en la posici�n "+(q+1));    
    }
    
    
}
abstract public int Buscar(Vector v, int a);

}

