<template>
  <div>
    <a-row class="mt-10">
      <a-col :span="12">
        <h1 class="text-5xl text-cyan-600">Search Query</h1>
      </a-col>
    </a-row>
    <a-row>
      <a-col :span="20">
        <codemirror
          id="CodeMirror"
          :options="options"
          placeholder="Basic usage"
          @ready="onEditorReady"
          v-model="query"
        />
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
import { codemirror } from "vue-codemirror";
import "codemirror/lib/codemirror.css";
import "codemirror/theme/dracula.css";

export default {
  name: "SearchBar",
  components: {
    OutputTable,
    codemirror,
  },
  data() {
    return {
      query:
        'show top 10 sourceip:"192.168.0.1" metric:"system.network.interface~in.bytes.per.sec"',
      options: {
        theme: "dracula",
      },
    };
  },
  methods: {
    onEditorReady(editor) {
      editor.focus();
      editor.on("beforeChange", this.cleanNewLines);
    },
    cleanNewLines(instance, change) {
      var newtext = change.text.join("").replace(/\n/g, ""); // remove ALL \n !
      change.update(change.from, change.to, [newtext]);
      return true;
    },
  },
};
</script>

<style scoped>
#CodeMirror {
  border: 1px solid #eee;
  height: 40px !important;
  overflow-y: hidden;
}
</style>
