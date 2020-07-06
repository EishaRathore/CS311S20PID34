const ham=document.querySelector('.header .nav-bar .nav-list .ham');
const mobile_menu = document.querySelector(".header .nav-bar .nav-list ul");
const header=document.querySelector('.header.container');
ham.addEventListener('click',()=>{
    ham.classList.toggle('active');
    mobile_menu.classList.toggle('active');
});
var nav = document.getElementById("nav");
var h1=document.getElementById("h1");
var btn = document.getElementById("btn");

window.onscroll = function () {
  if (window.pageYOffset > 100) {
    nav.style.position = "fixed";
    nav.style.top = 0;
    h1.text="";
    btn.style.top=0;
   // btn.style.position="fixed";
  } else {
    nav.style.position = "absolute";
    nav.style.top = 20;
  }
};