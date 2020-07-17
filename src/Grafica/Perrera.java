/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlollos
 */
public class Perrera {
    
    public Canino inicioLista;
    public Canino finLista;
    public Canino elementoActual;
    
    public int TamañoLista;
    public int eliminaractual;
    
    public Perrera(){
        this.inicioLista  = null;
        this.finLista = null;
        TamañoLista = 0;
    }
    
    //Agregar Nodo
   public void AgregarPerro(Object NuevoPerro2){
       if(inicioLista == null && finLista == null){
           Canino NuevoPerro = new Canino(NuevoPerro2);
           inicioLista = NuevoPerro;
           finLista = NuevoPerro;
           elementoActual = NuevoPerro;
       }else{
           Canino NuevoPerro = new Canino(NuevoPerro2);
           finLista.EnlazarSiguiente(NuevoPerro);
           finLista = NuevoPerro;
       }   
       TamañoLista++; 
   }
    //Agregar Nodo
   
   //Eliminar primer nodo
   public void EliminarPrimerPerro(){
       
   
       if((inicioLista == null && finLista == null) || ListaVacia()){
           JOptionPane.showMessageDialog(null, "La Lista esta vacia");
       }else{
           if(inicioLista == elementoActual){
             elementoActual = inicioLista.ObtenerSiguientePerro();
           }
            inicioLista = inicioLista.ObtenerSiguientePerro();
       }
       TamañoLista--;
     if(ListaVacia()){
            inicioLista=null;
            finLista=null;
            elementoActual=null;
        }
   }
    //Eliminar primer nodo
   public void EliminarUltimoPerro(){
       if(ListaVacia()){
            JOptionPane.showMessageDialog(null, "La Lista esta vacia");
       }else{
           Canino Aux = this.inicioLista;
           
           int auxTamaño = this.TamañoLista;
            this.inicioLista = null;
            this.finLista = null;
            this.elementoActual = null;
            this.TamañoLista=0;
           
           for (int i = 0; i < auxTamaño; i++) {
               if(i == auxTamaño-1){
                    Aux = Aux.ObtenerSiguientePerro();
               }else {
                   if(Aux == null){
                       break;
                   }else{
                   AgregarPerro(Aux.dato);
                   Aux = Aux.ObtenerSiguientePerro();
                   }
                  
               }
           }
           
       }
        
   }
   
   public void EliminarPerroPorIndice(int Indice){
       if(ListaVacia()){
            JOptionPane.showMessageDialog(null, "La Lista esta vacia");
       }else{
           Canino Aux = this.inicioLista;
           
           int auxTamaño = this.TamañoLista;
            this.inicioLista = null;
            this.finLista = null;
            this.elementoActual = null;
            this.TamañoLista=0;
           
           for (int i = 0; i < auxTamaño; i++) {
               if(i == Indice){
                    Aux = Aux.ObtenerSiguientePerro();
               }else {
                   if(Aux == null){
                       break;
                   }else{
                   AgregarPerro(Aux.dato);
                   Aux = Aux.ObtenerSiguientePerro();
                   }
               }
           }
       }
       
       
   }//Fin metodo Eliminar por indice

  
   //Buscar nodo
 public void Avanzar(){
     
     if(elementoActual.ObtenerSiguientePerro() != null){
          this.elementoActual = elementoActual.ObtenerSiguientePerro();
     }else{
         JOptionPane.showMessageDialog(null, "No se puede avanzar mas en la lista");
     }
    eliminaractual++;
 }
 
 public void Regresar(){
     elementoActual = inicioLista;
     eliminaractual = 0;
 }
 
 public void EliminarActual(){
      if(ListaVacia()){
            JOptionPane.showMessageDialog(null, "La Lista esta vacia");
       }else{
           Canino Aux = this.inicioLista;
           
           int auxTamaño = this.TamañoLista;
            this.inicioLista = null;
            this.finLista = null;
            this.elementoActual = null;
            this.TamañoLista=0;
           
           for (int i = 0; i < auxTamaño; i++) {
               if(i == eliminaractual){
                    Aux = Aux.ObtenerSiguientePerro();
               }else {
                   if(Aux == null){
                       break;
                   }else{
                   AgregarPerro(Aux.dato);
                   Aux = Aux.ObtenerSiguientePerro();
                   }
               }
           }
       }
 }
   
     //Buscar nodo
   public boolean ListaVacia(){
       if(TamañoLista==0){
           return true;
       }else{
           return false;
       }
   }
   public int CantidadDePerros(){
       return TamañoLista;
   }
    
    public ArrayList<Canino> ObtenerElementosGRAFICACION(){
         ArrayList<Canino> elementos = new ArrayList<>();
        
       if(!ListaVacia()){
           Canino Aux = inicioLista;
        
        for (int i = 0; i < TamañoLista; i++) {
           elementos.add(Aux);
           Aux = Aux.ObtenerSiguientePerro();
        }
        return elementos;
       }
       return null;
    }
}
