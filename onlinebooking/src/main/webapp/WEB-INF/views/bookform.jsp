<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>订单信息填写</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="statics/css/mycss.css">
    <link rel="stylesheet" href="statics/css/bootstrap-datetimepicker.min.css">
</head>
<body>
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
    <div class="container formb">
        <div class="hotel-room-msg">
            <img src="statics/assests/img/豪华大床房1.jpg" class="form-img">
            <p>如家快捷酒店(上海江湾镇大柏树店)</p>
            <p>特惠双床房 - 标准价</p>
            <br>
            <div>
                床型: 大床房
            </div>
            <div>
                面积： 36m2
            </div>
            <div>
                宽带：无限
            </div>
            <div>
                可住：2人
            </div>
            <div>
                其他：房间窗户朝向走廊 全部房间包含无线
            </div>
        </div>
        <div class="formbody">
            <div class="book-msg ">
                <div class="title">预定信息</div>
                <div class="book-date">
                        <div>
                            起始日期
                        </div>
                        <input id="datetimepicker1" type="text" data-date-format="yyyy-mm-dd" >
                        <div>
                            入住天数
                        </div>
                        <input type="text">
                </div>
            </div>
            <div class="self-msg">
                <div class="title">入住信息</div>
                <div class="self-body">
                    <form>
                        <div class="form-group">
                            <label for="inputEmail3" class="control-label">姓名</label>
                            <input type="text" class="form-control" id="username" placeholder="姓名" name="username">
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="control-label">电话</label>
                            <input type="text" class="form-control" id="usettel" placeholder="联系电话" name="usertel">
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="control-label">Email</label>
                            <input type="text" class="form-control" id="useremail" placeholder="邮箱" name="useremail">
                        </div>
                        <div class="form-group btngroup">
                          
                              <div class="price">
                                    总价房费￥161
                              </div>   
                            <button type="submit" class="btn btn-danger">提交订单</button>
                        </div>
                      </form>
                </div>
            </div>
        </div>
    </div>
</body>
<script src="statics/js/jquery.js"></script>
<script src="statics/js/bootstrap-datetimepicker.min.js"></script>
 <script src="statics/js/myjs.js"></script>
</html>