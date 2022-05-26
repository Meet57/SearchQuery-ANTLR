<template>
  <div class="mx-10 mt-5">
    <SearchBar />
  </div>
</template>

<script>
import SearchBar from './components/SearchBar.vue'
  export default{
    name:'App',
    components:{
      SearchBar
    }
  }
</script>

<style>
*{
  font-weight: 400;
}
</style>
