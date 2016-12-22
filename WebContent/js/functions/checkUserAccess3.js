function checkUserAccess3(id, length, obj,menu,func,title){
	var isExists = false;
	for (var i = 0, l = length; i < l; i++) {
		var userAcc = obj.userModuleId[i];
		if (id.includes(userAcc + " ")) {
			isExists = true;
		}	
	}
	if(!isExists){
		disableMenu(menu);
	}else{
		enableMenu(menu);
		goToPage(menu,func,"Please wait.....",title);
	}
}