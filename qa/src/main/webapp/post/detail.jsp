<%--
  Created by IntelliJ IDEA.
  User: wy
  Date: 2022/11/19
  Time: 13:58
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
    <title>问题详情</title>
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="keywords" content="fly,layui,前端社区">
    <meta name="description"
          content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力">
    <link rel="stylesheet" href="static/res/layui/css/layui.css">
    <link rel="stylesheet" href="static/res/css/global.css">
    <script src="static/res/layui/layui.js"></script>
    <script src="static/jquery/jquery-1.8.3.js"></script>
    <style type="text/css" rel="stylesheet">
        form {
            margin: 0;
        }

        .editor {
            margin-top: 5px;
            margin-bottom: 5px;
        }
    </style>

<body>
<div class="header">
    <div class="main">
        <a class="logo" href="post/index" title="网博">网博社区</a>
        <div class="nav">
            <a class="nav-this" href="post/index">
                <i class="iconfont icon-wenda"></i>
                问答
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

<div class="main layui-clear">
    <div class="wrap">
        <div class="content detail">
            <div class="fly-panel detail-box">
                <h1>帖子标题</h1>
                <div class="fly-tip fly-detail-hint" data-id="">
                    <span class="fly-tip-stick">置顶帖</span>
                    <span>未结贴</span>
                    <span class="fly-tip-jie">已采纳</span>
                    <span class="jie-admin">
                        <a href="">点击置顶</a>
                    </span>
                    <span class="layui-btn layui-btn-mini jie-admin">
                        <a href="">取消置顶</a>
                    </span>
                    <span class="jie-admin" type="del" style="margin-left: 20px;">
                        <a>删除该帖</a>
                    </span>
                    <span class="fly-tip-jie">已举报
                    </span>
                    <span class="fly-tip-jie">
                        <a href="#">举报</a>
                    </span>
                    <div class="fly-list-hint">
                        <i class="iconfont" title="回答">&#xe60c;</i>2
                        <i class="iconfont" title="人气">&#xe60b;</i>243
                    </div>
                </div>
                <div class="detail-about">
                    <a class="jie-user" href="user/home">
                        <img src="static/res/images/avatar/0.jpg" alt="头像">
                        <cite>压缩
                            <em>2017-05-01发布</em>
                        </cite>
                    </a>
                    <div class="detail-hits" data-id="{{rows.id}}">
                        <span style="color:#FF7200">悬赏：20飞吻</span>
                        <span class="layui-btn layui-btn-mini jie-admin">
                            <a href="#">编辑此贴</a>
                        </span>
                        <span class="layui-btn layui-btn-mini jie-admin">
                            <a href="#">已完帖，无法编辑</a>
                        </span>
                        <span class="layui-btn layui-btn-mini jie-admin" type="collect" data-type="add">
                            <a id="collectPost">收藏</a>
                        </span>
                        <span class="layui-btn layui-btn-mini jie-admin  layui-btn-danger" type="collect"
                              data-type="add">
                            <a>取消收藏</a>
                        </span>
                        <span class="layui-btn layui-btn-mini jie-admin  layui-btn-normal"
                              data-type="add">
                            <a>回复楼主</a>
                        </span>
                    </div>
                </div>
                <div class="detail-body photos" style="margin-bottom: 20px;">
                    <p>帖子内容</p>
                </div>
            </div>

            <div class="fly-panel detail-box" style="padding-top: 0;">
                <a name="comment"></a>
                <ul class="jieda photos" id="jieda">
                    <li data-id="12" class="jieda-daan">
                        <a name="item-121212121212"></a>
                        <div class="detail-about detail-about-reply">
                            <a class="jie-user" href="user/home">
                                <img src="static/res/images/avatar/0.jpg" alt="">
                                <cite>
                                    <i>纸飞机</i>
                                    <!-- <em>(楼主)</em>
              <em style="color:#5FB878">(管理员)</em> -->
                                </cite>
                            </a>
                            <div class="detail-hits">
                                <span>3分钟前</span>
                            </div>
                            <i class="iconfont icon-caina" title="最佳答案"></i>
                        </div>
                        <div class="detail-body jieda-body">
                            <p>么么哒</p>
                        </div>
                        <div class="jieda-reply">
                            <span class="jieda-zan zanok" type="zan">
                                <i class="iconfont icon-zan"></i>
                                <em>12</em>
                            </span>
                            <span type="reply">
                                <i class="iconfont icon-svgmoban53"></i>回复
                            </span>
                            <!-- <div class="jieda-admin">
            <span type="del">删除</span>
            <span class="jieda-accept" type="accept">采纳</span>
          </div> -->
                        </div>
                    </li>

                    <li data-id="13">
                        <a name="item-121212121212"></a>
                        <div class="detail-about detail-about-reply">
                            <a class="jie-user" href="user/home">
                                <img src="static/res/images/avatar/0.jpg" alt="">
                                <cite>
                                    <i>香菇</i>
                                    <em style="color:#FF9E3F">
                                        活雷锋
                                    </em>
                                </cite>
                            </a>
                            <div class="detail-hits">
                                <span>刚刚</span>
                            </div>
                        </div>
                        <div class="detail-body jieda-body">
                            <p>@纸飞机 :蓝瘦</p>
                        </div>
                        <div class="jieda-reply">
								<span class="jieda-zan" type="zan">
                                    <i class="iconfont icon-zan"></i>
                                    <em>0</em>
								</span>
                            <span type="reply">
                                <i class="iconfont icon-svgmoban53"></i>回复
                            </span>
                            <div class="jieda-admin">
                                <span type="del">
                                    <a href="#" class="layui-btn layui-btn-danger layui-btn-small">删除</a>
                                </span>
                                <span class="jieda-accept" type="accept">
									<a href="#" class="layui-btn  layui-btn-small">采纳</a>
                                </span>
                            </div>
                        </div>
                    </li>

                    <!-- <li class="fly-none">没有任何回答</li> -->
                </ul>
                <span id="toName">@ 压缩(楼主)</span>
                <div class="layui-form layui-form-pane">
                    <form action="">
                        <div class="layui-form-item layui-form-text">
                            <div class="layui-input-block">
                                <div id="editor">
                                    <label for="L_content"></label>
                                    <textarea id="L_content" name="content" required lay-verify="required"
                                              placeholder="我要回答" class="layui-textarea " style="height: 250px;">
                                    </textarea>
                                </div>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label>
                                <input class="layui-btn" value="提交回答"/>
                            </label>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <div class="edge">
        <dl class="fly-panel fly-list-one">
            <dt class="fly-panel-title">最近热帖</dt>
            <dd>
                <a href="">使用 layui 秒搭后台大布局（基本结构</a>
                <span>
                    <i class="iconfont">&#xe60b;</i>6087
                </span>
            </dd>
            <dd>
                <a href="">Java实现LayIM后端的核心代码</a>
                <span>
                    <i class="iconfont">&#xe60b;</i>767
                </span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局（基本结构</a>
                <span>
                    <i class="iconfont">&#xe60b;</i>6087
                </span>
            </dd>
            <dd>
                <a href="">Java实现LayIM后端的核心代码</a>
                <span>
                    <i class="iconfont">&#xe60b;</i>767
                </span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局（基本结构</a>
                <span>
                    <i class="iconfont">&#xe60b;</i>6087
                </span>
            </dd>
            <dd>
                <a href="">Java实现LayIM后端的核心代码</a>
                <span>
                    <i class="iconfont">&#xe60b;</i>767
                </span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局（基本结构</a>
                <span>
                    <i class="iconfont">&#xe60b;</i>6087
                </span>
            </dd>
            <dd>
                <a href="">Java实现LayIM后端的核心代码</a>
                <span>
                    <i class="iconfont">&#xe60b;</i>767
                </span>
            </dd>
        </dl>

        <dl class="fly-panel fly-list-one">
            <dt class="fly-panel-title">近期热议</dt>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a>
                <span>
                    <i class="iconfont">&#xe60c;</i>96
                </span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a>
                <span>
                    <i class="iconfont">&#xe60c;</i>96
                </span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a>
                <span>
                    <i class="iconfont">&#xe60c;</i>96
                </span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a>
                <span>
                    <i class="iconfont">&#xe60c;</i>96
                </span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a>
                <span>
                    <i class="iconfont">&#xe60c;</i>96
                </span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a>
                <span>
                    <i class="iconfont">&#xe60c;</i>96
                </span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a>
                <span>
                    <i class="iconfont">&#xe60c;</i>96
                </span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a>
                <span>
                    <i class="iconfont">&#xe60c;</i>96
                </span>
            </dd>
        </dl>
    </div>
</div>
<div class="footer">
    <p>
        <a href="#">网博社区</a> 2017 &copy; <a href="#/">njwangbo.com</a>
    </p>
    <p>
        <a href="#" target="_blank">产品授权</a> <a href="#" target="_blank">网博社区</a>
        <a href="#" target="_blank">微信公众号</a>
    </p>
</div>
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
