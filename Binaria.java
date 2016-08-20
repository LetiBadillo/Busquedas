package vectores;

import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class Binaria extends Busquedas{
      
   
    @Override
    public int Buscar(Vector v, int a) {
        int centro; //se posiciona en el centro del vector
        
        
        int inicio=0; //posici�n inicial
        int fin=(v.size())-1;  //posici�n final
        while(inicio<=fin){  
            centro=(fin+inicio)/2; 
            if((int)v.elementAt(centro)==a){ //busca coincidencia en la posici�n central
                
                return centro; //regresa la posici�n central
            }
            else if(a < (int)v.elementAt(centro) ){  //si el n�mero a buscar es menor que el centro recorre la posici�n final -1
                fin=centro-1; 
            } else { 
                inicio=centro+1; //de no ser as�, recorre el centro una posici�n
            }
           
            
        }
        
        
         return -1; //regresa -1 si no encuentra el elemento
    } 
    
}
