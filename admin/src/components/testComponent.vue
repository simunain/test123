<template>
  <div class="hello">
    <h1>我被引用了xxx.vue</h1>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  sizeeee: 10, // 每页条数,
  data: function () {
    return {
      total: 0, // 总行数
      size: 10, // 每页条数
      page: 0, // 当前页码
      pageTotal: 0, // 总页数
      pages: [], // 显示的页码数组
    }
  },
  mounted: function() {
    //列如页面渲染完之后会自动执行list方法
    this.list();
  },
  //添加vue事件(也就是js方法逻辑),这里的事件是list
  methods: {
    //list表示一个事件方法
    list() {
      //定义一个成员变量_this,表示可以引用当前对象的关键词
      let _this=this;
      //$ajax表示使用axios.因为在main.js定义了axios全局变量为$ajxs
      //then(Response)里的Response为请求后台返回的数据
      //get为请求后台方法地址
      _this.$ajax.post('http://localhost:9000/business/admin/chapter/postlistPageDto',{
        page:1,
        size:3
      }).then((Response)=>{
        //alert("走到这个方法里的这段代码了了");
        console.log("查询大章节列表结果:",Response);
        //赋值给上面的 chapters: []
        //注意为什么要点data在点list呢,因为返回来的数据是被list包括起来然后list又被data包括请来的,所以要想使用返回来的数据先点data.list
        _this.chapters=Response.data.list;
        //alert("2222222走到这个方法里的这段代码了了");
      }).catch(error => { //当请求后台代码出现错误的时候会进入到这个方法里
        console.log("请求出现错误:",error);
        return error
      })
    }
  }
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
