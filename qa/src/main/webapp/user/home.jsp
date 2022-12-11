<%--
  Created by IntelliJ IDEA.
  User: wy
  Date: 2022/11/19
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <title>用户主页</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1" name="viewport">
    <meta content="fly,layui,前端社区" name="keywords">
    <meta content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力" name="description">
    <link href="static/res/layui/css/layui.css" rel="stylesheet">
    <link href="static/res/css/global.css" rel="stylesheet">
    <script src="static/res/layui/layui.js"></script>
</head>
<body style="margin-top: 65px;">

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
                <img alt="" src="static/res/images/avatar/11.jpg">
                <cite>${sessionScope.user.username}</cite>
                <i>${sessionScope.role.roleName}</i>
            </a>
            <div class="nav">
                <a href="user/set"><i class="iconfont icon-shezhi"></i>设置</a>
                <a href="user/login.jsp"><i class="iconfont icon-tuichu" style="top: 0; font-size: 22px;"></i>退了</a>
            </div>
        </div>
    </div>
</div>

<div class="fly-home" style="background-image: url();">
    <img alt="{{info.username}}" src="static/res/images/avatar/11.jpg">
    <h1>
        ${sessionScope.user.username}
        <i class="iconfont icon-nan"></i>
        <!-- <i class="iconfont icon-nv"></i> -->

    </h1>
    <p class="fly-home-info">
        <i class="iconfont icon-zuichun" title="飞吻"></i><span style="color: #FF7200;">${sessionScope.user.money}飞吻</span>
        <i class="iconfont icon-shijian"></i><span>${sessionScope.user.createtime} 加入</span>
        <i class="iconfont icon-chengshi"></i><span>来自${sessionScope.user.city}</span>
    </p>
    <p class="fly-home-sign">${sessionScope.user.motto}</p>
</div>

<div class="main fly-home-main">
    <div class="layui-inline fly-home-jie">
        <div class="fly-panel">
            <h3 class="fly-panel-title">${sessionScope.user.username} 最近的提问</h3>
            <ul class="jie-row">
                <c:forEach items="">
                    <li>
                        <a class="jie-title" href="post/detail.jsp">使用 layui 秒搭后台大布局（基本结构）</a>
                        <i>1天前</i>
                        <em>1136阅/27答</em>
                    </li>
                </c:forEach>

                <li>
                    <a class="jie-title" href="post/detail.jsp">使用 layui 秒搭后台大布局（基本结构）</a>
                    <i>1天前</i>
                    <em>1136阅/27答</em>
                </li>
                <li>
                    <a class="jie-title" href="post/detail.jsp">使用 layui 秒搭后台大布局（基本结构）</a>
                    <i>1天前</i>
                    <em>1136阅/27答</em>
                </li>
                <li>
                    <a class="jie-title" href="post/detail.jsp">使用 layui 秒搭后台大布局（基本结构）</a>
                    <i>1天前</i>
                    <em>1136阅/27答</em>
                </li>
                <li>
                    <a class="jie-title" href="post/detail.jsp">使用 layui 秒搭后台大布局（基本结构）</a>
                    <i>1天前</i>
                    <em>1136阅/27答</em>
                </li>
                <li>
                    <a class="jie-title" href="post/detail.jsp">使用 layui 秒搭后台大布局（基本结构）</a>
                    <i>1天前</i>
                    <em>1136阅/27答</em>
                </li>
                <li>
                    <a class="jie-title" href="post/detail.jsp">使用 layui 秒搭后台大布局（基本结构）</a>
                    <i>1天前</i>
                    <em>1136阅/27答</em>
                </li>
            </ul>
            <!-- <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><i style="font-size:14px;">没有发表任何求解</i></div> -->
        </div>
    </div>

    <div class="layui-inline fly-home-da">
        <div class="fly-panel">
            <h3 class="fly-panel-title">${sessionScope.user.username} 最近的回答</h3>
            <ul class="home-jieda">
                <li>
                    <p>
                        <span>1分钟前</span>
                        在<a href="" target="_blank">tips能同时渲染多个吗?</a>中回答：
                    </p>
                    <div class="home-dacontent">
                        尝试给layer.photos加上这个属性试试：
                        <pre>
                            full: true
                        </pre>
                        文档没有提及
                    </div>
                </li>
                <li>
                    <p>
                        <span>5分钟前</span>
                        在<a href="" target="_blank">在Fly社区用的是什么系统啊?</a>中回答：
                    </p>
                    <div class="home-dacontent">
                        Fly社区采用的是NodeJS。分享出来的只是前端模版
                    </div>
                </li>
            </ul>
            <!-- <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><span>没有回答任何问题</span></div> -->
        </div>
    </div>

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
<div class="footer">
    <p><a href="#">网博社区</a> 2017 &copy; <a href="#/">njwangbo.com</a></p>
    <p>
        <a href="#" target="_blank">产品授权</a>
        <a href="#" target="_blank">网博社区</a>
        <a href="#" target="_blank">微信公众号</a>
    </p>
</div>

</body>
</html>
