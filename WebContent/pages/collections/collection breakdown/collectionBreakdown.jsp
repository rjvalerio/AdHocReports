<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="menuDiv">
	<div id="mainNav" name="mainNav">
		<div id="smoothmenu1" name="smoothmenu1" class="ddsmoothmenu">
			<ul>
				<li><a id="btnExit">Exit</a></li>
			</ul>
		</div>
	</div>
</div>


<!-- hidden fields -->
<input type="hidden" id="page" name="page" value="${page}">
<input type="hidden" id="lineCd" name="lineCd" value="${lineCd}">
<input type="hidden" id="errorMsg" name="errorMsg" value="${errorMsg}">
<input type="hidden" id="userId" name="userId" value="${adhocUser}">
<input type="hidden" id="reportTitle" name="reportTitle"
	value="${reportTitle}">
<input type="hidden" id="reportName" name="reportName"
	value="${reportName}">
<input type="hidden" id="reportUrl" name="reportUrl"
	value="${reportUrl}">
<input type="hidden" id="reportXls" name="reportXls"
	value="${reportXls}">
<input type="hidden" id="selDestination" name="selDestination"
	value="screen">
<%-- <input type="hidden" id="branchList4" name="branchList4" value='${branchList4}'> --%>
<input type="hidden" id="assuredList2" name="assuredList2" value='${assuredList2}'>
<!-- end hidden fields -->

<br />
<br />
<div id="outerDiv" name="outerDiv">
	<div id="innerDiv" name="outerDiv">
		<label id="pageTitle">Collection Breakdown</label>
	</div>
</div>
<div id="pageDetailsDiv">
	<div id="pageSectionDiv" class="sectionDiv"
		style="margin-bottom: 10px;">
		<div class="sectionDiv" id="pageMainDiv"
			style="width: 90%; height: 400px; margin-top: 40px; margin-left: 45px; margin-bottom: 10px;">
			<div id="parametersDiv"
				style="width: 97%; margin-left: 8px; margin-top: 9px; float: left;">

				<!-- dateRange Div -->
				<div class="sectionDiv" id="dateTypeDiv"
					style="width: 35%; height: 100px; margin-left: 40%; margin-top: 9px; float: left; border-color: white;">
					<table style="margin-top: 10px; width: 100%;">
						<tr>
							<td style="width: 30%;">Date Range:</td>
						</tr>
						<tr>
							<td>
								<!-- from to div -->
								<div id="fromToDiv">
									<table style="margin-top: 10px; width: 100%;">
										<tr>
											<td class="rightAligned" style="width: 5%;">From</td>
											<td class="leftAligned" style="width: 42%;">
												<div
													style="float: left; border: solid 1px gray; width: 108px; height: 20px; margin-right: 3px;">
													<input type="text"
														style="float: left; margin-top: 0px; margin-right: 3px; width: 74%; border: none;"
														name="fmDate" id="txtFromDate" readonly="readonly" /> <img
														id="imgFromDate" alt="imgFromDate" style="height: 18px;"
														class="hover"
														src="${pageContext.request.contextPath}/images/misc/but_calendar.gif" />
												</div>
											</td>
										</tr>
										<tr>
											<td class="rightAligned" style="width: 5%;">To</td>
											<td class="leftAligned" style="width: 42%;">
												<div
													style="float: left; border: solid 1px gray; width: 108px; height: 20px; margin-right: 3px;">
													<input type="text"
														style="float: left; margin-top: 0px; margin-right: 3px; width: 74%; border: none;"
														name="toDate" id="txtToDate" readonly="readonly" /> <img
														id="imgToDate" alt="imgToDate" style="height: 18px;"
														class="hover"
														src="${pageContext.request.contextPath}/images/misc/but_calendar.gif" />
												</div>
											</td>
										</tr>
									</table>
								</div>
							</td>
						</tr>
					</table>
				</div>

				<div class="sectionDiv" id="miscDiv"
					style="width: 50%; margin-left: 22%; margin-top: 9px; margin-bottom: 20px; float: left; border-color: white;">
					<table style="margin-top: 10px; width: 100%;">
						<tr>
							<td class="rightAligned" style="width: 25%;">Branch</td>
							<td class="leftAligned"><select name="selBranch"
								id="selBranch" style="width: 30%;">
									<option value=""></option>
									<c:forEach var="branch" items="${ branchList }">
										<option>${branch.issCd}</option>
									</c:forEach>
							</select> <input id="txtBranch" name="capsField" class="leftAligned"
								type="text" style="width: 65%;" value="" title="Branch Name"
								disabled /></td>
						</tr>
						<tr>
							<td class="rightAligned" style="width: 25%;">Payment Mode</td>
							<td class="leftAligned"><select name="selPayment"
								id="selPayment" style="width: 25%;">
									<option value="ALL">ALL</option>
									<option value="CA">CA</option>
									<option value="CC">CC</option>
									<option value="CHK">CHK</option>
									<option value="CM">CM</option>
									<option value="CMI">CMI</option>
									<option value="CW">CW</option>
									<option value="WT">WT</option>
							</select></td>
						</tr>
						<!-- <tr>
							<td class="rightAligned" style="width: 25%;">Branch</td>
							<td><div id="comboDivBranch"
									style="width: 100%;"></div></td>
						</tr>
						<tr>
							<td class="rightAligned" style="width: 25%;">Payment Mode</td>
							<td class="leftAligned"><div id="comboDivPayment"
									style="width: 25%;"></div></td>
						</tr> -->
						<!-- <tr>
							<td class="rightAligned" style="width: 25%;">Assured</td>
							<td><div id="comboDivAssured"
									style="width: 100%;"></div></td>
						</tr> -->
					</table>
				</div>
				<br /> <br /> <br />
				<div class="sectionDiv" id="printDiv"
					style="width: 97%; margin-left: 8px; margin-top: 9px; float: left; border-color: white;">
					<div id="printofferLetterButtonsDiv" align="center">
						<input type="button" class="button" style="width: 90px;"
							id="btnCancel" value="Cancel"> <input type="button"
							class="button" style="width: 90px;" id="btnPrint" value="Print">
					</div>
				</div>

			</div>
		</div>
		<div id="blankDiv"></div>
	</div>
</div>

<script type="text/javascript">
	var page = $F("page");
	var reportName = 'COLLECTION_BREAKDOWN_REP';
	var issCd = '';
	makeInputFieldUpperCase();
	
	/* var comboAssured;
	var dataAssured = $F("assuredList2");
	
	comboAssured = new dhtmlXCombo("comboDivAssured");
	comboAssured.load(dataAssured);
	comboAssured.setFilterHandler(function(mask, option){
		var r = false;
		if (mask.length == 0) {
			r = true;
		} else if (option.text.match(new RegExp("^"+mask,"i")) != null) {
			r = true;
		}
		return r; 
	}); */
	
	/* var comboPayMethod,comboBranch;
	var dataBranch = $F("branchList4");
	var dataPayMethod = '{options:['+
	'{value: "1", text: "ALL",selected:true},'+
	'{value: "2", text: "CA"},'+
	'{value: "3", text: "CC"},'+
	'{value: "4", text: "CHK"},'+
	'{value: "5", text: "CM"},'+
	'{value: "6", text: "CMI"},'+
	'{value: "7", text: "CW"},'+
	'{value: "8", text: "WT"}'+
	']}';
	var data2 = '{options:['+
	'{value: "1", text: "Copenhagen Airport"},'+
	'{value: "2", text: "Dublin Airport", selected: true},'+
	'{value: "3", text: "Frankfurt Airport"}'+
	']}';
	
	comboBranch = new dhtmlXCombo("comboDivBranch");
	comboBranch.load(dataBranch);
	comboBranch.setFilterHandler(function(mask, option){
		var r = false;
		if (mask.length == 0) {
			r = true;
		} else if (option.text.match(new RegExp("^"+mask,"i")) != null) {
			r = true;
		}
		return r; 
	});
	
	comboPayMethod = new dhtmlXCombo("comboDivPayment");
	comboPayMethod.load(dataPayMethod);
	comboPayMethod.setFilterHandler(function(mask, option){
		var r = false;
		if (mask.length == 0) {
			r = true;
		} else if (option.text.match(new RegExp("^"+mask,"i")) != null) {
			r = true;
		}
		return r; 
	}); */
	
	var fromCalendar = new dhtmlXCalendarObject({
		input : "txtFromDate",
		button : "imgFromDate"
	});

	var toCalendar = new dhtmlXCalendarObject({
		input : "txtToDate",
		button : "imgToDate"
	});

	$("btnExit").observe(
			"click",
			function() {
				goToModule(divToUpdate, contextPath + "/pages/main.jsp",
						"Please wait.....", "Home");
			});

	$("btnCancel").observe(
			"click",
			function() {
				goToModule(divToUpdate, contextPath + "/pages/main.jsp",
						"Please wait.....", "Home");
			});
	
	$("btnPrint")
	.observe(
			"click",
			function() {
				var fromDate = $F("txtFromDate");
				var toDate = $F("txtToDate");
				var payMode = $F("selPayment");
				//issCd = comboBranch.getSelectedValue();
				//var payMode = comboPayMethod.getSelectedText();
				var userId = $F("userId");
				if(payMode == 'ALL'){
					payMode = '';
				}
				if(!checkBlankNull(fromDate) && !checkBlankNull(toDate)){
				if (!compareDate(fromDate, toDate)) {
					new Ajax.Updater(
							"mainContents",
							contextPath
									+ "/CollectionBreakdownController",
							{
								evalScripts : true,
								method : "POST",
								parameters : {
									action : "printReport",
									fromDate : fromDate,
									toDate : toDate,
									branchCd : issCd,
									payMode : payMode,
									reportName : reportName
								},
								onCreate : showNotice("Generating report. Please wait..."),
								onComplete : function(response) {
									printOutputXls();
								}
							});
				} else {
					showMessageBox(
							"\"From Date\" must be earlier from \"To Date\".",
							"E");
				}
				}else{
					showMessageBox(
							"\"From Date\" & \"To Date\" must not be null.",
							"E");
				}
			});
	
	$("selBranch").observe("change", function(){
		var selected = $("selBranch").getValue();
		getBranchName(selected,"txtBranch");
	});
	
	function getBranchName(selected,txtBranchName){
		var branchCd = [
		                 <c:forEach var="branch" items="${branchList}" varStatus="loop">
		                   "${branch.issCd}"
		                   <c:if test="${!loop.last}">,</c:if>
		                 </c:forEach>
		               ];
		var branchName = [
		                 <c:forEach var="branch" items="${branchList}" varStatus="loop">
		                   "${branch.issName}"
		                   <c:if test="${!loop.last}">,</c:if>
		                 </c:forEach>
		               ];
		var bName = ''; 
		for (var i = 0; i < branchCd.length; i++) {
		if (selected == branchCd[i]) {
			bName = branchName[i];
			issCd = branchCd[i];
		}
		}
		$(txtBranchName).writeAttribute("value",bName);
		}

	function printOutputXls() {
		var reportUrl = $F("reportUrl");
		var reportXls = $F("reportXls");
		var reportTitle = $F("reportTitle");
		var errorMsg = $F("errorMsg");
		if (!checkBlankNull(errorMsg)) {
			hideNotice("");
			showMessageBox(errorMsg, "E");
		} else {
			var content = contextPath
					+ "/OutputController?action=showPdf&reportUrl=" + reportXls;
			new Ajax.Request(contextPath + "/GIISUserController", {
				action : "POST",
				asynchronous : false,
				parameters : {
					action : "setReportParamsToSession",
					reportUrl : content,
					reportTitle : $F("reportTitle")
				},
				onComplete : function(response) {
					window.open(contextPath + "/OutputController?action=showExcel&reportXls=" + reportXls);
					hideNotice("");
				}
			});
		}
	}
	
	function compareDate(fromDate, toDate) {
		var date1 = new Date(fromDate);
		var date2 = new Date(toDate);
		if (date1.getTime() > date2.getTime()) {
			return true;
		}else
			return false;
	}

	function checkBlankNull(str) {
		if (str == '' || str == null)
			return true;
		return false;
	}
</script>
