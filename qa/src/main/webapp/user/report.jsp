<%--
  Created by IntelliJ IDEA.
  User: wy
  Date: 2022/11/19
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <title>举报审核</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1" name="viewport">
    <meta content="fly,layui,前端社区" name="keywords">
    <meta content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力" name="description">
    <link href="static/res/layui/css/layui.css" rel="stylesheet">
    <link href="static/res/css/global.css" rel="stylesheet">
    <script src="static/res/layui/layui.js"></script>
</head>
<body>
<div class="header">
    <div class="main">
        <a class="logo" href="post/index.jsp" title="网博">网博社区</a>
        <div class="nav">
            <a class="nav-this" href="post/index.jsp">
                <i class="iconfont icon-wenda"></i>问答
            </a>
        </div>

        <div class="nav-user">
            <!-- 登入后的状态 -->

            <a class="avatar" href="user/home.jsp">
                <img src="static/res/images/avatar/11.jpg" alt="">
                <cite>贤心</cite>
                <i>VIP</i>
            </a>
            <div class="nav">
                <a href="user/set.jsp"><i class="iconfont icon-shezhi"></i>设置</a>
                <a href="user/login.jsp"><i class="iconfont icon-tuichu" style="top: 0; font-size: 22px;"></i>退了</a>
            </div>
        </div>
    </div>
</div>


<div class="main fly-user-main layui-clear">
    <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="user">
        <li class="layui-nav-item">
            <a href="user/home.jsp">
                <i class="layui-icon">&#xe609;</i>我的主页
            </a>
        </li>
        <li class="layui-nav-item ">
            <a href="user/index.jsp">
                <i class="layui-icon">&#xe612;</i>用户中心
            </a>
        </li>
        <li class="layui-nav-item ">
            <a href="user/set.jsp">
                <i class="layui-icon">&#xe620;</i>基本设置
            </a>
        </li>
        <li class="layui-nav-item">
            <a href="user/message.jsp">
                <i class="layui-icon">&#xe611;</i>我的消息
            </a>
        </li>
        <li class="layui-nav-item  layui-this">
            <a href="user/vip.jsp">
                <i class="layui-icon">&#xe61a;</i>账户充值/会员
            </a>
        </li>
        <li class="layui-nav-item">
            <a href="user/report.jsp">
                <i class="layui-icon">&#xe61a;</i>审核举报
            </a>
        </li>
    </ul>

    <div class="site-tree-mobile layui-hide">
        <i class="layui-icon">&#xe602;</i>
    </div>
    <div class="site-mobile-shade"></div>

    <div class="fly-panel fly-panel-user" pad20>
        <div class="layui-tab layui-tab-brief" lay-filter="user">
            <ul class="layui-tab-title" id="LAY_mine">
                <li class="layui-this" data-type="mine-jie" lay-id="index">
                    未审核举报(1)
                </li>
                <li data-type="collect" data-url="/collect/find/" lay-id="collect">
                    已审核举报(1)
                </li>
            </ul>
            <div class="layui-tab-content" style="padding: 20px 0;">
                <div class="layui-form layui-form-pane layui-tab-item  layui-show">
                    <ul class="mine-view jie-row">
                        <li>
                            <a class="jie-title" href="user/reportDetail.jsp">
                            举报这个帖子
                            </a>
                            <i>2017-05-01</i>
                            <em>举报人: 压缩
                            </em>
                        </li>
                    </ul>
                </div>
                <div class="layui-tab-item ">
                    <ul class="mine-view jie-row">
                        <li>
                            <a class="jie-title" href="user/reportOver.jsp">
                            举报这个帖子
                            </a>
                            <i>2017-05-01</i>
                            <em>举报人: 压缩
                            </em>
                        </li>
                        <!--  <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><span>没有已审核的举报</span></div>-->
                    </ul>

                </div>
            </div>
        </div>
    </div>
</div>
<div class="footer">
    <p><a href="#">网博社区</a> 2017 &copy; <a href="#/">njwangbo.com</a></p>
    <p>
        <a href="#" target="_blank">产品授权</a>
        <a href="#" target="_blank">网博社区</a>
        <a href="#" target="_blank">微信公众号</a>
    </p>
</div>

<script>
    layui.use('element', function () {
        var element = layui.element();
    });
</script>
<script>

    layui.cache.page = '';
    layui.cache.user = {
        username: '游客'
        , uid: -1
        , avatar: 'static/res/images/avatar/00.jpg'
        , experience: 83
        , sex: '男'
    };
    layui.config({
        version: "2.0.0"
        , base: 'static/res/mods/'
    }).extend({
        fly: 'index'
    }).use('fly');
</script>
</body>
</html>
