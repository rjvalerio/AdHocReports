function getDBName() {
	new Ajax.Updater("database", contextPath+"/GIISUserController?action=getDBName", {
		evalScripts: true,
		asynchronous: true
	});
}