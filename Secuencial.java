package vectores;

import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class Secuencial extends Busquedas {
    
    static boolean b;     
   
    @Override
    public int Buscar(Vector v, int a) { 
        for (int i=0; i<v.size(); i++){ //recorre el vector 
                if ((int)v.elementAt(i)==a){ //busca coincidencias
                b=true;
                return i; //regresa la posición del vector
                }
            
                
        } return -1; //regresa -1 si no existe el elemento
        } 

 
}
