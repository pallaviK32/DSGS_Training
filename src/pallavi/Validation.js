/**
 * 
 */
function uNameLength()
{
 var x=document.getElementById("uname").value;
 if(x.length<8)
	 {
	  document.getElementById("unameErr").innerHTML="Username length must be greater than 8";
	 }
 if(x.length>15)
	 {
	  document.getElementById("unameErr").innerHTML="Username length must be less than 15";
	 }
}

function validate()
{
  var a=document.getElementById("uname").value;
  var b=document.getElementById("upass").value;
  var c=document.getElementById("email").value;
  
   if(a=="")
	  {
	   document.getElementById("unameErr").innerHTML="Username cannot be blanked";
	   return false;
	  }
   if(b=="")
	   {
	    document.getElementById("upassErr").innerHTML="Password cannot be blanked";
	    return false;
	   }
   if(c=="")
	   {
	    document.getElementById("emailErr").innerHTML="Email Address cannot be blanked";
	    return false;
	   }
   
   return true;
   
}

function clearNameErrMsg() 
{
	document.getElementById('unameErr').innerHTML="";

}

function clearPassErrMsg()
{
	document.getElementById('upassErr').innerHTML="";

}

function clearEmailErrMsg()
{
    document.getElementById('emailErr').innerHTML="";	
}

function upassValidation()
{
	var pass=document.getElementById('upass').value;
	if(pass.length<6)
		{
		document.getElementById('upassErr').innerHTML="Password length should be greater than 6";
		return;
		}
	 var uppercaseRegex = /[A-Z]/;
     var lowercaseRegex = /[a-z]/;
     var numberRegex = /\d/;
     var SpecialCharRegex = /[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]/;
     
      if (!uppercaseRegex.test(pass)) 
       {
         document.getElementById('upassErr').innerText = 'Password must contain at least one uppercase letter.';
       } 
      else if (!lowercaseRegex.test(pass)) 
       {
         document.getElementById('upassErr').innerText = 'Password must contain at least one lowercase letter.';
       }
      else if(!numberRegex.test(pass))
    	  {
    	  document.getElementById('upassErr').innerText = 'Password must contain at least one number';
    	  }
      else if(!SpecialCharRegex.test(pass))
	  {
	  document.getElementById('upassErr').innerText = 'Password must contain at least one special character';
	  }
 
}

function emailValidation()
{
    var em=document.getElementById('email').value;
    if(em.indexOf('@')<=0)
    	{
    	 document.getElementById('emailErr').innerHTML="invalid @ position";
    	 return false;
    	}
    if((em.charAt(em.length-4)!='.')&&(em.charAt(em.length-3)!='.'))
    	{
    	 document.getElementById('emailErr').innerHTML="invalid . position";
    	return false;
    	}
   
}

function dobValidation()
{
	var dob1=document.getElementById('dob');
	
	if (isNaN(dobDate) || dobDate > today)
	{
        document.getElementById('dobErr').innerText = 'Invalid date of birth.';
    } 
	else 
	{
        var yearDiff = today.getFullYear() - dob.getFullYear();
        var monthDiff = today.getMonth() - dob.getMonth();
        var dayDiff = today.getDate() - dob.getDate();
        
        if(yearDiff < 18)
        	{
        	document.getElementById('dobErr').innerText = 'Your age should be 18 or 18+';
        	}
    }
	
	
	
}




