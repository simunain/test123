<!DOCTYPE html>
<html lang="zh-CN">
<head>


    <!-- Bootstrap3.3.5 CSS -->
    <link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
        <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        .panel-group{max-height:770px;overflow: auto;}
        .leftMenu{margin:10px;margin-top:5px;}
        .leftMenu .panel-heading{font-size:14px;padding-left:20px;height:36px;line-height:36px;color:white;position:relative;cursor:pointer;}/*转成手形图标*/
        .leftMenu .panel-heading span{position:absolute;right:10px;top:12px;}
        .leftMenu .menu-item-left{padding: 2px; background: transparent; border:1px solid transparent;border-radius: 6px;}
        .leftMenu .menu-item-left:hover{background:#C4E3F3;border:1px solid #1E90FF;}

        .wrap{width: 300px;list-style: none;}
        .wrap li{height: 50px;margin:1px;}
        .active{font-weight:bold; background-color: pink; color:#fff;}
    </style>


</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">Brand</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="#">Link</a>
                        </li>
                        <li>
                            <a href="#">Link</a>
                        </li>

                        <li class="dropdown">

                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">

                                Dropdown
                                <strong class="caret"></strong>

                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">One more separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" />
                        </div> <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#" style="height: 60px">Link</a>
                        </li>





                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="height: 60px">

                                <img src="https://www.runoob.com/wp-content/uploads/2014/07/slide3.png"  width="30" height="40" alt="Jason's Photo" class="img-circle">

                                用户名称<strong class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">退出登入</a>
                                </li>
                                <li>
                                    <a href="#">修改密码</a>
                                </li>
                                <li>
                                    <a href="#">用户详情</a>
                                </li>

                            </ul>
                        </li>
                    </ul>
                </div>

            </nav>
            <div class="jumbotron">
                <h1>
                    Hello, world!
                </h1>
                <p>
                    This is a template for a simple marketing or informational website. It includes a large callout called the hero unit and three supporting pieces of content. Use it as a starting point to create something more unique.
                </p>
                <p>
                    <a class="btn btn-primary btn-large" href="#">Learn more</a>
                </p>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-4 column">
            <ul class="wrap">
                <li class="active" data-id="center">用户中心</li>

                <li data-id="account">账户信息</li>

                <li data-id="trade">交易记录</li>
                <li data-id="info">消息中心</li>

            </ul>

        </div>
        <div class="col-md-8 column">
            <div id="mainbody">欢迎登录！</div>
            <div id="content"></div>

            <img  src="https://www.runoob.com/wp-content/uploads/2014/07/slide3.png" class="img-responsive" alt="Cinque Terre" width="600" height="236">

            <p>
                Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
            </p>
            <p>
                <a class="btn" href="#">View details »</a>
            </p>

        </div>
    </div>
</div>

</body>

<script src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<script type="text/javascript">
    $(function(){
        $(".wrap li").click(function() {
            $(this).siblings('li').removeClass('active');  // 删除其兄弟元素的样式
            $(this).addClass('active');                    // 为点击元素添加类名
        });
    });

</script>



<script type="text/javascript">

    alert("jvvjhv");
    console.log("打印出opt_values:  ");
    $(function() {
        $(".wrap").on("click", "li", function() {
            var sId = $(this).data("id"); //获取data-id的值
            window.location.hash = sId; //设置锚点
            loadInner(sId);
        });

        function loadInner(sId) {
            var sId = window.location.hash;
            var pathn, i;
            switch(sId) {
                case "#center":
                    pathn = "user_center.html";
                    i = 0;
                    break;
                case "#account":
                    pathn = "user_account.html";
                    i = 1;
                    break;
                case "#trade":
                    pathn = "user_trade.html";
                    i = 2;
                    break;
                case "#info":
                    pathn = "user_info.html";
                    i = 3;
                    break;
                default:
                    pathn = "user_center.html";
                    i = 0;
                    break;
            }
            $("#content").load(pathn); //加载相对应的内容
            $(".wrap li").eq(i).addClass("active").siblings().removeClass("active"); //当前列表高亮
        }
        var sId = window.location.hash;
        loadInner(sId);
    });
</script>

</html>