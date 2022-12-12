<%--
  Created by IntelliJ IDEA.
  User: wy
  Date: 2022/11/19
  Time: 13:52
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
    <title>问答系统首页</title>
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
        <a class="logo" href="post/index" title="网博">网博社区</a>
        <div class="nav">
            <a class="nav-this" href="post/index">
                <i class="iconfont icon-wenda"></i>问答
            </a>
        </div>

        <div class="nav-user">
            <!-- 登入后的状态 -->

            <a class="avatar" href="user/index">
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
<div class="main layui-clear">
    <div class="wrap">
        <div class="content" style="margin-right:0">
            <div class="fly-tab">
        <span>
          <a href="" class="tab-this">全部</a>
          <a href="">未结帖</a>
              <a href="">已采纳</a>
          <a href="">置顶帖</a>
          <a href="user/index">我的帖</a>
        </span>
                <form action="" class="fly-search">
                    <i class="iconfont icon-sousuo"></i>
                    <label>
                        <input class="layui-input" autocomplete="off" placeholder="搜索内容，回车跳转" type="text" name="q">
                    </label>
                </form>
                <a href="post/add" class="layui-btn jie-add">发布问题</a>
            </div>

            <ul class="fly-list">
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/0.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail">基于Layui的轻量级问答社区页面模版</a>
                        <span class="fly-tip-stick">置顶</span>
                    </h2>
                    <p>
                        <span>
                            <a href="user/home">贤心</a>
                        </span>
                        <span>刚刚</span>
                        <span>layui框架综合</span>
                        <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 317
              <i class="iconfont" title="人气">&#xe60b;</i> 6830
            </span>
                    </p>
                </li>
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了</a>
                        <span class="fly-tip-stick">置顶</span>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i>502
              <i class="iconfont" title="人气">&#xe60b;</i>81689
            </span>
                    </p>
                </li>

                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了 </a>
                        <span class="fly-tip-stick">置顶</span>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 502
              <i class="iconfont" title="人气">&#xe60b;</i> 81689
            </span>
                    </p>
                </li>
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了 </a>
                        <span class="fly-tip-stick">置顶</span>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint">
              <i class="iconfont" title="回答">&#xe60c;</i> 502
              <i class="iconfont" title="人气">&#xe60b;</i> 81689
            </span>
                    </p>
                </li>
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了 </a>
                        <span class="fly-tip-stick">置顶</span>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint">
                            <i class="iconfont" title="回答">&#xe60c;</i> 502
                            <i class="iconfont" title="人气">&#xe60b;</i> 81689
                        </span>
                    </p>
                </li>
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了 </a>
                        <span class="fly-tip-stick">置顶</span>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint">
                            <i class="iconfont" title="回答">&#xe60c;</i> 502
                            <i class="iconfont" title="人气">&#xe60b;</i> 81689
                        </span>
                    </p>
                </li>
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了 </a>
                        <span class="fly-tip-stick">置顶</span>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint">
              <i class="iconfont" title="回答">&#xe60c;</i> 502
              <i class="iconfont" title="人气">&#xe60b;</i> 81689
            </span>
                    </p>
                </li>
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了 </a>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 502
              <i class="iconfont" title="人气">&#xe60b;</i> 81689
            </span>
                    </p>
                </li>
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了 </a>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint">
              <i class="iconfont" title="回答">&#xe60c;</i> 502
              <i class="iconfont" title="人气">&#xe60b;</i> 81689
            </span>
                    </p>
                </li>
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了 </a>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint">
              <i class="iconfont" title="回答">&#xe60c;</i> 502
              <i class="iconfont" title="人气">&#xe60b;</i> 81689
            </span>
                    </p>
                </li>
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了 </a>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint">
              <i class="iconfont" title="回答">&#xe60c;</i> 502
              <i class="iconfont" title="人气">&#xe60b;</i> 81689
            </span>
                    </p>
                </li>
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了 </a>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint">
              <i class="iconfont" title="回答">&#xe60c;</i> 502
              <i class="iconfont" title="人气">&#xe60b;</i> 81689
            </span>
                    </p>
                </li>
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了 </a>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint">
              <i class="iconfont" title="回答">&#xe60c;</i> 502
              <i class="iconfont" title="人气">&#xe60b;</i> 81689
            </span>
                    </p>
                </li>
                <li class="fly-list-li">
                    <a href="user/home" class="fly-list-avatar">
                        <img src="static/res/images/avatar/00.jpg" alt="">
                    </a>
                    <h2 class="fly-tip">
                        <a href="post/detail"> Layui 首个版本千呼万唤，终于滚出来了 </a>
                    </h2>
                    <p>
                        <span><a href="user/home">纸飞机</a></span>
                        <span>30分钟前</span>
                        <span>技术闲谈</span>
                        <span class="fly-list-hint">
              <i class="iconfont" title="回答">&#xe60c;</i> 502
              <i class="iconfont" title="人气">&#xe60b;</i> 81689
            </span>
                    </p>
                </li>
            </ul>

            <!-- <div class="fly-none">并无相关数据</div> -->

            <div style="text-align: center">
                <div class="laypage-main">
                    <span class="laypage-curr">1</span>
                    <a href="">2</a>
                    <a href="">3</a>
                    <a href="">4</a>
                    <a href="">5</a>
                    <span>…</span>
                    <a href="" class="laypage-last" title="尾页">尾页</a>
                    <a href="" class="laypage-next">下一页</a>
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
    // window.onload = function () {
    //     layer.open({
    //         title: '二哥二哥'
    //         , content: '撒大的'
    //     });
    // }
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
