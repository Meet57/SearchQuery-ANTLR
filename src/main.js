import Vue from "vue";
import App from "./App.vue";
import "./index.css";
import "./registerServiceWorker";
import "ant-design-vue/dist/antd.css";
import Antd from "ant-design-vue";

Vue.config.productionTip = false;
Vue.use(Antd);

new Vue({
  render: function (h) {
    return h(App);
  },
}).$mount("#app");
