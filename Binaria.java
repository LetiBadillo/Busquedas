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
        
        
        int inicio=0; //posición inicial
        int fin=(v.size())-1;  //posición final
        while(inicio<=fin){  
            centro=(fin+inicio)/2; 
            if((int)v.elementAt(centro)==a){ //busca coincidencia en la posición central
                
                return centro; //regresa la posición central
            }
            else if(a < (int)v.elementAt(centro) ){  //si el número a buscar es menor que el centro recorre la posición final -1
                fin=centro-1; 
            } else { 
                inicio=centro+1; //de no ser así, recorre el centro una posición
            }
           
            
        }
        
        
         return -1; //regresa -1 si no encuentra el elemento
    } 
    
}
