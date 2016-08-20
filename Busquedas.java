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
public static void solicitar(){ //Método que solicita el elemento que se buscará
    System.out.println("Introduzca el número que busca.");
    
}
public static void mostrarVector(Vector v){ 
    for (int i=0; i<v.size(); i++){ //Recorre el vector e imprime sus elementos
        System.out.print(" "+v.elementAt(i));
}
}
public void mostrarResultado(Vector v, int i){ //Utilizando el método de búsqueda imprime la posición del elemento en el vector
    int q= Buscar(v, i); 
    if(q==-1){ //método buscar regresó -1, significa que no se encontraron coincidencias
    
    System.out.println("El número no se encuentra en el vector.");
    }else{ //si es diferente de -1, imprime la posición devuelta+1
        System.out.println("El elemento se encuentra en la posición "+(q+1));    
    }
    
    
}
abstract public int Buscar(Vector v, int a);

}

