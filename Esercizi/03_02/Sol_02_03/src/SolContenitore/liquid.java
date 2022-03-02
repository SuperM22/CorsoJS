/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SolContenitore;

/**
 *
 * @author Mimmo
 */
class liquid {
public static void main(String[] args) {
C l1=new L(1,"birra",1);
C l2=new L(2,"the",2);
C b1=new B(3,"the",10);
C b2=new B(4,"the",15);
C T[]=new C[5];
T[0]=l1; T[1]=l2; T[2]=b1; T[3]=b2;
T[4]=new B(5,"birra",20);
System.out.println("prima del filtro");
for (int i=0;i < T.length;i++)System.out.println(T[i]); System.out.println("l1 > l2 ?:"+l1.confronta(l2));
System.out.println("b1 > b2 ?:"+b1.confronta(b2));
U u=new U();
T=u.filtra(T,l2);
System.out.println("dopo il filtro");
for (int i=0;i < T.length;i++)System.out.println(T[i]);
}//fine main
}//fine classe
