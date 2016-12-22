//bry 01.06.10
function showPARCreationPage(lineCd) {
	new Ajax.Updater("mainContents", contextPath+"/DailyProductionReportController",{
		method:"GET",
		evalScripts:true,
		asynchronous: true,
		onCreate: showNotice("Please wait..."),
		onComplete: function () {
			hideNotice("");
			//$("parTypeFlag").value = "P";
			//$("underwritingMainMenu").hide();
			//$("parMenu").hide();
			//$("parListingMenu").show();
			//initializeMenu();
			Effect.Appear($("mainContents").down("div", 0), {
				duration: .001
			});
			setDocumentTitle("Policy Issuance");
		}
	});
		/*}
	});*/
}