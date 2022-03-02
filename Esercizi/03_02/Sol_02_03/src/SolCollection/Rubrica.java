/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SolCollection;

/**
 *
 * @author Mimmo
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Rubrica {
private List<Contatto> contatti;
public Rubrica(){
this.contatti=new ArrayList<Contatto>();
}
void aggiungiContatto(String nome, String cognome, String telefono){
this.contatti.add(new Contatto(nome, cognome, telefono));
}
void rimuoviContatto(String nome, String cognome){
    boolean rimosso=false;
    Iterator<Contatto> it=this.contatti.iterator();
        while(it.hasNext() && !rimosso){
        Contatto c=it.next();
        if(c.getNome().equals(nome) &&
        c.getCognome().equals(cognome)){
            it.remove();
            rimosso=true;
            }
        }
    }
String cerca(String nome, String cognome){
    String numero=null;
    Iterator<Contatto> it=this.contatti.iterator();
    while(it.hasNext() && numero==null){
        Contatto c=it.next();
        if(c.getNome().equals(nome)&&
        c.getCognome().equals(cognome))
        numero=c.getNumero();
        }
    return numero;
    }
public String toString(){
    String s="Rubrica\n";
    s+="---------------------------\n";
    Iterator<Contatto> it=this.contatti.iterator();
    while(it.hasNext()){
        Contatto c=it.next();
        s+=c.toString()+"\n";
    }
    return s;
    }
}
