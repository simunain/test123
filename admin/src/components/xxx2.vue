<template>
        <div>
            <h1>引用了testComponent.vue</h1>
            <!-- 2.在template中使用 -->
            <testComponent></testComponent>
        </div>
    </template>

 <script>
         export default {
               //1.直接在components中写入子组件
               components: {
                   testComponent:require('../components/testComponent').default
               },
             methods: {

             },
         }
    </script>

 <style></style>