//Creare una funzione che dati in input un
//numero ed una stringa restituisce solo i 
//primi n caratteri

//funzione(saibfiasnfiub,6)=saibfi

function s1(x,n){
    if(n>x.length) {console.log("il numero inserito è maggiore della stringa");
    return x;
    }
    var y=""
    for (let i=0;i<n;i++){
        y=y+x[i];
    }
    return y
}
console.log(s1("youtube",3));
console.log(s1("iushfuhsgwiugw",22));
// sostituisci_carattere(s,c1,c2);
// dati in input una stringa s,
// e due caratteri c1 e c2, 
//crei e restituisca in output una stringa
//contenente tutti i caratteri 
//di s1 nella quale il carattere 
//c1 deve essere sostituito dal carattere
//c2.
function sostituisci_carattere(s,c1,c2)


//assegnazione 
//var s="ciao "; s[0]="h"; avrò s="hiao"


//assegnazione nel ciclo (elemento per elemento)
//for(var i =0;i<.length;i++){s[i]="h"}//avro tutti i caratteri della stringa uguali ad h
//x="c" x="ci" x="cit"

//che dato in ingresso un vettore v
// di dimensione dim, modifichi v scalando
// le sue componenti
//di un fattore d. 
//Si ricorda che scalare un vettore
// di un fattore d significa moltiplicare 
//tutte le
//sue componenti per il valore d.

//scalavettore(v,d)  let v = [1,2,3,45,6,7,8,9]

//scalavettore(v,3)= [3,6,9]  


// inverti(s);
//che, data in input una stringa s 
//restituisca in output la stringa s 
//con i caratteri invertiti.