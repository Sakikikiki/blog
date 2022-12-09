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
    <title>充值界面/会员</title>
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
                <li data-type="mine-jie" lay-id="index">我的会员</li>
                <li class="layui-this" data-type="collect" data-url="/collect/find/" lay-id="collect">
                    充值中心
                </li>
            </ul>
            <div class="layui-tab-content" style="padding: 20px 0;">
                <div class="layui-form layui-form-pane layui-tab-item ">
                    <form action="">
                        <div class="layui-form-item">
                            <h2>续费会员</h2>
                            <p>会员开始时间:2017-05-01</p>
                            <p>会员结束时间:2017-06-01</p>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">充值时长</label>
                            <div class="layui-input-block">
                                <input checked="checked" title="一个月(30天)" type="radio"/>
                                <span style="color:#ccc">￥18/
                                    <i class="iconfont icon-zuichun" title="飞吻"></i>249
                                </span>
                                <span style="color:red">￥15/
                                    <i class="iconfont icon-zuichun" title="飞吻"></i>180
                                </span>
                                <input title="三个月(90天)" type="radio"/>
                                <span style="color:#ccc">￥50/
                                    <i class="iconfont icon-zuichun" title="飞吻"></i>680
                                </span>
                                <span style="color:red">￥42/
                                    <i class="iconfont icon-zuichun" title="飞吻"></i>500
                                </span><br/>
                                <input title="六个月(180天)" type="radio"/>
                                <span style="color:#ccc">￥100/
                                    <i class="iconfont icon-zuichun" title="飞吻"></i>1200
                                </span>
                                <span style="color:red">￥80/
                                    <i class="iconfont icon-zuichun" title="飞吻"></i>900
                                </span>
                                <input title="年费会员(365天)" type="radio"/>
                                <span style="color:#ccc">￥188/
                                    <i class="iconfont icon-zuichun" title="飞吻"></i>2000
                                </span>
                                <span style="color:red">￥150/
                                    <i class="iconfont icon-zuichun" title="飞吻"></i>1666
                                </span>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">购买方式</label>
                            <div class="layui-input-block">
                                <input checked="checked" title="银联购买" type="radio"/>
                                <input title="飞吻购买" type="radio"/>
                            </div>
                        </div>
                        <input class="layui-btn" type="submit" value="确认购买"/>

                        <div class="layui-form-item">
                            <h2>充值会员</h2>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">充值时长</label>
                            <div class="layui-input-block">
                                <input checked="checked" title="一个月(30天)" type="radio"/>￥18/
                                <i class="iconfont icon-zuichun" title="飞吻"></i>249
                                <input title="三个月(90天)" type="radio"/>￥50/
                                <i class="iconfont icon-zuichun" title="飞吻"></i>680<br/>
                                <input title="六个月(180天)" type="radio"/>￥100/
                                <i class="iconfont icon-zuichun" title="飞吻"></i>1200
                                <input title="年费会员(365天)" type="radio"/>￥188/
                                <i class="iconfont icon-zuichun" title="飞吻"></i>2000
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">购买方式</label>
                            <div class="layui-input-block">
                                <input checked="checked" title="银联购买" type="radio"/>
                                <input title="飞吻购买" type="radio"/>
                            </div>
                        </div>
                        <input class="layui-btn" type="submit" value="确认购买"/>

                    </form>
                    <div class="home-dacontent">
                        会员充值规则: 普通会员充值会员按默认价格支付，如账户是会员，对账户会员进行续费充值，续费充值时按照会员价格进行优惠，选择银行卡充值会直接对账户绑定的银行卡进行扣费。
                    </div>
                </div>
                <div class="layui-tab-item layui-show">
                    <div class="layui-form-item">
                        <input id="userId" type="hidden" value="${sessionScope.user.userId}"/>
                        <label class="layui-form-label">银行卡号</label>
                        <div class="layui-input-inline">
                            <label>
                                <input autocomplete="off" class="layui-input" lay-verify="title" placeholder="请输入银行卡号"
                                       type="text"/>
                            </label>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">银行卡密码</label>
                        <div class="layui-input-inline">
                            <label>
                                <input autocomplete="off" class="layui-input" lay-verify="title" placeholder="请输入银行卡密码"
                                       type="password"/>
                            </label>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">充值金额</label>
                        <div class="layui-input-inline">
                            <label>
                                <input autocomplete="off" class="layui-input" lay-verify="title"
                                       placeholder="￥(RMB:飞吻=1:10)" type="text"/>
                            </label>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <a class="layui-btn">立即充值</a>
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
</body>
</html>
