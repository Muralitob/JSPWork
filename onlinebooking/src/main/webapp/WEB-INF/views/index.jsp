<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>宾馆订房系统</title>
    <link href="statics/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="statics/css/mycss.css">
</head>
<body>
<!--顶栏开始-->
    <div class="topmenu">
        <div class="top-logo">逍林大宾馆</div>
        <div class="top-right">
            <img src="statics/assests/img/com_icon_phone.gif" alt="">
            <div class="online-msg">
                <div>
                    7×24 客服电话
                </div>
                <div class="online-phone-number">
                    4009-333-333
                </div>
            </div>
            <div class="online-msg look">
                <a href="#">查看订单</a>
            </div>
        </div>
    </div>
    <!--轮播图开始-->
    <div id="myCarousel" class="carousel slide">
        <!-- 轮播（Carousel）指标 -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
        </ol>   
        <!-- 轮播（Carousel）项目 -->
        <div class="carousel-inner">
            <div class="item active">
                <img src="statics/assests/img/1.jpg" alt="First slide">
                <div class="carousel-caption">低调内涵</div>
            </div>
            <div class="item">
                <img src="statics/assests/img/2.jpg" alt="Second slide">
                <div class="carousel-caption">奢华</div>
            </div>
        </div>
        <!-- 轮播（Carousel）导航 -->
        <a class="carousel-control left" href="#myCarousel" 
            data-slide="prev">&lsaquo;
        </a>
        <a class="carousel-control right" href="#myCarousel" 
            data-slide="next">&rsaquo;
        </a>
    </div>
    <!--内容开始-->
    <div class="container">
        <!--标签头-->
        <div class="nav motion nav-menu">
            <ul>
                <li class="active"><a href="#room-msg" id="room" >房间</a></li>
                <li><a href="#hotel-msg" id="hotel" >宾馆</a></li>
            </ul>
        </div>
        <!--房间信息开始-->
        <div id="room-msg" name="room-msg">
            <div class="room-item">
                <div class="room-detail">
                    <div class="left">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-img">
                        <div>
                            <h2 class="room-name">商务大床房</h2>
                            <div class="room-config">
                                房间面积 18-20m2
                                |大床房 1.8米
                                |楼层: 2-4层
                            </div>
                        </div>
                    </div>
                    <div>
                        <div class="room-price right">360000￥</div>
                        <button type="button" class="btn btn-default room-btn">立即预定</button>
                    </div>
                </div>
                <div class="room-show room-imgshow">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                </div>
            </div>
            <div class="room-item">
                    <div class="room-detail">
                        <div class="left">
                            <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-img">
                            <div>
                                <h2 class="room-name">商务大床房</h2>
                                <div class="room-config">
                                    房间面积 18-20m2
                                    |大床房 1.8米
                                    |楼层: 2-4层
                                </div>
                            </div>
                        </div>
                        <div>
                            <div class="room-price right">360000￥</div>
                            <button type="button" class="btn btn-default room-btn">立即预定</button>
                        </div>
                    </div>
                    <div class="room-show room-imgshow">
                            <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                            <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                            <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                            <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                            <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                            <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                    </div>
            </div> 
            <div class="room-item">
                <div class="room-detail">
                    <div class="left">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-img">
                        <div>
                            <h2 class="room-name">商务大床房</h2>
                            <div class="room-config">
                                房间面积 18-20m2
                                |大床房 1.8米
                                |楼层: 2-4层
                            </div>
                        </div>
                    </div>
                    <div>
                        <div class="room-price right">360000￥</div>
                        <button type="button" class="btn btn-default room-btn">立即预定</button>
                    </div>
                </div>
                <div class="room-show room-imgshow">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                </div>
            </div>
            <div class="room-item">
                <div class="room-detail">
                    <div class="left">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-img">
                        <div>
                            <h2 class="room-name">商务大床房</h2>
                            <div class="room-config">
                                房间面积 18-20m2
                                |大床房 1.8米
                                |楼层: 2-4层
                            </div>
                        </div>
                    </div>
                    <div>
                        <div class="room-price right">360000￥</div>
                        <button type="button" class="btn btn-default room-btn">立即预定</button>
                    </div>
                </div>
                <div class="room-show room-imgshow">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                        <img src="statics/assests/img/豪华大床房1.jpg" alt="" class="room-simg">
                </div>
            </div>
        </div>
        <!--酒店信息开始-->
        <div id="hotel-msg" name="hotel-msg">
            <div class="hotel-title">酒店信息</div>
            <div class="hotel-detail">
                <div class="hotel-item">
                    <div class="hotel-key">酒店电话</div>
                    <div class="hotel-value">021-52901999 艺龙电话预订：4009-333-333</div>
                </div>
                <div class="hotel-item">
                    <div class="hotel-key">入离时间</div>
                    <div class="hotel-value">入住时间:12点以后，离店时间:12点以前</div>
                </div>
                <div class="hotel-item">
                    <div class="hotel-key">上网服务</div>
                    <div class="hotel-value">公共区域提供WiFi</div>
                </div>
                <div class="hotel-item">
                    <div class="hotel-key">开业时间</div>
                    <div class="hotel-value">酒店开业时间 2006年 新近装修时间  2014 年</div>
                </div>
                <div class="hotel-item">
                    <div class="hotel-key">酒店设施</div>
                    <div class="hotel-value">免费Wifi、叫醒服务、行李寄存、有电梯、安全消防系统、公共区域闭路电视监控系统、24小时热水</div>
                </div>
                <div class="hotel-item">
                    <div class="hotel-key">酒店简介</div>
                    <div class="hotel-value">如家快捷酒店（上海镇坪路地铁店）酒店位于内环高架镇坪路/光新路匝道出口处，轨道三、四、七号线镇坪路站步行至酒店不到5分钟。搭乘地铁3、4号线至曹杨路站换乘地铁11号线或在上海长途汽车总站搭乘迪斯尼乐园大巴专线约1小时可以直达迪斯尼园区；由内环线转延安路高架约25分钟可直达国家会展中心；轨道交通三号线可直达上海火车站、上海火车南站、上海长途汽车总站、虹口足球场；轨道七号线可送您直达上海新国际博览中心、静安寺、淮海路、世博中国国家馆及龙阳路磁悬浮车站。轨道四号线可直达环球港购物中心、中山公园商圈、徐家汇商圈、上海体育场。大型购物超市及各色餐饮以及长寿路商业街、武宁路商业街均环绕酒店周边。便捷的交通、优质的服务是您在上海商务、旅游的最理想选择。酒店开业时间2006年10月12日，2014年4月装修，楼高4层，客房总数140间（套）。</div>
                </div>
            </div>
        </div>
        <div class="foot">
            逍林大宾馆,欢迎您的光临
        </div>
    </div>
</body>
 <script src="static/js/jquery.js"></script>
 <script src="static/js/bootstrap.min.js"></script>
 <script src="static/js/myjs.js"></script>
</html>