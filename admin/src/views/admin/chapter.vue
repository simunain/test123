<template>

    <!-- PAGE CONTENT BEGINS 出现这个东西就是页面内容了-->
    <div class="row">
        <div class="col-xs-12">
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
                    <td>{{cha.id}}}</td> <!--把遍历得到的值赋值到这里-->
                    <td>{{cha.name}}}</td>
                    <td>{{cha.courseId}}}</td>

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
        </div><!-- /.span -->
    </div><!-- /.row -->
</template>

<!--添加login的script-->
<!--注意
再说上面的template标签中是不允许有script标签的,script标签要写在template标签下面-->
<script>

    export default {
        name: 'chapter',
        data: function(){
            return{
                //定义组件变量chapters为数组变量,
                //这样子的好处是,提供给当前组件使用该变量,列如可以在script里的事件里使用,也可以在页面其他标签里使用,
                //列如这里的list事件里  _this.chapters=Response;进行把返回的参数赋值给了这里的chapters: []
                chapters: []
            }
        },
        //mounted表示添加钩子函数,钩子函数一般是在页面渲染之后执行,在methods之前执行,会自动执行钩子函数里的方法
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

<style>

</style>
