import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from "axios";  //引进axios组件
Vue.config.productionTip = false
//使axios组件全局使用
Vue.prototype.$ajax=axios;

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
