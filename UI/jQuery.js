function check(){
    if(window.jQuery){
       /* alert("jquery is loaded");*/
            $(".dropdown").click(function() {
                $(".menu").toggleClass("showMenu");
                $(".menu > li").click(function() {
                  $(".dropdown > p").html($(this).html());
                  $(".menu").removeClass("showMenu");
                });
              });
    }
    else{
        alert("jquery is not loaded");
    }
}