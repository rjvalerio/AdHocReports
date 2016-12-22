function getUserName(userId) {
	new Ajax.Updater("welcomeUserDiv", contextPath+"/GIISUserController?action=fetchUserName&userId="+userId, {
		evalScripts: true,
		asynchronous: true
	});
}