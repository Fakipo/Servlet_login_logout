window.onload = (event) => {
  $.ajax({
  type: 'GET',
  url: "../CheckLoginStatus",
  data: '', 
  success: function(response) { 
  		if(response!="null"){
   			document.getElementById("loginPagelink").style.visibility = "hidden";
  			document.getElementById("signupPageLink").style.visibility = "hidden";
  		}
	 },
});
};