<template>
  <a-descriptions :column="1" size="small" bordered>
    <a-descriptions-item v-for="o in output" :key="o.name">
      <template v-slot:label>
        <div :class="[o.name == 'Error' ? 'text-red-900' : 'text-blue-900']">
          {{ o.name }}
        </div>
      </template>
      {{ o.value }}
    </a-descriptions-item>
  </a-descriptions>
</template>

<script>
import { parse } from "../parser/index";

export default {
  name: "OutputTable",
  props: {
    query: {
      type: String | null,
      default: "",
    },
  },
  data() {
    return {
      output: null,
    };
  },
  watch: {
    query(newValue) {
      var data = parse(newValue);
      if (typeof data == "object") {
        this.output = data;
      } else {
        this.output = [
          {
            name: "Error",
            value: data,
          },
        ];
      }
    },
  },
  created() {
    this.output = parse(this.query);
  },
};
</script>

<style></style>
