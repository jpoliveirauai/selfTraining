// Variáveis e objetos
console.log('Hello');
var variavel = "João";
nome = 2;
var humano = true;
var array = ['João', 'Paulo', 'de', 'Oliveira']
var alunoObjeto = {
    nome: 'João',
    idade: 20
};
console.log(array);
console.log(alunoObjeto.idade);

//Funções

function soma ( n1 , n2 ){
    return ( n1 + n2 );
}

function retornaSexo ( sexo ) {
    if ( sexo.toUpperCase() === 'M' ){
        return "Masculino";
    } else if ( sexo.toUpperCase() === 'F' ){
        return "Feminino";
    } else {
        return "Outro";
    }
    return;


    switch ( sexo.toUpperCase() ) {
        case 'M':
            return "Masculino";
            break;
        case 'F':
            return "Feminino";
            break;
        default:
            return "Outro";
            break;
        
    }
}

var sexo = 'm';
console.log(sexo.toUpperCase() === 'f' ? "Masculino" : "Feminino")

// Estruturas de repetição
for ( var i = 0 ; i < 10 ; i++ ){
    // console.log ( i );
}
var j = 0;
while ( j == 0 ){
    console.log ( "Deu bão" );
    j = 1;
}

// Set Inverval e timeouts

function mostraAlgo(){
    console.log ( "Algo" );
    return;
}
function mostraAlgoBom(){
    console.log ( "Algo Bom" );
    return;
}

// Repete a função no intervalo de tempo em ms, paralelamente
setInterval ( mostraAlgo , 1000 );
console.log ( "Algo muito bom" );
// Aguarda o intervalo de tempo em ms, paralelamente e executa
setTimeout ( mostraAlgoBom , 1000 );