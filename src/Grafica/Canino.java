
package Grafica;

/**
 *
 * @author Carlollos
 */
public class Canino {

    public Object dato;
    public Canino siguiente;
    
    public Canino(Object dato){
        this.dato = dato;
        this.siguiente = null;
    }
 
   public void EnlazarSiguiente(Canino a){
       this.siguiente = a;
   }
   public void Desenlazar(){
       this.siguiente=null;
   }
   public Canino ObtenerSiguientePerro(){
       return this.siguiente;
   }
   public Object ObtenerValorPerro(){
       return this.dato;
   }
}
