import  Vue from "vue"
import  Router from "vue-router"
import  Login from "./views/login.vue"
import  Admin from "./views/admin"
import  Welcome from "./views/admin/welcome"
import Chapter from "./views/admin/chapter"
import xxx from "./components/xxx"
import xxxtwo from "./components/xxx2"
Vue.use(Router);

export default new Router({
    //默认 hash 模式 —— 使用 URL 的 hash 来模拟一个完整的 URL，于是当 URL 改变时，页面不会重新加载。
    //这里是使用history模式
    mode:"history",
    base:process.env.BASE_URL,
    //路由地址配置
    routes:[{
        //根目录
        path:"*",
        redirect:"/login",

    },{
        path:"/login",
        component:Login
    },{
        path:"/xx",
        component:xxx
    },
        {
            path:"/xxtwo",
            component:xxxtwo
        },
        {
            path:"/",
            component:Admin,
           // admin的 子路由
            children:[
                {
                path:"welcome",
                component:Welcome
            },
                {
                    path:"business/chapter",
                    component:Chapter
                }

            ]
        },

    ]
    }

)