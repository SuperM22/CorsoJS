/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SolArticolo;

/**
 *
 * @author Mimmo
 */
public class Mobile implements Articolo {
    private String nome;
    private double prezzo;
    private double lunghezza;
    private double altezza;
    private double profondità;
public Mobile(String nome, double prezzo, double lunghezza,
double altezza, double profondità) {
    this.nome = nome;
    this.prezzo = prezzo;
    this.lunghezza = lunghezza;
    this.altezza = altezza;
    this.profondità = profondità;
    }
public double getLunghezza() {
    return lunghezza;
    }
public double getAltezza() {
    return altezza;
    }
public double getProfondità() {
    return profondità;
    }
public String getNome() {
    return this.nome;
    }
public double getPrezzo() {
    return this.prezzo;
    }
public String toString(){
    return this.nome+" Prezzo: "+prezzo+" Misure: "+lunghezza+" X "
    +altezza+" X "+profondità;
    }
}