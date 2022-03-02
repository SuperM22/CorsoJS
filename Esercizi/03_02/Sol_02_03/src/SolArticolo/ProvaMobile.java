/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SolArticolo;

/**
 *
 * @author Mimmo
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ProvaMobile {
public static <T extends Mobile> List<T> scegliMobile(
    Catalogo <T> catalogo, double prezzo,
    double lunghezza, double altezza, double profondità){
    List<T> selezionati=new ArrayList<T>();
    List<T> selezionatiPerPrezzo=
    catalogo.getArticoliSottoPrezzo(prezzo);
    Iterator<T> it=selezionatiPerPrezzo.iterator();
    while(it.hasNext()){
        T el=it.next();
        if(el.getLunghezza()<lunghezza && el.getAltezza()<altezza
        && el.getProfondità()<profondità){
        selezionati.add(el);
        }
    }
    return selezionati;
    }
}