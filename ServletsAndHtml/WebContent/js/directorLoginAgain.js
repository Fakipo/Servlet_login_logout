window.onload = (event) => {
  $.ajax({
  type: 'GET',
  url: "../CheckLoginStatus",
  data: '', 
  success: function(response) { 
  		if(response!="null"){
  			alert("User is not logged in");
  			window.location.href = "../html/homePage.html";
  		}
	 },
});
};