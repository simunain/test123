<template>
<div>
    <p>
        <button v-on:click="toSection(chapter)" class="btn btn-white btn-xs btn-info btn-round">
            小节
        </button>&nbsp;
        <button v-on:click="add()" class="btn btn-white btn-default btn-round">
            <i class="ace-icon fa fa-edit"></i>
            新增
        </button>
        <!--新增一个刷新的按钮,重新去执行list方法,去查询查询一次数据达到刷新的效果-->
        <button v-on:click="list(1)" class="btn btn-white btn-default btn-round">
        <i class="ace-icon fa fa-refresh"></i>
            刷新
        </button>
    </p>
    <pagination ref="pagination" v-bind:list="list" v-bind:itemCount="8"></pagination>
    <!-- PAGE CONTENT BEGINS 出现这个东西就是页面内容了-->
            <table id="simple-table" class="table  table-bordered table-hover">
                <thead>
                <!--tr设置表列,th表示有几列并且给没列设置列名,列如下边有四列-->
                <tr>
                    <th>ID</th>
                    <th>名称</th>
                    <th>课程ID</th>
                    <th>操作</th>
                </tr>
                </thead>

                <!--tdbody标签是表格内容-->
                <tbody>
<!--一个tr表示一行数据,-->
                <tr v-for="cha in chapters"> <!--遍历已经赋值完成的chapters: [],然后遍历赋值给cha-->
                   <!-- 每一个td表示一列数据,放在td里的数据是上面的th列名的内容-->
                    <td>{{cha.id}}</td> <!--把遍历得到的值赋值到这里-->
                    <td>{{cha.name}}</td>
                    <td>{{cha.courseId}}</td>

                    <td>
                        <div class="hidden-sm hidden-xs btn-group">
                            <button class="btn btn-xs btn-success">
                                <i class="ace-icon fa fa-check bigger-120"></i>
                            </button>

                            <button class="btn btn-xs btn-info">
                                <i class="ace-icon fa fa-pencil bigger-120"></i>
                            </button>

                            <button class="btn btn-xs btn-danger">
                                <i class="ace-icon fa fa-trash-o bigger-120"></i>
                            </button>

                            <button class="btn btn-xs btn-warning">
                                <i class="ace-icon fa fa-flag bigger-120"></i>
                            </button>
                        </div>

                        <div class="hidden-md hidden-lg">
                            <div class="inline pos-rel">
                                <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                    <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                </button>

                                <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                    <li>
                                        <a href="#" class="tooltip-info" data-rel="tooltip" title="View">
																			<span class="blue">
																				<i class="ace-icon fa fa-search-plus bigger-120"></i>
																			</span>
                                        </a>
                                    </li>

                                    <li>
                                        <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
																			<span class="green">
																				<i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
																			</span>
                                        </a>
                                    </li>

                                    <li>
                                        <a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
																			<span class="red">
																				<i class="ace-icon fa fa-trash-o bigger-120"></i>
																			</span>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </td>
                </tr>


                <tr class="detail-row">
                    <td colspan="8">
                        <div class="table-detail">
                            <div class="row">
                                <div class="col-xs-12 col-sm-2">
                                    <div class="text-center">
                                        <img height="150" class="thumbnail inline no-margin-bottom" alt="Domain Owner's Avatar" src="assets/images/avatars/profile-pic.jpg" />
                                        <br />
                                        <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                                            <div class="inline position-relative">
                                                <a class="user-title-label" href="#">
                                                    <i class="ace-icon fa fa-circle light-green"></i>
                                                    &nbsp;
                                                    <span class="white">Alex M. Doe</span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-xs-12 col-sm-7">
                                    <div class="space visible-xs"></div>

                                    <div class="profile-user-info profile-user-info-striped">
                                        <div class="profile-info-row">
                                            <div class="profile-info-name"> Username </div>

                                            <div class="profile-info-value">
                                                <span>alexdoe</span>
                                            </div>
                                        </div>

                                        <div class="profile-info-row">
                                            <div class="profile-info-name"> Location </div>

                                            <div class="profile-info-value">
                                                <i class="fa fa-map-marker light-orange bigger-110"></i>
                                                <span>Netherlands, Amsterdam</span>
                                            </div>
                                        </div>

                                        <div class="profile-info-row">
                                            <div class="profile-info-name"> Age </div>

                                            <div class="profile-info-value">
                                                <span>38</span>
                                            </div>
                                        </div>

                                        <div class="profile-info-row">
                                            <div class="profile-info-name"> Joined </div>

                                            <div class="profile-info-value">
                                                <span>2010/06/20</span>
                                            </div>
                                        </div>

                                        <div class="profile-info-row">
                                            <div class="profile-info-name"> Last Online </div>

                                            <div class="profile-info-value">
                                                <span>3 hours ago</span>
                                            </div>
                                        </div>

                                        <div class="profile-info-row">
                                            <div class="profile-info-name"> About Me </div>

                                            <div class="profile-info-value">
                                                <span>Bio</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-xs-12 col-sm-3">
                                    <div class="space visible-xs"></div>
                                    <h4 class="header blue lighter less-margin">Send a message to Alex</h4>

                                    <div class="space-6"></div>

                                    <form>
                                        <fieldset>
                                            <textarea class="width-100" resize="none" placeholder="Type something…"></textarea>
                                        </fieldset>

                                        <div class="hr hr-dotted"></div>

                                        <div class="clearfix">
                                            <label class="pull-left">
                                                <input type="checkbox" class="ace" />
                                                <span class="lbl"> Email me a copy</span>
                                            </label>

                                            <button class="pull-right btn btn-sm btn-primary btn-white btn-round" type="button">
                                                Submit
                                                <i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>
                                            </button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>

    <div id="form-modal" class="modal fade" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">表单</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">名称</label>
                            <div class="col-sm-10">
                                <input v-model="chapter.name" class="form-control" placeholder="名称">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">课程</label>
                            <div class="col-sm-10">
                                <p class="form-control-static">{{course.name}}</p>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    <button v-on:click="save()" type="button" class="btn btn-primary">保存</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
</div>



</template>

<!--添加login的script-->
<!--注意
再说上面的template标签中是不允许有script标签的,script标签要写在template标签下面-->
<script>
    //1.先使用import导入你要在该组件中使用的pagination子组件
    import Pagination from "../../components/pagination";
    export default {
    //在components中写入pagination子组件
        components: {Pagination},
        name: 'chapter',
        data: function(){
            return{
                //定义组件变量chapters为数组变量,
                //这样子的好处是,提供给当前组件使用该变量,列如可以在script里的事件里使用,也可以在页面其他标签里使用,
                //列如这里的list事件里  _this.chapters=Response;进行把返回的参数赋值给了这里的chapters: []
                chapter: {},
                chapters: [],
                course: {},
            }
        },
        //mounted表示添加钩子函数,钩子函数一般是在页面渲染之后执行,在methods之前执行,会自动执行钩子函数里的方法
        mounted: function() {
            //列如页面渲染完之后会自动执行list方法
            let _this = this;
            _this.$refs.pagination.size = 5;

            _this.list(1);
            // sidebar激活样式方法一
           // this.$parent.activeSidebar("business-course-sidebar");
        },
        //添加vue事件(也就是js方法逻辑),这里的事件是list
        methods: {
            /**
             * 点击【新增】----打开这个<div id="form-modal" class="modal fade" tabindex="-1" role="dialog">表单
             */
            add() {
                let _this = this;
                _this.chapter = {};
                $("#form-modal").modal("show");
            },
            //list表示一个事件方法
            list(page) {
                //定义一个成员变量_this,表示可以引用当前对象的关键词
                let _this=this;
                //$ajax表示使用axios.因为在main.js定义了axios全局变量为$ajxs
                //then(Response)里的Response为请求后台返回的数据
                //get为请求后台方法地址
                _this.$ajax.post('http://localhost:9000/business/admin/chapter/postlistPageDto',{
                    page: page,
                    size: _this.$refs.pagination.size
                }).then((Response)=>{
                    //alert("走到这个方法里的这段代码了了");
                    console.log("查询大章节列表结果:",Response);
                    //赋值给上面的 chapters: []
                    //注意为什么要点data在点list呢,因为返回来的数据是被list包括起来然后list又被data包括请来的,所以要想使用返回来的数据先点data.list
                    _this.chapters=Response.data.list;
                    //alert("2222222走到这个方法里的这段代码了了");
                    _this.$refs.pagination.render(page, Response.data.total);
                }).catch(error => { //当请求后台代码出现错误的时候会进入到这个方法里
                    console.log("请求出现错误:",error);
                    return error
                })
            },

            /**
             * 点击【保存】
             */
            save(page) {
                let _this = this;


                _this.chapter.courseId = _this.course.id;

                //process.env.VUE_APP_SERVER在  ----  F:\Workspace\course\admin\.env.prod
                _this.$ajax.post( 'http://localhost:9000/business/admin/chapter/save', _this.chapter).then((response)=>{

                    let resp = response.data;
                    console.log("resp.success:"+resp.success);
                    console.log("resp.data.success:"+resp);
                    console.log("死神:"+response.data);
                    console.log("死神:"+response.data.success);

                    if (resp.success) {
                        $("#form-modal").modal("hide");
                        _this.list(1);
                        alert("保存成功！");
                    } else {
                        alert("保存失败！");
                    }
                })
            },

            /**
             * 点击【删除】
             */
            del(id) {
                let _this = this;
                Confirm.show("删除大章后不可恢复，确认删除？", function () {
                    Loading.show();
                    _this.$ajax.delete(process.env.VUE_APP_SERVER + '/business/admin/chapter/delete/' + id).then((response)=>{
                        Loading.hide();
                        let resp = response.data;
                        if (resp.success) {
                            _this.list(1);
                            Toast.success("删除成功！");
                        }
                    })
                });
            },

            /**
             * 点击【小节】
             */
            toSection(chapter) {
                let _this = this;
                SessionStorage.set(SESSION_KEY_CHAPTER, chapter);
                _this.$router.push("/business/section");
            }
        }
    }
</script>

<style>

</style>
