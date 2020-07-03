const ham=document.querySelector('.header .nav-bar .nav-list .ham');
const mobile_menu = document.querySelector(".header .nav-bar .nav-list ul");
const header=document.querySelector('.header.container');
ham.addEventListener('click',()=>{
    ham.classList.toggle('active');
});