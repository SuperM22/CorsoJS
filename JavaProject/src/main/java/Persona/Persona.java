/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;
import java.lang.*;

/**
 *
 * @author Mimmo
 */
public class Persona {
    private String nome;
    public String residenza;
    
    public Persona(String nome,String residenza){
        this.nome=nome;
        this.residenza=residenza;
    }

    public String getNome() {
        return nome;
    }

    public String getResidenza() {
        return residenza;
    }

    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }
    
    
    
    
    
}


