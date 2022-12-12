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
    <title>消息详情</title>
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

            <a class="avatar" href="user/home">
                <img src="static/res/images/avatar/11.jpg" alt="">
                <cite>${sessionScope.user.username}</cite>
                <i>${sessionScope.role.roleName}</i>
            </a>
            <div class="nav">
                <a href="user/set">
                    <i class="iconfont icon-shezhi"></i>设置
                </a>
                <a href="user/exit">
                    <i class="iconfont icon-tuichu" style="top: 0; font-size: 22px;"></i>退了
                </a>
            </div>
        </div>
    </div>
</div>


<div class="main fly-user-main layui-clear">
    <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="user">
        <li class="layui-nav-item">
            <a href="user/home">
                <i class="layui-icon">&#xe609;</i>我的主页
            </a>
        </li>
        <li class="layui-nav-item ">
            <a href="user/index">
                <i class="layui-icon">&#xe612;</i>用户中心
            </a>
        </li>
        <li class="layui-nav-item layui-this">
            <a href="user/set">
                <i class="layui-icon">&#xe620;</i>基本设置
            </a>
        </li>
        <li class="layui-nav-item">
            <a href="user/message">
                <i class="layui-icon">&#xe611;</i>我的消息
            </a>
        </li>
        <li class="layui-nav-item ">
            <a href="user/vip">
                <i class="layui-icon">&#xe61a;</i>账户充值/会员
            </a>
        </li>
        <li class="layui-nav-item">
            <a href="user/report">
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
            <input id="userId" type="hidden" value="${sessionScope.user.userId}"/>

            <div class="layui-form-item">
                <label class="layui-form-label">消息名称</label>
                <div class="layui-input-inline">
                    消息名称
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">消息内容</label>
                <div class="layui-input-inline">
                    消息内容
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">消息时间</label>
                <div class="layui-input-inline">
                    2017-05-01
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">消息状态</label>
                <div class="layui-input-inline">
                    已阅读
                </div>
            </div>
            <a class="layui-btn layui-btn-small layui-btn-danger fly-delete"
               href="">删除</a>
            <a class="layui-btn layui-btn-small " href="">返回上一页</a>

        </div>
    </div>

</div>
<div class="footer">
    <p><a href="#">网博社区</a> 2017 &copy; <a href="#">njwangbo.com</a></p>
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
