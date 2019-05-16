// Classes


class ToDoList{

    constructor(){
        this.todos = []
    }

     addTodo(){
        this.todos.push('NovoTodo')
        console.log(this.todos)
    }

}

const lista = new ToDoList() //const don't admit reatribuído, but admits alterations (push in an array, change an object)
lista.addTodo()


const vet = [1, 2, 3, 4, 5, 6]

//Arrays manipulation with arrow functions: Used mainly in callbacks ( functions that require funtions in args )
const newArr = vet.map( (item, index) => {
    return item*2 + index
})

const newArr2 = vet.reduce( (total, next) => total + next )

const newArr3 = vet.filter( (item) => item %2 === 0)

const newArr4 = vet.find( item => item === 123 )

console.log(newArr4)


//Default Values for Functions, can be used with arrow funtions too
function soma (a = 0 , b = 0){
    return a+b
}


//Desestruturação
const usuario = {
    nome: "Diego",
    idade: 10,
    endereco: "ashdlfks"
}
const {nome, idade} = usuario
// console.log(nome)

const {name, ...resto} = usuario            //REST operator
const array = [1,2,2,1,6,67,6767,2]
const [head, ...tail] = array
// console.log(nome, resto, head, tail)

function soma2 (a,b,...params){
    return params //array
}

const arr1 = [1,2,3]                    //Spread operator
const arr2 = [4,5,6]
const arr3 = [...arr1, ...arr2]         //arr3 = [1,2,3,4,5,6]

const pessoa1 = {
    nome: "João",
    idade: 20
}

const pessoa2 = { ...pessoa1, tamanho: 1.75 }

console.log(`Meu nome é ${pessoa2.nome} e tenho ${pessoa2.idade} anos!!!`)