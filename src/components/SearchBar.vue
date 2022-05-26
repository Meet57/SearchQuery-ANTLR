<template>
  <div>
    <a-row class="mt-10">
      <a-col :span="12">
        <h1 class="text-5xl text-cyan-600">Search Query</h1>
      </a-col>
    </a-row>
    <a-row>
      <a-col :span="12">
        <a-input placeholder="Basic usage" v-model="query" />
      </a-col>
    </a-row>
    <a-row class="mt-10">
      <a-col :span="12">
        <OutputTable :query="query" />
      </a-col>
    </a-row>
  </div>
</template>

<script>
import OutputTable from "./OutputTable.vue";

export default {
  name: "SearchBar",
  components: {
    OutputTable,
  },
  data() {
    return {
      query:
        'show top 10 sourceip:"192.168.0.1" metric:"system.network.interface~in.bytes.per.sec"',
    };
  },
};
</script>

<style></style>
