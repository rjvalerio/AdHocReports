function goToPage(button,url,msg,pageTitle){
	$(button).observe("click", function() {
		goToModule(divToUpdate,contextPath + url,msg,pageTitle);
	});
}