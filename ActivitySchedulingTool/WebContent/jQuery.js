

function check(){
    if(window.jQuery){
            
    }
}

var check = function() {
  if (document.getElementById('password').value ==
    document.getElementById('confirm_password').value) {
    document.getElementById('message').style.color = 'green';
    document.getElementById('message').innerHTML = 'Password Matched';
document.getElementById('submit').disabled = false;
  } else {
    document.getElementById('message').style.color = 'red';
    document.getElementById('message').innerHTML = 'Password not Matching';
 document.getElementById('submit').disabled = true;
  }
}

var dept = function() {
  if (document.getElementById('role').value =='Student') {
    document.getElementById('department').disable = true;
  } else {
    document.getElementById('department').disable = false;  }
}