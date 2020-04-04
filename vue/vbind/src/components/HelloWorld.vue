<template>
  <div class="hello">
    <!-- <div v-bind:class="{class1}"> -->
    <!-- <div v-bind:class="{class1:bool1}"> -->
    <!-- <div class="class1" v-bind:class="{class2:bool1}"> -->
    <!-- <div v-bind:class="classGroup"> -->
    <!-- <div v-bind:class="[classa,classb]"> -->
    <!-- <div v-bind:class="[{class1:bool1},{class2:!bool1}]"> -->
    <!-- <div v-bind:style="{color:divcolor, fontSize:font+'px'}"> -->
    <div v-bind:style="class1">
      {{ msg }}
    </div>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      class1: {
        'width': '100px',
        'height': '100px',
        'backgroundColor': 'yellow'
      },
      bool1: true,
      classGroup: {
        class1: true,
        class2: true
      },
      classa: 'class1',
      classb: 'class2',
      divcolor: 'green',
      font: 30
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
.class1{
  width: 100px;
  height: 100px;
  background-color: yellow;
}
.class2{
  font-size: 20px;
  color: green;
}
</style>
