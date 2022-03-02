/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SolContenitore;

/**
 *
 * @author Mimmo
 */
abstract class C implements CMP{
protected int id;
abstract String getn();
C(int codice) {id=codice;}
int getid(){return id;}
public String toString(){
   String s="id:"; s+=id;
   return s;
}//fine toString
}//fine C