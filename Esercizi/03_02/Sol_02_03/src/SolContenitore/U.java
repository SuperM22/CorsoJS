/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SolContenitore;

/**
 *
 * @author Mimmo
 */
class U{
C[] filtra(C[] T, C c){
int j=0;
for(int i=0;i < T.length;i++){    if((T[i].getn()).equals(c.getn())){T[i]=null;j++;}
}//fine for
int lg=T.length-j;
j=0;
C[] vet=new C[lg];
for(int i=0;i < T.length;i++)
   if(T[i]!=null){vet[j]=T[i];j++;}
return vet;
}//fine filtra
}//fine U