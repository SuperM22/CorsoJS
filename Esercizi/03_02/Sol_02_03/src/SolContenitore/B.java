/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SolContenitore;

/**
 *
 * @author Mimmo
 */
class B extends C {
private String nome;
private int qta;
B(int cod,String s,int q) {super(cod);qta=q;nome=s;}
String getn(){return nome;}
public String toString(){
   String s;
   s=super.toString()+" nome:"+nome+" qta:"+qta;
   return s;
} //fine toString
public int confronta(C x){
if(x instanceof B ){return (this.qta-((B)x).qta);}
else return 1;
}//fine confronta
}//fine L