$(function(){
    window.onload = function()
    {
        var liEl = $('.nav ul li');       
        liEl.click(function(){
            var index = $(this).index()
            $(this).addClass('active').
            siblings().removeClass('active');
            // $(this).removeClass('active')
        })
        window.location.hash='#hotel-msg'

    }
        console.log();
        $(window).scroll(function(){
            var topScroll = $(document).scrollTop()
            if (topScroll>405) {
                $('.motion').css('position','absolute')
                $('.motion').css('top',(topScroll-36))
            }else{
                $('.motion').css('position','static')
                
            }
            
        })
        	
        $('#datetimepicker1').datetimepicker({
            language:'zh-CN',
            autoclose : true,
            minView :2,
            defaultDate : new Date() 
        });
        
});