<template>
  <div id="app">
      <Botao />
  </div>
</template>

<script>
import Botao from "./components/Botao"

export default {
  name: 'app',
  components: {
      Botao
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
