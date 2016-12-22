<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
#selIntm option {
	width: 400px;
}

#selAssd option {
	width: 340px;
}

#selMonth option {
	width: 100%;
}
</style>



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
<input type="hidden" id="outputType" name="outputType"
	value="${outputType}">
<input type="hidden" id="selDestination" name="selDestination"
	value="screen">
<%-- <input type="text" id="letterType" name= "letterType" value = "${letterType}"> --%>
<!-- end hidden fields -->

<br />
<br />
<div id="outerDiv" name="outerDiv">
	<div id="innerDiv" name="outerDiv">
		<label id="pageTitle">Premium Production Report</label>
	</div>
</div>
<div id="premiumProductionDetailsDiv">
	<div id="premiumProductionSectionDiv" class="sectionDiv"
		style="margin-bottom: 10px;">
		<div class="sectionDiv" id="premiumProductionMainDiv"
			style="width: 90%; height: 550px; margin-top: 40px; margin-left: 45px; margin-bottom: 10px;">
			<div id="parametersDiv"
				style="width: 97%; margin-left: 8px; margin-top: 9px; float: left;">

				<!-- branch div -->
				<div class="sectionDiv" id="branchDiv"
					style="width: 50%; margin-left: 5%; margin-top: 9px; float: left; border-color: white;">
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
							<td class="rightAligned" style="width: 25%;">Line</td>
							<td class="leftAligned">
							<select name="selLine" id="selLine"
								style="width: 30%;">
									<option value=""></option>
									<c:forEach var="line" items="${ lineList }">
										<option>${line.lineCd}</option>
									</c:forEach>
							</select> <input id="txtLineName" name="capsField" class="leftAligned"
								type="text" style="width: 65%;" value="" title="Line Name"
								disabled /></td>
						</tr>
						<tr>
							<td class="rightAligned" style="width: 25%;">Intermediary</td>
							<td class="leftAligned">
							<input type="text" id="txtOrixIntm" value="OMLF INSURANCE AGENCY INC." 
								style="width:95%;" disabled>
							<select name="selIntm" id="selIntm"
								style="width: 100%;">
									<option value=""></option>
									<c:forEach var="intm" items="${ intmList }">
										<option value="${intm.intmNo}">${intm.intmName}</option>
									</c:forEach>
							</select></td>
						</tr>
						<!-- <tr>
							<td class="rightAligned" style="width: 25%;">Type</td>
							<td class="leftAligned"><input id="txtIntmType"
								name="capsField" class="leftAligned" type="text"
								style="width: 30%;" value="" title="Intermediary Type" disabled />
							</td>
						</tr> -->
						<tr>
							<td class="rightAligned" style="width: 25%;">Intm No.</td>
							<td class="leftAligned"><input id="txtIntmNo"
								name="capsField" class="leftAligned" type="text"
								style="width: 30%;" value="" title="Intermediary Type" disabled />
								&nbsp;&nbsp;&nbsp; Intm Type <input id="txtIntmType"
								name="capsField" class="leftAligned" type="text"
								style="width: 30%;" value="" title="Intermediary Type" disabled />
							</td>
						</tr>
						<%-- <tr>
							<td class="rightAligned" style="width: 25%;">Assured</td>
							<td class="leftAligned"><select name="selAssd" id="selAssd"
								style="width: 90%;">
									<option value=""></option>
									<c:forEach var="assd" items="${ assdList }">
										<option>${assd.assdName}</option>
									</c:forEach>
							</select></td>
						</tr> --%>
					</table>
				</div>

				<!-- report type div -->
				<div class="sectionDiv" id="reportTypeDiv"
					style="width: 40%; margin-left: 2%; margin-top: 9px; float: left; border-color: white;">
					<table style="margin-top: 10px; width: 100%;">
						<tr>
							<td style="width: 20%;">Report Type</td>
						</tr>
						<tr>
							<td style="width: 100%;"><input type="radio"
								id="rdoPremProd" name="reportType" value="1"
								style="margin-left: 10px; float: left; margin-left: 50px;"
								checked="" /> <label for="rdoPremProd" style="margin-top: 3px;">Premium
									Production Report</label></td>
						</tr>
						<tr>
							<td class="rightAligned"><input type="radio"
								id="rdoDailProd" name="reportType" value="2"
								style="margin-left: 10px; float: left; margin-left: 50px;"
								checked="" /> <label for="rdoDailProd" style="margin-top: 3px;">Daily
									Production Report</label></td>
						</tr>
						<tr>
							<td><input type="radio" id="rdoPeril" name="reportType"
								value="3"
								style="margin-left: 15px; float: left; margin-left: 50px;"
								checked="" /> <label for="rdoPeril" style="margin-top: 3px;">Production
									Per Peril - Dealers</label></td>
						</tr>
						<tr>
							<td class="rightAligned"><input type="radio" id="rdoIntm"
								name="reportType" value="4"
								style="margin-left: 15px; float: left; margin-left: 50px;"
								checked="" /> <label for="rdoIntm" style="margin-top: 3px;">Production
									Per Intermediary</label></td>
						</tr>
						<tr>
							<td><input type="radio" id="rdoOrix" name="reportType"
								value="5"
								style="margin-left: 15px; float: left; margin-left: 50px;"
								checked="" /> <label for="rdoOrix" style="margin-top: 3px;">Production
									Per Orix Branch</label></td>
						</tr>
					</table>
				</div>


				<!-- dateRange Div -->
				<div class="sectionDiv" id=dateRangeDiv
					style="width: 35%; margin-left: 11%; margin-top: 5px; float: left; border-color: white;">
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
													<input type="text" class="required"
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
													<input type="text" class="required"
														style="float: left; margin-top: 0px; margin-right: 3px; width: 74%; border: none;"
														name="toDate" id="txtToDate" readonly="readonly" /> <img
														id="imgToDate" alt="imgToDate" style="height: 18px;"
														class="hover"
														src="${pageContext.request.contextPath}/images/misc/but_calendar.gif" />
												</div>
											</td>
										</tr>
									</table>
								</div> <!-- comparative div -->
								<div id="comparativeDiv">
									<table style="margin-top: 10px; width: 100%;">
										<tr>
											<td></td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>vs</b></td>
										</tr>
										<tr>
											<td class="rightAligned" style="width: 5%;">From</td>
											<td class="leftAligned" style="width: 42%;">
												<div
													style="float: left; border: solid 1px gray; width: 108px; height: 20px; margin-right: 3px;">
													<input type="text"
														style="float: left; margin-top: 0px; margin-right: 3px; width: 74%; border: none;"
														name="fmDate" id="txtFromDate2" readonly="readonly" /> <img
														id="imgFromDate2" alt="imgFromDate2" style="height: 18px;"
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
														name="toDate" id="txtToDate2" readonly="readonly" /> <img
														id="imgToDate2" alt="imgToDate2" style="height: 18px;"
														class="hover"
														src="${pageContext.request.contextPath}/images/misc/but_calendar.gif" />
												</div>
											</td>
										</tr>
									</table>
								</div> <!-- booking div -->
								<div id="bookingDiv">
									<table style="margin-top: 10px; width: 100%;">
										<tr>
											<td class="rightAligned" style="width: 5%;">Month</td>
											<td class="leftAligned" style="width: 50%;"><select
												class="required" name="selMonth" id="selMonth"
												style="width: 50%;">
													<option value="JANUARY">JANUARY</option>
													<option value="FEBRUARY">FEBRUARY</option>
													<option value="MARCH">MARCH</option>
													<option value="APRIL">APRIL</option>
													<option value="MAY">MAY</option>
													<option value="JUNE">JUNE</option>
													<option value="JULY">JULY</option>
													<option value="AUGUST">AUGUST</option>
													<option value="SEPTEMBER">SEPTEMBER</option>
													<option value="OCTOBER">OCTOBER</option>
													<option value="NOVEMBER">NOVEMBER</option>
													<option value="DECEMBER">DECEMBER</option>
											</select></td>
										</tr>
										<tr>
											<td class="rightAligned" style="width: 5%;">Year</td>
											<td class="leftAligned" style="width: 42%;"><input
												class="required upper" type="text" id="txtBookingYear"
												name="txtBookingYear" style="width: 20%;" maxlength="4"></td>
										</tr>
									</table>
								</div>
							</td>
						</tr>
					</table>
				</div>

				<!-- report option -->
				<div class="sectionDiv" id="reportOptionDiv"
					style="width: 40%; margin-left: 11%; margin-top: 9px; float: left; border-color: white;">
					<table style="margin-top: 10px; width: 100%;">
						<tr>
							<td style="width: 20%;">Report Options</td>
						</tr>
						<tr>
							<td style="width: 100%;"><input type="radio" id="rdoRegular"
								name="reportOption" value="1"
								style="margin-left: 10px; float: left; margin-left: 50px;"
								checked="" /> <label for="rdoRegular" style="margin-top: 3px;">Regular</label></td>
						</tr>
						<tr>
							<td class="rightAligned"><input type="radio"
								id="rdoComparative" name="reportOption" value="2"
								style="margin-left: 10px; float: left; margin-left: 50px;"
								checked="" /> <label for="rdoComparative"
								style="margin-top: 3px;">Comparative</label></td>
						</tr>
					</table>
				</div>


				<!-- date type div -->
				<div class="sectionDiv" id="dateTypeDiv"
					style="width: 40%; height: 100px; margin-left: 11%; margin-top: 9px; float: left; border-color: white;">
					<table style="margin-top: 10px; width: 100%;">
						<tr>
							<td style="width: 20%;">Date Type</td>
						</tr>
						<tr>
							<td style="width: 100%;"><input type="radio" id="rdoAcct"
								name="dateType" value="1"
								style="margin-left: 10px; float: left; margin-left: 50px;"
								checked="" /> <label for="rdoAcct" style="margin-top: 3px;">Accounting
									Entry Date</label></td>
						</tr>
						<tr>
							<td class="rightAligned"><input type="radio" id="rdoBooking"
								name="dateType" value="2"
								style="margin-left: 10px; float: left; margin-left: 50px;"
								checked="" /> <label for="rdoBooking" style="margin-top: 3px;">Booking
									Date</label></td>
						</tr>
					</table>
				</div>

				<div class="sectionDiv" id="separatorDiv"
					style="width: 100%; height: 1%; float: left; border-color: white;">
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
	reportName = 'PREMIUM_PROD_REP';
	var reportOption = 1;
	var dateType = 1;
	var branch = "";
	var line = "";
	var intmNo = "";
	var assuredNo = "";
	var outputType = 2;  //1 = pdf  2 = xls
	var isIntmRequired = false;
	
	$("txtOrixIntm").hide();
	$("rdoAcct").checked = true;
	$("rdoPremProd").checked = true;
	$("rdoRegular").checked = true;
	
	$("rdoPremProd").click();
	
	$("bookingDiv").hide();
	$("comparativeDiv").hide();
	$("rdoBooking").disable();
	$("rdoComparative").disable();
	makeInputFieldUpperCase();
	
	var fromCalendar = new dhtmlXCalendarObject({
		input : "txtFromDate",
		button : "imgFromDate"
	});

	var toCalendar = new dhtmlXCalendarObject({
		input : "txtToDate",
		button : "imgToDate"
	});
	
	var fromCalendar2 = new dhtmlXCalendarObject({
		input : "txtFromDate2",
		button : "imgFromDate2"
	});

	var toCalendar2 = new dhtmlXCalendarObject({
		input : "txtToDate2",
		button : "imgToDate2"
	});
	
	//toggle report type
	$$("input[name='reportType']").each(function(radio) {
		radio.observe("click", function() {
			toggleReportType(radio.value);
		});
	});
	
	function resetToggleReportType(){
		//reset
		toggleDateType(1);
		toggleReportOption(1);
		$("rdoAcct").checked = true;
		$("rdoRegular").checked = true;
		isIntmRequired = false;
	}
	
	
	function toggleReportType(option){
		$("rdoComparative").disable();
		$("selIntm").enable();
		$("selIntm").value="";
		$("txtIntmNo").writeAttribute("value","");
		$("txtIntmType").writeAttribute("value","");
		$("selIntm").show();
		$("txtOrixIntm").hide();
		intmNo = '';
		if(option == 1){
			reportName = 'PREMIUM_PROD_REP';
			/* $("rdoBooking").disable(); */
			toggleDateType(1);
			$("rdoAcct").checked = true;
			$("rdoAcct").enable();
			$("rdoBooking").disable();
			outputType = 2;
		}
		if(option == 2){
			reportName = 'Daily_Report_Per_Month';
			toggleDateType(2);
			$("rdoBooking").checked = true;
			$("rdoBooking").enable();
			$("rdoAcct").disable();
			/* $("rdoBooking").enable();
			$("rdoBooking").click();
			$("rdoBooking").checked = true;
			$("rdoAcct").disable();
			$("rdoBooking").click(); */
			outputType = 1;
		}
		if(option == 3){
			resetToggleReportType();
			reportName = 'DEALERS_PROD_REP';
			outputType = 2;
			isIntmRequired = true;
		}
		if(option == 4){
			resetToggleReportType();
			reportName = 'PROD_REPORT_PER_INTM';
			$("rdoAcct").checked = true;
			$("rdoComparative").enable();
			outputType = 1;
		}
		if(option == 5){	
			resetToggleReportType();
			reportName = 'PROD_REPORT_ORIX';
			//$("selIntm").value = 'OMLF INSURANCE AGENCY INC.';
			//$("selIntm").writeAttribute("value","OMLF INSURANCE AGENCY INC.");
			$("txtIntmNo").writeAttribute("value","800");
			$("txtIntmType").writeAttribute("value","OA");
			$("txtOrixIntm").show();
			$("selIntm").hide();
			intmNo = 800;
			$("selIntm").disable();
			outputType = 1;
		}
	}
	
	//toggle report option
	$$("input[name='reportOption']").each(function(radio) {
		radio.observe("click", function() {
			toggleReportOption(radio.value);
		});
	});
	
	function toggleReportOption(option){
		$("txtBookingYear").value = "";
		$("txtFromDate2").value = "";
		$("txtToDate2").value = "";
		$("bookingDiv").hide();
		$("fromToDiv").show();
		if (option == 2){
			$("comparativeDiv").show();
			reportOption = 2;
			$("rdoAcct").checked = true;
			$("rdoAcct").disable();
			$("rdoBooking").disable();
			//reportName = 'PROD_REPORT_PER_INTM_VS';
			dateType = 1;
		}else if (option == 1){
			$("comparativeDiv").hide();
			reportOption = 1;
			$("rdoAcct").disable();
			$("rdoBooking").disable();
		 	/* $("rdoAcct").enable();
			$("rdoBooking").enable(); */
		}
	}
	
	//toggle date type
	$$("input[name='dateType']").each(function(radio) {
		radio.observe("click", function() {
			toggleDateType(radio.value);
		});
	});
	
	function toggleDateType(option){
		$("selMonth").value = "JANUARY";
		$("txtBookingYear").value = "";
		$("txtFromDate").value = "";
		$("txtToDate").value = "";
		$("comparativeDiv").hide();
		if (option == 2){
			$("fromToDiv").hide();
			$("bookingDiv").show();
			dateType = 2;
		}else if (option == 1){
			$("bookingDiv").hide();
			$("fromToDiv").show();
			dateType = 1;
		}
	}
	
	
	
	//print function
	$("btnPrint")
	.observe(
			"click",
			function() {
					if (validateInput()){
						 var userInput = "98 " +$F("selLine") + " " + $F("selBranch");
						/* if(!checkUserAccess(userInput,userAccessObj, userAccessObjLength)){
							showMessageBox("User has no access.", "E");
						}else{ */
							 new Ajax.Updater(
									"mainContents",
									contextPath + "/PremProductionController",
									{
										evalScripts : true,
										method : "POST",
										parameters : {
											action : "printReport",
											outputType : outputType,
											//reportName : reportName,
											reportName :$("rdoComparative").checked ? 'PROD_REPORT_PER_INTM_VS': reportName,
											lineCd : $F("selLine"),
											branchCd : $F("selBranch"),
											fromDate : $F("txtFromDate"),
											toDate : $F("txtToDate"),
											getVsDate : $("rdoComparative").checked ? true : false,
											fromDate2 : $("rdoComparative").checked ? $F("txtFromDate2") : '',
											toDate2 : $("rdoComparative").checked ? $F("txtToDate2") : '',
											bookingMonth : $("rdoBooking").checked ? $F("selMonth") : '',
											bookingYear : $("rdoBooking").checked ? $F("txtBookingYear") : 0,
											branchCd : $F("selBranch"),
											intmNo : intmNo
										},
										onCreate : showNotice("Generating report. Please wait..."),
										onComplete : function(response) {
											printOutputPdf();
										}
									}); 
						/* } */
					}
			});
	
	function validateInput(){
		var isOk = false;
		if (dateType == 1){
		if(reportOption == 1){
			if (checkBlankNull($F("txtFromDate"))
					|| checkBlankNull($F("txtToDate"))) {
				showMessageBox("Please input required fields", "I");
				//return false;
				isOk = false;
			}else{
				if (compareDate($F("txtFromDate"), $F("txtToDate"))) {
					showMessageBox("\"From Date\" must be earlier from \"To Date\".","E");
					//return false;
					isOk = false;
				} else {
					//return true;
					isOk = true;
				}	
			}
		}else if(reportOption == 2){
			if (checkBlankNull($F("txtFromDate"))
					|| checkBlankNull($F("txtToDate"))/* 
					|| checkBlankNull($F("txtFromDate2"))
					|| checkBlankNull($F("txtToDate2") )*/) {
				showMessageBox("Please input required fields", "I");
				//return false;
				isOk = false;
			}else
				if (compareDate($F("txtFromDate"), $F("txtToDate"))) {
					showMessageBox("\"From Date\" must be earlier from \"To Date\".","E");
					//return false;
					isOk = false;
				} else {
					if (compareDate($F("txtFromDate2"), $F("txtToDate2"))) {
						showMessageBox("\"From Date\" must be earlier from \"To Date\".","E");
						//return false;
						isOk = false;
					} else {
						//return true;
						isOk = true;
					}	
				}	
		}
		if(isIntmRequired){
			if(checkBlankNull(intmNo)){
				showMessageBox("Intermediary is required", "I");
				//return false;
				isOk = false;
			}else{
				//return true;
				isOk = true;
			}
		}
		}else if(dateType == 2){
			if(checkBlankNull($F("txtBookingYear"))){
				showMessageBox("Please input required fields", "I");
				//return false;
				isOk = false;
			}else if(!/^\d+$/.test($F("txtBookingYear").trim())){
				showMessageBox("Invalid Input. Year must be number", "E");
				//return false;
				isOk = false;
			}else{
				//return true;
				isOk = true;
			}
			if(isIntmRequired){
				if(checkBlankNull(intmNo)){
					showMessageBox("Intermediary is required", "I");
					//return false;
					isOk = false;
				}else{
					//return true;
					isOk = true;
				}
			}
		}
		
		/* alert(isIntmRequired);
		alert(isOk);
		alert(intmNo); */
		return isOk;
	}
	

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
	
	//branch
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
			
		}
		}
		$(txtBranchName).writeAttribute("value",bName);
		}
	
	//line
	$("selLine").observe("change", function(){
		var selected = $("selLine").getValue();
		getLineName(selected,"txtLineName");
	});
	
	function getLineName(selected,txtLineName){
		var lineCd = [
		                 <c:forEach var="line" items="${lineList}" varStatus="loop">
		                   "${line.lineCd}"
		                   <c:if test="${!loop.last}">,</c:if>
		                 </c:forEach>
		               ];
		var lineName = [
		                 <c:forEach var="line" items="${lineList}" varStatus="loop">
		                   "${line.lineName}"
		                   <c:if test="${!loop.last}">,</c:if>
		                 </c:forEach>
		               ];
		var lName = ''; 
		for (var i = 0; i < lineCd.length; i++) {
		if (selected == lineCd[i]) {
			lName = lineName[i];
			
		}
		}
		$(txtLineName).writeAttribute("value",lName);
		}
	
	//intermediary
	$("selIntm").observe("change", function(){
		var selected = $("selIntm").getValue();
		getIntmType(selected,"txtIntmType");
	});
	
	function getIntmType(selected,txtIntmType){
		var intmNo2 = [
		                 <c:forEach var="intm" items="${intmList}" varStatus="loop">
		                   "${intm.intmNo}"
		                   <c:if test="${!loop.last}">,</c:if>
		                 </c:forEach>
		               ];
		
		var intmName = [
		                 <c:forEach var="intm" items="${intmList}" varStatus="loop">
		                   "${intm.intmName}"
		                   <c:if test="${!loop.last}">,</c:if>
		                 </c:forEach>
		               ];
		var intmType = [
		                 <c:forEach var="intm" items="${intmList}" varStatus="loop">
		                   "${intm.intmType}"
		                   <c:if test="${!loop.last}">,</c:if>
		                 </c:forEach>
		               ];
		var iType = '';
		var iNo = '';
		for (var i = 0; i < intmNo2.length; i++) {
		if (selected == intmNo2[i]) {
			iType = intmType[i];
			iNo = intmNo2[i];
		}
		}
		intmNo = iNo;
		$(txtIntmNo).writeAttribute("value",iNo);
		$(txtIntmType).writeAttribute("value",iType);
		}
	
	//assured
	/* $("selAssd").observe("change", function(){
		var selected = $("selAssd").getValue();
		getAssdNo(selected);
	});
	
	function getAssdNo(selected){
		var assdNo2 = [
		                 <c:forEach var='assd' items='${assdList}' varStatus='loop'>
		                   '${assd.assdNo}'
		                   <c:if test='${!loop.last}'>,</c:if>
		                 </c:forEach>
		               ];
		
		var assdName = [
		                 <c:forEach var='assd' items='${assdList}' varStatus='loop'>
		                   '${assd.assdName}'
		                   <c:if test='${!loop.last}'>,</c:if>
		                 </c:forEach>
		               ];
		var aNo = '';
		for (var i = 0; i < assdName.length; i++) {
		if (selected == assdName[i]) {
			aNo = assdNo2[i];
		}
		}
		assdNo = aNo;
		} */

	function printOutputPdf() {
		var reportUrl = $F("reportUrl");
		var reportXls = $F("reportXls");
		var reportTitle = $F("reportTitle");
		var errorMsg = $F("errorMsg");
		if (!checkBlankNull(errorMsg)) {
			hideNotice("");
			showMessageBox(errorMsg, "E");
		} else {
			var content = contextPath
					+ "/OutputController?action=showPdf&reportUrl=" + reportUrl;
			new Ajax.Request(contextPath + "/GIISUserController", {
				action : "POST",
				asynchronous : false,
				parameters : {
					action : "setReportParamsToSession",
					reportUrl : content,
					reportTitle : $F("reportTitle")
				},
				onComplete : function(response) {
					if ($F("outputType") == 1){
						window.open('pages/report.jsp', '',
							'location=0, toolbar=0, menubar=0, fullscreen=1');
					}
					if ($F("outputType") == 2){
						window.open(contextPath + "/OutputController?action=showExcel&reportXls=" + reportXls);
					}
					hideNotice("");
				}
			});
		}
	}
	
	function compareDate(fromDate, toDate) {
		var date1 = new Date(fromDate);
		var date2 = new Date(toDate);
		if (date1.getTime() > date2.getTime()) {
			return true
		}else
			return false;
	}

	function checkBlankNull(str) {
		if (str == '' || str == null)
			return true;
		return false;
	}
</script>
