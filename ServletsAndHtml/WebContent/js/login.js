function hello (){
$.ajax({
  type: 'GET',
  url: $("form").attr("action"),
  data: $("form").serialize(), 
  success: function(response) { 
  		if(response=="null"){
  			alert("Does not exist");
  			window.location.href = "../html/loginPage.html";
  		}
  		else{
	  		alert("successfully logged in ");
	  		window.location.href = "../html/homePage.html";
		}
	 },
});
}



