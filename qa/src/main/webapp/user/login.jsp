<%--
  Created by IntelliJ IDEA.
  User: wy
  Date: 2022/11/19
  Time: 14:35
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
    <title>登录</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1" name="viewport">
    <meta content="fly,layui,前端社区" name="keywords">
    <meta content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力" name="description">
    <link href="static/res/layui/css/layui.css" rel="stylesheet">
    <link href="static/res/css/global.css" rel="stylesheet">
    <script src="static/res/layui/layui.js"></script>
    <script src="static/jquery/jquery-1.8.3.js"></script>
    <script src="static/jquery/jquery-form.js"></script>
</head>
<body>

<div class="header">
    <div class="main">
        <a class="logo" href="post/index.jsp" title="Fly">Fly社区</a>
        <div class="nav">
            <a class="nav-this" href="post/index.jsp">
                <i class="iconfont icon-wenda"></i>问答
            </a>
        </div>

        <div class="nav-user">
            <!-- 登入后的状态 -->

            <a class="avatar" href="user/home.jsp">
                <img alt="" src="static/res/images/avatar/11.jpg">
                <cite>贤心</cite>
                <i>VIP</i>
            </a>
            <div class="nav">
                <a href="user/set.jsp">
                    <i class="iconfont icon-shezhi"></i>
                    设置
                </a>
                <a href="user/login.jsp">
                    <i class="iconfont icon-tuichu" style="top: 0; font-size: 22px;"></i>
                    退了
                </a>
            </div>

        </div>
    </div>
</div>

<div class="main layui-clear">

    <div class="fly-panel fly-panel-user" pad20>
        <div class="layui-tab layui-tab-brief">
            <ul class="layui-tab-title">
                <li class="layui-this">登入</li>
                <li><a href="user/reg.jsp">注册</a></li>
            </ul>
            <div class="layui-form layui-tab-content" id="LAY_ucm" style="padding: 20px 0;">
                <div class="layui-tab-item layui-show">
                    <div class="layui-form layui-form-pane">
                        <form action="user/login" method="post" id="loginForm">
                            <div class="layui-form-item">
                                <label class="layui-form-label" for="L_email">邮箱</label>
                                <div class="layui-input-inline">
                                    <input autocomplete="off" class="layui-input" id="L_email" lay-verify="required"
                                           name="email" required type="text">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label" for="L_pass">密码</label>
                                <div class="layui-input-inline">
                                    <input autocomplete="off" class="layui-input" id="L_pass" lay-verify="required"
                                           name="pwd" required type="password">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label" for="L_vercode">人类验证</label>
                                <div class="layui-input-inline">
                                    <input autocomplete="off" class="layui-input" id="L_vercode" lay-verify="required"
                                           name="answer" placeholder="请回答后面的问题" required type="text">
                                </div>
                                <div class="layui-form-mid">
                                    <span style="color: #c00;" id="question"></span>
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label>
                                    <input class="layui-btn" id="loginBtn" value="立即登录">
                                </label>
                            </div>

                        </form>
                    </div>
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

<script type="text/javascript">
    $("#question").ready(function () {
        $.ajax({
            type: "GET",
            url: "user/question",
            dataType: "text",
            success: function (code) {
                $("#question").text(code);
            }
        });
    });

    $("#loginBtn").click(function () {
        $("#loginForm").ajaxSubmit({
            dataType: "text",
            success: function (responseText) {
                if (responseText === "success") {
                    location.href = "user/home.jsp";
                } else {
                    alert("验证码错误");
                    $.ajax({
                        type: "GET",
                        url: "user/question",
                        dataType: "text",
                        success: function (question) {
                            $("#question").text(question);
                        }
                    });
                }
            }
        });
    });
</script>
</body>
</html>
