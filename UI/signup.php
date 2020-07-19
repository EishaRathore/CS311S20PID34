<?php
session_start();
  header("location:signup.html");
  mysqli_select_db($con,'registration');
  if(isset($_POST['submit'])){
   include '../src/DataBase/MySql.php';

       
   $lastname = $_POST['lastName'];
   $Firstname = $_POST['FirstName'];
    $mblno = $_POST['mblno'];
    $email = $_POST['email'];
    $pass = $_POST['pass'];
    $cpass = $_POST['cpass'];
    //check email
    $emailquery = "select * from registration where email='$email'";
    $query = mysqli_query($con,$emailquery);

    $emailcount = mysqli_num_rows($query);

    if($emailcount > 0 ){
      echo 'Email already exists!';
    }else{
        if($pass == $cpass){ 
          $mblquery = "select * from registration where mblNo='$mblno'";
          $mbquery = mysqli_query($con,$mblquery);
   
          $mblcount = mysqli_num_rows($mbquery);
          if($mblcount == 1){
            ?>
            <script>
            echo"Phone Number already exists!"; 
            </script>
            <?php
          }else{
            $insertquery = "insert into registration(FirstName,lastName,email,mblNo,pass,Cpass) values('$Firstname','$lastname','$email','$mblno','$pass','$cpass')";
            $iquery =mysqli_query($con,$insertquery);
            if($iquery){
             ?>
             <script>
             echo 'Inserted Successful'; 
             </script>
             <?php
             } else{
               ?>
               <script>
               echo 'Data not Inserted';
             </script>
          <?php
           }
          }
          
        }
        else{
          ?>
          <script>
          echo 'Password doesn't match!';
          </script>
          <?php
          }
        }
  }
?>