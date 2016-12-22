function getUserAccess(div,userId) {
	new Ajax.Updater(div, contextPath+"/GIISUserController?action=getUserAccess&userId="+userId, {
		evalScripts: true,
		asynchronous: true
	});
}