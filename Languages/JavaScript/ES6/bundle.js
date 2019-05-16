"use strict";

function _objectSpread(target) { for (var i = 1; i < arguments.length; i++) { var source = arguments[i] != null ? arguments[i] : {}; var ownKeys = Object.keys(source); if (typeof Object.getOwnPropertySymbols === 'function') { ownKeys = ownKeys.concat(Object.getOwnPropertySymbols(source).filter(function (sym) { return Object.getOwnPropertyDescriptor(source, sym).enumerable; })); } ownKeys.forEach(function (key) { _defineProperty(target, key, source[key]); }); } return target; }

function _defineProperty(obj, key, value) { if (key in obj) { Object.defineProperty(obj, key, { value: value, enumerable: true, configurable: true, writable: true }); } else { obj[key] = value; } return obj; }

function _objectWithoutProperties(source, excluded) { if (source == null) return {}; var target = _objectWithoutPropertiesLoose(source, excluded); var key, i; if (Object.getOwnPropertySymbols) { var sourceSymbolKeys = Object.getOwnPropertySymbols(source); for (i = 0; i < sourceSymbolKeys.length; i++) { key = sourceSymbolKeys[i]; if (excluded.indexOf(key) >= 0) continue; if (!Object.prototype.propertyIsEnumerable.call(source, key)) continue; target[key] = source[key]; } } return target; }

function _objectWithoutPropertiesLoose(source, excluded) { if (source == null) return {}; var target = {}; var sourceKeys = Object.keys(source); var key, i; for (i = 0; i < sourceKeys.length; i++) { key = sourceKeys[i]; if (excluded.indexOf(key) >= 0) continue; target[key] = source[key]; } return target; }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

// Classes
var ToDoList =
/*#__PURE__*/
function () {
  function ToDoList() {
    _classCallCheck(this, ToDoList);

    this.todos = [];
  }

  _createClass(ToDoList, [{
    key: "addTodo",
    value: function addTodo() {
      this.todos.push('NovoTodo');
      console.log(this.todos);
    }
  }]);

  return ToDoList;
}();

var lista = new ToDoList(); //const don't admit reatribuído, but admits alterations (push in an array, change an object)

lista.addTodo();
var vet = [1, 2, 3, 4, 5, 6]; //Arrays manipulation with arrow functions: Used mainly in callbacks ( functions that require funtions in args )

var newArr = vet.map(function (item, index) {
  return item * 2 + index;
});
var newArr2 = vet.reduce(function (total, next) {
  return total + next;
});
var newArr3 = vet.filter(function (item) {
  return item % 2 === 0;
});
var newArr4 = vet.find(function (item) {
  return item === 123;
});
console.log(newArr4); //Default Values for Functions, can be used with arrow funtions too

function soma() {
  var a = arguments.length > 0 && arguments[0] !== undefined ? arguments[0] : 0;
  var b = arguments.length > 1 && arguments[1] !== undefined ? arguments[1] : 0;
  return a + b;
} //Desestruturação


var usuario = {
  nome: "Diego",
  idade: 10,
  endereco: "ashdlfks"
};
var nome = usuario.nome,
    idade = usuario.idade; // console.log(nome)

var name = usuario.name,
    resto = _objectWithoutProperties(usuario, ["name"]); //REST operator


var array = [1, 2, 2, 1, 6, 67, 6767, 2];
var head = array[0],
    tail = array.slice(1); // console.log(nome, resto, head, tail)

function soma2(a, b) {
  for (var _len = arguments.length, params = new Array(_len > 2 ? _len - 2 : 0), _key = 2; _key < _len; _key++) {
    params[_key - 2] = arguments[_key];
  }

  return params; //array
}

var arr1 = [1, 2, 3]; //Spread operator

var arr2 = [4, 5, 6];
var arr3 = [].concat(arr1, arr2); //arr3 = [1,2,3,4,5,6]

var pessoa1 = {
  nome: "João",
  idade: 20
};

var pessoa2 = _objectSpread({}, pessoa1, {
  tamanho: 1.75
});

console.log("Meu nome \xE9 ".concat(pessoa2.nome, " e tenho ").concat(pessoa2.idade, " anos!!!"));
