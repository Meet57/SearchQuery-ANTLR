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
          ref="CodeMirror"
          :options="options"
          :events="events"
          placeholder="Basic usage"
          @ready="onEditorReady"
          @cursorActivity="onChange"
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
import "codemirror/addon/hint/show-hint";
import "codemirror/addon/hint/show-hint.css";
import "codemirror/theme/dracula.css";
import SearchContext from "@/parser/searchContext";

export default {
  name: "SearchBar",
  components: {
    OutputTable,
    codemirror,
  },
  data() {
    this.events = ["cursorActivity"];
    return {
      query: "",
      options: {
        theme: "dracula",
      },
    };
  },
  methods: {
    onEditorReady(editor) {
      console.log(this.$refs.CodeMirror.codemirror);
      editor.focus();
      editor.on("beforeChange", this.cleanNewLines);
    },
    cleanNewLines(instance, change) {
      var newtext = change.text.join("").replace(/\n/g, ""); // remove ALL \n !
      change.update(change.from, change.to, [newtext]);
      return true;
    },
    onChange(editor) {
      var queryInfo = {
        query: editor.getValue(),
        caretPosition: editor.getCursor().ch,
      };
      this.showSuggestions();
    },
    showSuggestions() {
      var suggestionList = SearchContext.getSuggestions();
      var range = SearchContext.getRange();

      if (suggestionList) {
        suggestionList = suggestionList.map((o) => ({
          displayText: o,
          text: o,
        }));
        var options = {};
        options.hint = () => ({
          from: { line: 0, ch: range.start },
          to: { line: 0, ch: range.end + 1 },
          list: suggestionList,
        });
        this.$refs.CodeMirror.codemirror.showHint(options);
      } else {
        var options = {};
        options.hint = () => ({
          from: { line: 0, ch: range.start },
          to: { line: 0, ch: range.end + 1 },
          list: [],
        });
        this.$refs.CodeMirror.codemirror.showHint(options);
      }
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
