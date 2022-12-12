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
    <title>账户设置</title>
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
        <li class="layui-nav-item">
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
        <li class="layui-nav-item  ">
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
            <ul class="layui-tab-title" id="LAY_mine">
                <li class="layui-this" lay-id="info">我的资料</li>
                <li lay-id="avatar">头像</li>
                <li lay-id="pass">密码</li>
            </ul>
            <div class="layui-tab-content" style="padding: 20px 0;">
                <div class="layui-form layui-form-pane layui-tab-item layui-show">

                    <form id="updateForm" action="user/update" method="post">
                        <div class="layui-form-item">
                            <label class="layui-form-label" for="L_email">邮箱</label>
                            <div class="layui-input-inline">
                                <input class="layui-input" id="L_email" lay-verify="email" required type="text"
                                       value="${sessionScope.user.email}" readonly>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label" for="L_username">昵称</label>
                            <div class="layui-input-inline">
                                <input class="layui-input" id="L_username" lay-verify="required" required
                                       type="text" value="${sessionScope.user.username}">
                            </div>
                            <div class="layui-inline">
                                <div class="layui-input-inline">
                                    <input checked name="sex" title="男" type="radio" value="1">
                                    <input name="sex" title="女" type="radio" value="2">
                                </div>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label" for="L_bankcard">银行卡</label>
                            <div class="layui-input-inline">
                                <input class="layui-input" id="L_bankcard" type="text"
                                       value="${sessionScope.bankcard.cardId}" readonly>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label" for="L_city">城市</label>
                            <div class="layui-input-inline">
                                <input class="layui-input" id="L_city" type="text"
                                       value="${sessionScope.user.city}">
                            </div>
                        </div>
                        <div class="layui-form-item layui-form-text">
                            <label class="layui-form-label" for="L_sign">签名</label>
                            <div class="layui-input-block">
                                    <textarea autocomplete="off" class="layui-textarea" id="L_sign"
                                              placeholder="随便写些什么刷下存在感"
                                              style="height: 80px;">
                                        ${sessionScope.user.motto}
                                    </textarea>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label>
                                <input id="updateBtn" class="layui-btn" value="确认修改"/>
                            </label>
                        </div>
                    </form>
                </div>

                <div class="layui-form layui-form-pane layui-tab-item">
                    <div class="layui-form-item">
                        <div class="avatar-add">
                            <p>建议尺寸168*168，支持jpg、png、gif，最大不能超过30KB</p>
                            <div class="upload-img">
                                <input id="LAY-file" lay-title="上传头像" name="file" type="file">
                            </div>
                            <img src="static/res/images/avatar/3.jpg" alt="">
                            <span class="loading"></span>
                        </div>
                    </div>
                </div>

                <div class="layui-form layui-form-pane layui-tab-item">
                    <form action="/user/repass" method="post">
                        <div class="layui-form-item">
                            <label class="layui-form-label" for="L_nowpass">当前密码</label>
                            <div class="layui-input-inline">
                                <label>
                                    <input autocomplete="off" class="layui-input" id="L_nowpass" lay-verify="required"
                                           required
                                           type="password">
                                </label>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label" for="L_pass">新密码</label>
                            <div class="layui-input-inline">
                                <label>
                                    <input autocomplete="off" class="layui-input" id="L_pass" lay-verify="required"
                                           required
                                           type="password">
                                </label>
                            </div>
                            <div class="layui-form-mid layui-word-aux">6到16个字符</div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label" for="L_repass">确认密码</label>
                            <div class="layui-input-inline">
                                <label>
                                    <input autocomplete="off" class="layui-input" id="L_repass" lay-verify="required"
                                           required
                                           type="password">
                                </label>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label>
                                <input class="layui-btn" value="确认修改">
                            </label>
                        </div>
                    </form>
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
    $("#updateBtn").click(function () {
        $("#updateForm").ajaxSubmit({
            dataType: "text",
            success: function () {

            }
        });
    });
</script>

</body>
</html>
