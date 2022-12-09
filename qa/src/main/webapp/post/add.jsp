<%--
  Created by IntelliJ IDEA.
  User: wy
  Date: 2022/11/19
  Time: 13:59
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
    <title>发表问题</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="keywords" content="fly,layui,前端社区">
    <meta name="description" content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力">
    <link rel="stylesheet" href="static/res/layui/css/layui.css">
    <link rel="stylesheet" href="static/res/css/global.css">
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
                <a href="user/set.jsp">
                    <i class="iconfont icon-shezhi"></i>设置
                </a>
                <a href="user/login.jsp">
                    <i class="iconfont icon-tuichu" style="top: 0; font-size: 22px;"></i>退了
                </a>
            </div>
        </div>
    </div>
</div>

<div class="main layui-clear">
    <div class="fly-panel" pad20>
        <h2 class="page-title">发表问题</h2>

        <!-- <div class="fly-none">并无权限</div> -->

        <div class="layui-form layui-form-pane">
            <form action=" ">
                <div class="layui-form-item">
                    <label for="L_title" class="layui-form-label">标题</label>
                    <div class="layui-input-block">
                        <input type="text" id="L_title" name="title" required lay-verify="required" autocomplete="off"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <div class="layui-input-block">
                        <div class="editor">
                            <label for="content"></label>
                            <textarea id="content" name="content"
                                      style="width:1040px;height:450px;visibility:hidden;">
                            </textarea>
                        </div>
                    </div>
                    <label class="layui-form-label" style="top: -2px;">描述</label>
                </div>
                <div class="layui-form-item">
                    <div class="layui-inline">
                        <label class="layui-form-label">所在类别</label>
                        <div class="layui-input-block">
                            <label>
                                <select lay-verify="required" name="class">
                                    <option></option>
                                    <option>layui框架综合</option>
                                    <option>layui.mobile模块</option>
                                    <option>layer弹出层</option>
                                </select>
                            </label>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">悬赏飞吻</label>
                        <div class="layui-input-block">
                            <label>
                                <select name="experience">
                                    <option selected>5</option>
                                    <option>20</option>
                                    <option>50</option>
                                    <option>100</option>
                                </select>
                            </label>
                        </div>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_vercode" class="layui-form-label">人类验证</label>
                    <div class="layui-input-inline">
                        <input type="text" id="L_vercode" name="vercode" required lay-verify="required"
                               placeholder="请回答后面的问题" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid">
                        <span style="color: #c00;">1+1=?</span>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="publish"></label>
                    <input class="layui-btn" value="立即发布" id="publish"/>
                </div>
            </form>
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
<script type="text/javascript" charset="utf-8" src="static/jquery/jquery-1.8.3.js"></script>
<script type="text/javascript" charset="utf-8" src="static/kindeditor/kindeditor.js"></script>
<script type="text/javascript">

    KE.show({
        id: 'content',
        resizeMode: 1,
        cssPath: './index.css',

        items: [
            'fontname', 'fontsize', 'textcolor', 'bgcolor', 'bold', 'italic', 'underline',
            'removeformat', 'justifyleft', 'justifycenter', 'justifyright', 'insertorderedlist',
            'insertunorderedlist', 'emoticons', 'image', 'link']
    });

    $("#publish").click(function () {
        alert(KE.util.getData("content"));

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
