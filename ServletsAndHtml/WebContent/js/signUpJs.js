function hello (){
$.ajax({
  type: 'POST',
  url: $("form").attr("action"),
  data: $("form").serialize(), 
  success: function(response) {
  		alert(response); 
		alert("Successfully Signed In");
		window.location.href = "../html/loginPage.html";
	 },
});
}



