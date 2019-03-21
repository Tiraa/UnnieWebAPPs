<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration of new Student</title>

	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>

  	<link rel="stylesheet" href="register.css">
</head>
<body>
<div class="hero-image" style="margin-bottom: 0%; background-image: url('header2.jpg'); background-size: 100% 100%;">
</div>

   
   <div class="container">
      <div class="row" style="margin-right: 15px">
         <div class="col-sm-12">
            <br><h5>Student Forms</h5><br>
            <br><h5>Please fill in all fields marked with <font color="red">*</font></h5><br>
           
               <form action="RegisterServlet" method="post">
      		 <div class="row">
        	    <div class="col-md-6 mb-4">
          	       <div class="form-group">
                         <font color="red">*</font>
                         <strong>Student's Name</strong>
                         <input type="text" class="form-control" name="SN" style="text-transform:uppercase">
                       </div>
                    </div>
	            <div class="col-md-6 mb-4">
                       <div class="form-group">
                          <font color="red">*</font>
                          <strong>IC Number</strong>
                          <input type="text" class="form-control" name="IC">
                       </div>
                    </div>
                    <div class="col-md-6 mb-4">
                       <div class="form-group">
                          <font color="red">*</font>
            	          <strong>Matrix ID</strong>
                          <input type="text" class="form-control" name="MID">
                       </div>
                    </div>
                    <div class="col-md-6 mb-4">
                       <div class="form-group">
                          <font color="red">*</font>
                          <strong>Contact Number</strong>
                          <input type="text" class="form-control" name="CTC">
                       </div>
                    </div>
                    <div class="col-md-6 mb-4">
                       <div class="form-group">
                          <font color="red">*</font>
                          <strong>Email</strong>
                          <input type="text" class="form-control" name="mail">
                       </div>
                    </div>
                    <div class="col-md-6 mb-4">
                       <div class="form-group">
                          <font color="red">*</font>
                          <strong>Course</strong>
                          <select class="form-control" name="kos">
                             <option>-Select Course-</option>
			     <option>Accounting</option>
                             <option>Engineering</option>
	                     <option>Computer Science</option>
                          </select>
                       </div>
                    </div>
                    <div class="col-md-6 mb-4">
                       <div class="form-group">
                          <font color="red">*</font>
                          <strong>Related Product</strong>
                          <select class="form-control">
                             <option>Abc</option>
                             <option>abc</option>
                             <option>abc</option>
                             <option>abc</option>
                          </select>
                       </div>
                    </div>
		            </div>
		          
                <center>
         <br><input type="submit" class="a-btn" value="Register"></input>
         	 <input type="reset" class="a-btn" value="Reset"></input>
      </center>

      </form>
      
         </div>
      </div>
   </div>  
    
    <div class="footer" style="margin-top: 25px; background-image: url('footer.png'); background-size: 100% 100%;">
       <div class="container">
           <div class="row">
               <div class="col-md-12">
                <center>
                 <p><br><font> <b> © 2019</b> </font> <font face="Algerian" color="yellow" style="text-shadow: 2px 2px 4px #000000" size="5px"> UnniE </font> <font size="1"><b>UNIVERSITY IN MALAYSIA</b> </font></p>
                 </center>
               </div> 
             
            </div>
         </div>
      </div>
</body>
</html>