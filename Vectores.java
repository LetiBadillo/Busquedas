package vectores;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int v, i, e, a;
        i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el n�mero de elementos");
        v = sc.nextInt(); //almacena el n�mero de elementos en variable v
        Vector x= new Vector(v); //crea un vector de tama�o v
        Secuencial w = new Secuencial(); //instacia de elemento para  b�squeda secuencial
        Binaria b = new Binaria(); //instancia de elemento para b�squeda binaria
        w.setVector(x); //set Vector en clase secuencial
        b.setVector(x); //set Vector en clase binaria
        
        while(i!=v){ //se ejecuta hasta llenar el vector
        System.out.println("Introduzca el elemento #"+(i+1)+" y presione enter"); //pide el n�mero de elementos
        e=sc.nextInt();
        x.addElement(e);
        i++;
            }
        w.solicitar(); //solicita el n�mero a buscar
        a=sc.nextInt();
        System.out.println("Elementos del vector:");
        w.mostrarVector(w.getVector()); //muestra el contenido del vector
        System.out.println("");
        System.out.print("B�squeda Secuencial:");
        w.mostrarResultado(w.getVector(), a); //imprime el resultado de la b�squeda secuencial
        System.out.print("B�squeda Binaria:");
        b.mostrarResultado(b.getVector(), a); //imprime resultado de b�squeda binaria
        
    }
    
}
