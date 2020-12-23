<template>
    <div class="hello">
        <h1>引用了testComponent.vue</h1>
        <h1> {{chaid}}</h1>
        <div>
            <h1>------------------------------------------</h1>
            <!-- 3.在template中就可以直接使用了 -->
            <testComponent></testComponent>
        </div>
    </div>
</template>

<script>
    //1.先使用import导入你要在该组件中使用的子组件
    import testComponent from '../components/testComponent'
    export default {
        //2.然后,在components中写入子组件
        components: {testComponent},
        //msg:this.$refs.testComponent.size,
        data: function(){
            return{
                //定义组件变量chapters为数组变量,
                //这样子的好处是,提供给当前组件使用该变量,列如可以在script里的事件里使用,也可以在页面其他标签里使用,
                //列如这里的list事件里  _this.chapters=Response;进行把返回的参数赋值给了这里的chapters: []
                chaid:"无语了为什么不出来",
            }
        },
        methods: {

        },
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    h3 {
        margin: 40px 0 0;
    }
    ul {
        list-style-type: none;
        padding: 0;
    }
    li {
        display: inline-block;
        margin: 0 10px;
    }
    a {
        color: #42b983;
    }
</style>
