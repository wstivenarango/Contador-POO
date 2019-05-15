/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public class Contador {
    private int valor;
    
    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
    public Contador(){
        this.valor = 0;
    }
    public void avanzar(){
        this.valor += 1;
    }
    
   public void retroceder(){
       this.valor -= 1;
   }
   
   public void borrar(){
       this.valor = 0;
   }
}
