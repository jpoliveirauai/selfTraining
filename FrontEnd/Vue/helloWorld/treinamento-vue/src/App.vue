<template>
  <div id="app">
    <!-- <p v-bind:style="{'color':cor}" >{{nome}}</p>
    <button v-on:click="fazAlgoComNome()"> Clica ni mim </button>-->

    <div>
      <form class="form" @submit.prevent="submitForm">
        <label>Nome:</label>
        <input v-model="nome" type="text">

        <label>E-mail:</label>
        <input v-model="email" type="text">

        <label>Senha:</label>
        <input v-model="senha" type="password">

        <button @click.prevent="submitForm">Submit</button>
      </form>
      <div class="usuarios">
        <div class="usuario" v-for="(usuario) in this.usuarios" :key="usuario.id">
          <p>{{usuario.nome}}</p>
          <!-- <button @click="editUser(i)">Edit</button> -->
          <button @click="mostra = !mostra">Edit</button>

          <div v-if="mostra">
            <input type="text" v-model="novoNome">
            <button @click="editaNome(usuario.id)">Editar Nome</button>
          </div>
          <button @click="deletaUser(usuario.id)">Delete</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import uuid from "uuid";
export default {
  name: "app",
  data() {
    return {
      nome: "",
      email: "",
      senha: "",
      usuarios: [],
      mostra: true,
      novoNome: ""
    };
  },
  methods: {
    submitForm() {
      const user = {
        id: uuid.v4(),
        nome: this.nome,
        email: this.email,
        senha: this.senha
      };
      this.usuarios.push(user);
    },
    deletaUser(id) {
      this.usuarios = this.usuarios.filter(usuario => usuario.id != id);
      // this.usuarios.pop(id)
    },
    editaNome(id) {
    //   this.usuarios[index] = this.novoNome;
    const usuario = this.usuarios.find(user => user.id == id)
    usuario.nome = this.novoNome
    }
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.form {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 500px;
  margin: auto;
  flex-direction: column;
}

.usuarios {
  display: flex;
  width: 100vw;
  align-items: center;
  margin: auto;
  justify-content: center;
  flex-direction: column;
}

.usuario {
  width: 80vw;
  margin: 10px auto 10px auto;
  display: flex;
  justify-content: space-around;
  align-items: center;
  background-color: brown;
  color: white;
  border-radius: 5px;
}
</style>
