function checkUserAccess2(id, prop, obj,menu,func,title){
	var length = obj.prop.length;
	for (var i = 0, l = length; i < l; i++) {
		var userAcc = obj.prop[i];
		if (id == userAcc) {
			$(menu).observe("click", function () {
				goToPage(menu,func,"Please wait.....",title);
			});
		}else{
			disableMenu(menu);
		}
			
	}
}

