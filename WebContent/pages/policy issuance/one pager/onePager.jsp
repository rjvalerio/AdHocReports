<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- datepicker -->

<!--  -->

<div id="printRenewalNoticeMenu">
	<div id="mainNav" name="mainNav">
		<div id="smoothmenu1" name="smoothmenu1" class="ddsmoothmenu">
			<ul>
				<li><a id="onePagerExit">Exit</a></li>
			</ul>
		</div>
	</div>
</div>

<!-- hidden fields -->
<input type="hidden" id="userId" name="userId" value="${adhocUser}">
<input type="hidden" id="page" name="page" value="${page}">
<input type="hidden" id="lineCd" name="lineCd" value="${lineCd}">
<input type="hidden" id="errorMsg" name="errorMsg" value="${errorMsg}">
<input type="hidden" id="reportTitle" name="reportTitle"
	value="${reportTitle}">
<input type="hidden" id="reportName" name="reportName"
	value="${reportName}">
<input type="hidden" id="reportBatch" name="reportBatch"
	value="${reportBatch}">
<input type="hidden" id="reportUrl" name="reportUrl"
	value="${reportUrl}">
<input type="hidden" id="selDestination" name="selDestination"
	value="screen">
<!-- end hidden fields -->

<br />
<br />
<div id="outerDiv" name="outerDiv">
	<div id="innerDiv" name="outerDiv">
		<label id="pageTitle">${pageTitle}</label>
		<!--  <span class="refreshers"
			style="margin-top: 0;"> <label id="reloadForm"
			name="reloadForm" title="Reload Form">Reload Form</label>
		</span> -->
	</div>
</div>
<div id="renewalNoticeDetailsDiv">
	<div id="renewalReportSectionDiv" class="sectionDiv"
		style="margin-bottom: 10px;">
		<div class="sectionDiv" id="renewalReportMainDiv"
			style="width: 90%; margin-top: 40px; margin-left: 45px; margin-bottom: 50px;">
			<!-- individual -->
			<div class="sectionDiv" id="individualDiv"
				style="width: 97%; margin-left: 8px; margin-top: 9px; float: left;">
				<table style="margin-top: 10px; width: 100%;">
					<tr>
						<td><input type="radio" id="rdoByIndividual"
							name="printOption" value="I"
							style="margin-left: 15px; float: left; margin-left: 50px;"
							checked="" /> <label for="rdoByIndividual"
							style="margin-top: 3px;">Individual</label></td>
					</tr>
					<tr>
						<td class="rightAligned" style="width: 25%;">Policy No.</td>
						<c:choose>
							<c:when test='${page eq "ClgOnePager"}'>
								<td class="leftAligned"><select name='selLineCd'
									id='selLineCd'>
										<c:forEach var="lineCd" items="${lineCdArray}">
											<option>${lineCd}</option>
										</c:forEach>
								</select> <input id="txtSublineCd" class="leftAligned" type="text"
									name="capsField" style="width: 15%;" value="CLG"
									title="Subline Code" maxlength="7" /> <input id="txtIssCd"
									class="leftAligned" type="text" name="capsField"
									style="width: 8%;" value="" title="Issue Source Code"
									maxlength="2" /> <input id="txtIssueYy"
									class="leftAligned integerNoNegativeUnformattedNoComma"
									type="text" name="intField" style="width: 8%;" value=""
									title="Year" maxlength="2" /> <input id="txtPolSeqNo"
									class="leftAligned integerNoNegativeUnformattedNoComma"
									type="text" name="intField" style="width: 15%;" value=""
									title="Policy Sequence Number" maxlength="7" /> <input
									id="txtRenewNo"
									class="leftAligned integerNoNegativeUnformattedNoComma"
									type="text" name="intField" style="width: 8%;" value=""
									title="Renew Number" maxlength="2" /> <span> <img
										src="${pageContext.request.contextPath}/images/misc/searchIcon.png"
										id="searchForPolicy" name="searchForPolicy" alt="Go"
										style="margin-top: 2px;" title="Search Policy" />
								</span></td>

							</c:when>
							<c:when test='${page eq "PsBankOnePager"}'>
								<td class="leftAligned"><select name='selLineCd'
									id='selLineCd'>
										<c:forEach var="lineCd" items="${lineCdArray}">
											<option>${lineCd}</option>
										</c:forEach>
								</select> <input id="txtSublineCd" class="leftAligned" type="text"
									name="capsField" style="width: 15%;" value=""
									title="Subline Code" maxlength="7" /> <input id="txtIssCd"
									class="leftAligned" type="text" name="capsField"
									style="width: 8%;" value="PS" title="Issue Source Code"
									maxlength="2" /> <input id="txtIssueYy"
									class="leftAligned integerNoNegativeUnformattedNoComma"
									type="text" name="intField" style="width: 8%;" value=""
									title="Year" maxlength="2" /> <input id="txtPolSeqNo"
									class="leftAligned integerNoNegativeUnformattedNoComma"
									type="text" name="intField" style="width: 15%;" value=""
									title="Policy Sequence Number" maxlength="7" /> <input
									id="txtRenewNo"
									class="leftAligned integerNoNegativeUnformattedNoComma"
									type="text" name="intField" style="width: 8%;" value=""
									title="Renew Number" maxlength="2" /> <span> <img
										src="${pageContext.request.contextPath}/images/misc/searchIcon.png"
										id="searchForPolicy" name="searchForPolicy" alt="Go"
										style="margin-top: 2px;" title="Search Policy" />
								</span></td>

							</c:when>
							<c:when test='${page eq "12PlanOnePager"}'>
								<td class="leftAligned"><select name='selLineCd'
									id='selLineCd'>
										<c:forEach var="lineCd" items="${lineCdArray}">
											<option>${lineCd}</option>
										</c:forEach>
								</select> <input id="txtSublineCd" class="leftAligned" type="text"
									name="capsField" style="width: 15%;" value=""
									title="Subline Code" maxlength="7" /> <input id="txtIssCd"
									class="leftAligned" type="text" name="capsField"
									style="width: 8%;" value="TP" title="Issue Source Code"
									maxlength="2" disabled /> <input id="txtIssueYy"
									class="leftAligned integerNoNegativeUnformattedNoComma"
									type="text" name="intField" style="width: 8%;" value=""
									title="Year" maxlength="2" /> <input id="txtPolSeqNo"
									class="leftAligned integerNoNegativeUnformattedNoComma"
									type="text" name="intField" style="width: 15%;" value=""
									title="Policy Sequence Number" maxlength="7" /> <input
									id="txtRenewNo"
									class="leftAligned integerNoNegativeUnformattedNoComma"
									type="text" name="intField" style="width: 8%;" value=""
									title="Renew Number" maxlength="2" /> <span> <img
										src="${pageContext.request.contextPath}/images/misc/searchIcon.png"
										id="searchForPolicy" name="searchForPolicy" alt="Go"
										style="margin-top: 2px;" title="Search Policy" />
								</span></td>

							</c:when>
							<c:otherwise>
								<td class="leftAligned"><input id="txtLineCd"
									class="leftAligned required" type="text" name="capsField"
									style="width: 8%;" value="${lineCd}" title="Line Code" disabled />

									<!-- <input id="txtSublineCd" class="leftAligned" type="text"
							name="capsField" style="width: 15%;" value=""
							title="Subline Code" maxlength="7" /> --> <c:choose>
										<c:when test='${page ==  "regFI"}'>
											<input id="txtSublineCd" class="leftAligned" type="text"
												name="capsField" style="width: 15%;" value="REG"
												title="Subline Code" maxlength="7" />
										</c:when>
										<c:otherwise>
											<input id="txtSublineCd" class="leftAligned" type="text"
												name="capsField" style="width: 15%;" value=""
												title="Subline Code" maxlength="7" />
										</c:otherwise>
									</c:choose> <c:choose>
										<c:when
											test='${page == "12pMC" || page == "12pFI" || page == "12pPA"}'>
											<input id="txtIssCd" class="leftAligned" type="text"
												name="capsField" style="width: 8%;" value="TP"
												title="Issue Source Code" maxlength="2" disabled="disabled" />
										</c:when>
										<c:when test='${page == "clgFI"}'>
											<input id="txtIssCd" class="leftAligned" type="text"
												name="capsField" style="width: 8%;" value="FM"
												title="Issue Source Code" maxlength="2" disabled="disabled" />
										</c:when>
										<c:when test='${page == "psFI"}'>
											<input id="txtIssCd" class="leftAligned" type="text"
												name="capsField" style="width: 8%;" value="PS"
												title="Issue Source Code" maxlength="2" disabled="disabled" />
										</c:when>
										<c:otherwise>
											<input id="txtIssCd" class="leftAligned" type="text"
												name="capsField" style="width: 8%;" value=""
												title="Issue Source Code" maxlength="2" />
										</c:otherwise>
									</c:choose> <input id="txtIssueYy"
									class="leftAligned integerNoNegativeUnformattedNoComma"
									type="text" name="intField" style="width: 8%;" value=""
									title="Year" maxlength="2" /> <input id="txtPolSeqNo"
									class="leftAligned integerNoNegativeUnformattedNoComma"
									type="text" name="intField" style="width: 15%;" value=""
									title="Policy Sequence Number" maxlength="7" /> <input
									id="txtRenewNo"
									class="leftAligned integerNoNegativeUnformattedNoComma"
									type="text" name="intField" style="width: 8%;" value=""
									title="Renew Number" maxlength="2" /> <span> <img
										src="${pageContext.request.contextPath}/images/misc/searchIcon.png"
										id="searchForPolicy" name="searchForPolicy" alt="Go"
										style="margin-top: 2px;" title="Search Policy" />
								</span></td>
							</c:otherwise>
						</c:choose>
					</tr>
				</table>
				<div id="infoDiv" name="infoDiv"
					style="width: 100%; text-align: center;"></div>
				<!-- report type for OC -->
				<div id="ocReportTypeDiv" name="ocReportTypeDiv"
					style="width: 100%; text-align: center;">
					<table style="margin-top: 10px; width: 100%;">
						<tr>
							<td class="rightAligned" style="width: 10%;"></td>
							<td class="rightAligned"><input type="radio" id="rdoDefault"
								name="OCreportType" value="DEFAULT"
								style="margin-left: 15px; float: left; margin-left: 50px;"
								checked="" /> <label for="rdoDefault" style="margin-top: 3px;">Default</label>
							</td>
							<td><input type="radio" id="rdoOtherOc" name="OCreportType"
								value="OTHER"
								style="margin-left: 15px; float: left; margin-left: 50px;"
								checked="" /> <label for="rdoOtherOc" style="margin-top: 3px;">Other
									OC</label></td>
						</tr>
					</table>
				</div>
				<!-- end -->
			</div>
			<!--  -->

			<!-- batch -->
			<!-- walang batch daw ung OC -->
			<%-- <c:if test="${page ne 'OC' && page ne 'otherOC' && page ne '3yOC'}"> --%>
			<div class="sectionDiv" id="batchDiv"
				style="width: 97%; margin-left: 8px; margin-top: 9px; float: left;">
				<table style="margin-top: 10px; width: 100%;">
					<tr>
						<td><input type="radio" id="rdoByBatch" name="printOption"
							value="B"
							style="margin-left: 15px; float: left; margin-left: 50px;"
							checked="" /> <label for="rdoByBatch" style="margin-top: 3px;">Batch</label>
						</td>
					</tr>
					<tr>
						<td class="rightAligned" style="width: 5%;">From</td>
						<td class="leftAligned" style="width: 42%;">
							<div
								style="float: left; border: solid 1px gray; width: 108px; height: 20px; margin-right: 3px;">
								<input type="text"
									style="float: left; margin-top: 0px; margin-right: 3px; width: 74%; border: none;"
									name="fmDate" id="txtFromDate" readonly="readonly"
									disabled="disabled" /> <img id="imgFromDate" alt="goPolicyNo"
									style="height: 18px;" class="hover"
									src="${pageContext.request.contextPath}/images/misc/but_calendar.gif" />
							</div>
						</td>
					</tr>
					<tr></tr>
					<tr>
						<td class="rightAligned" style="width: 5%;">To</td>
						<td class="leftAligned" style="width: 42%;">
							<div
								style="border: solid 1px gray; width: 108px; height: 20px; margin-right: 3px;">
								<input type="text"
									style="float: left; margin-top: 0px; margin-right: 3px; width: 74%; border: none;"
									name="toDate" id="txtToDate" readonly="readonly"
									disabled="disabled" /> <img id="imgToDate" alt="goPolicyNo"
									style="height: 18px;" class="hover"
									src="${pageContext.request.contextPath}/images/misc/but_calendar.gif" />
							</div>
						</td>
					</tr>
					<tr>
						<td class="rightAligned" style="width: 25%;">Line</td>
						<c:choose>
							<c:when
								test='${page eq "ClgOnePager" || page eq "12PlanOnePager" || page eq "PsBankOnePager"}'>
								<td class="leftAligned"><select name='selBranchLineCd'
									id='selBranchLineCd'>
										<c:forEach var="lineCd" items="${lineCdArray}">
											<option>${lineCd}</option>
										</c:forEach>
								</select></td>
							</c:when>
							<c:otherwise>
								<td class="leftAligned" colspan="5"><input
									id="batchTxtLineCd" class="leftAligned required" type="text"
									name="capsField" style="width: 8%;" value="${lineCd}"
									title="Line Code" disabled /></td>
							</c:otherwise>
						</c:choose>
					</tr>

					<tr>
						<td class="rightAligned" style="width: 25%;">Subline</td>
						<td class="leftAligned" colspan="5"><input
							id="batchTxtSublineCd" class="leftAligned" type="text"
							name="capsField" style="width: 15%;" value=""
							title="Subline Code" maxlength="7" /></td>
					</tr>
					<tr>
						<td class="rightAligned" style="width: 25%;">Cred. Branch</td>
						<td class="leftAligned" colspan="5"><input id="batchTxtIssCd"
							class="leftAligned" type="text" name="capsField"
							style="width: 8%;" value="" title="Issue Source Code"
							maxlength="2" /></td>
					</tr>
					<!-- <tr>
						<td class="rightAligned" style="width: 25%;">Extract User</td>
						<td class="leftAligned" colspan="5"><input idf="batchTxtUser"
							class="leftAligned" type="text" name="capsField"
							style="width: 10%;" value="" title="Extract User" maxlength="10"/>
						</td>
					</tr> -->
					<tr>
						<td class="rightAligned" style="width: 10%;"></td>
						<td class="rightAligned"><input type="radio"
							id="rdoByIssueDate" name="dateOption" value="I"
							style="margin-left: 15px; float: left; margin-left: 50px;"
							checked="" /> <label for="rdoByIssueDate"
							style="margin-top: 3px;">Issue Date</label></td>
						<td style="width: 50%"><input type="radio"
							id="rdoByPostingDate" name="dateOption" value="P"
							style="margin-left: 15px; float: left; margin-left: 50px;"
							checked="" /> <label for="rdoByPostingDate"
							style="margin-top: 3px;">Posting Date</label></td>
					</tr>
				</table>
				<%-- <div id="infoDiv" name="infoDiv"
					style="width: 100%; text-align: center;">
					<jsp:include page="/pages/policy issuance/one pager/infoDiv.jsp"></jsp:include>
				</div> --%>
			</div>
			<%-- </c:if> --%>
			<div class="sectionDiv" id="issueDiv"
				style="width: 97%; margin-left: 8px; margin-top: 9px; float: left;">
				<table style="margin-top: 10px; width: 100%;">
					<tr>
						<td class="rightAligned" style="width: 25%;"></td>
						<td class="rightAligned"><label for="txtIssuePlace"
							style="margin-top: 3px; margin-left: 15px; float: left; margin-left: 50px;">Issued
								At</label></td>
						<td class="leftAligned"><input id="txtIssuePlace"
							class="leftAligned required" type="text" name="capsField"
							style="width: 50%;" title="Issued Place" maxlength="100"
							placeholder="eg. MAKATI CITY, PHILIPPINES" /></td>
					</tr>
				</table>
			</div>
			<div class="sectionDiv" id="printDiv"
				style="width: 97%; margin-left: 8px; margin-top: 9px; float: left; border-color: white;">
				<div id="printRenewalNoticeButtonsDiv" align="center">
					<input type="button" class="button" style="width: 90px;"
						id="btnCancelOnePager" value="Cancel"> <input
						type="button" class="button" style="width: 90px;"
						id="btnPrintOnePager" value="Print">
				</div>
			</div>
		</div>
	</div>
</div>


<script type="text/javascript">
	var page = $F("page");

	var lineCd = '';

	/* if (page == 'ClgOnePager') {
		lineCd = $F("selLineCd");
		$("selBranchLineCd").disable();
	} else
		lineCd = $F("lineCd"); */
	if (page != 'ClgOnePager'/*   && page != 'PsBankOnePager' && page != '12PlanOnePager' */) {
		lineCd = $F("lineCd");
	} else {
		lineCd = $F("selLineCd");
		$("selBranchLineCd").disable();
	}

	var fromCalendar = new dhtmlXCalendarObject({
		input : "txtFromDate",
		button : "imgFromDate"
	});
	var toCalendar = new dhtmlXCalendarObject({
		input : "txtToDate",
		button : "imgToDate"
	});

	if (page != 'OC' && page != 'otherOC' && page != '3yOC') {
		$("batchDiv").show();
		$("ocReportTypeDiv").hide();
	} else {
		$("batchDiv").hide();
		$("ocReportTypeDiv").show();
		$("rdoDefault").checked = true;
	}

	/*  if(page != 'psFI' && page != 'regFI' && page != 'clgFI' && page != '12pFI'){
		$("issueDiv").hide();
	}else
		$("issueDiv").show();  */

	if (page == 'OC' && page == 'otherOC' && page == '3yOC') {
		$("issueDiv").hide();
	} else
		$("issueDiv").show();

	function togglePrintOption(option) {
		if (lineCd == 'OC') {
			$("txtAssuredName").value = "";
			$("txtItemTitle").value = "";
		}
		if (option == "I") {
			if (page == "regFI") {
				$("txtSublineCd").disable();
			} else
				$("txtSublineCd").enable();
			if (page == "12pMC" || page == "psFI" || page == "12pFI"
					|| page == "clgFI" || page == "12pPA") {
				$("txtIssCd").disable();
			} else
				$("txtIssCd").enable();
			//enable individual fields
			/* if (page == 'ClgOnePager') {
				$("selLineCd").enable();
				$("selBranchLineCd").disable();
			} else{
				$("txtLineCd").addClassName("required");
				$("batchTxtLineCd").removeClassName("required");
			} */

			if (page != 'ClgOnePager' && page != 'PsBankOnePager'
					&& page != '12PlanOnePager') {
				$("txtLineCd").addClassName("required");
				$("batchTxtLineCd").removeClassName("required");
			} else {
				$("selLineCd").enable();
				$("selBranchLineCd").disable();
				if(page == 'ClgOnePager'){
					$("txtSublineCd").disable();
					$("txtSublineCd").value = 'CLG';
				}else
					$("txtSublineCd").enable();
				
				if(page == 'PsBankOnePager' || page == '12PlanOnePager'){
					$("txtIssCd").disable();
					if(page == 'PsBankOnePager'){
						$("txtIssCd").value = 'PS';
					}else
						$("txtIssCd").value = 'TP';
				}else
					$("txtIssCd").enable();
			}

			//$("txtSublineCd").enable();
			//$("txtIssCd").enable();
			$("txtIssueYy").enable();
			$("txtPolSeqNo").enable();
			$("txtRenewNo").enable();
			//disable batch fields

			$("batchTxtSublineCd").disable();
			$("batchTxtIssCd").disable();
			$("txtFromDate").disable();
			$("txtToDate").disable();
			//$("batchTxtUser").disable();
			$("rdoByIssueDate").disable();
			$("rdoByPostingDate").disable();
			$("imgFromDate").hide();
			$("imgToDate").hide();
			$("txtFromDate").setStyle('width : 102px');
			$("txtToDate").setStyle('width : 102px');
			//other props
			$("txtSublineCd").focus();
			$("searchForPolicy").show();
			printOptionVal = "I";
			$("btnPrintOnePager").disable();
			$("batchTxtSublineCd").value = "";
			$("batchTxtIssCd").value = "";
			$("batchTxtSublineCd").value = "";
			$("txtFromDate").value = "";
			$("txtToDate").value = "";
		} else if (option == "B") {
			$("rdoByIssueDate").enable();
			$("rdoByPostingDate").enable();
			//enable batch fields

			$("batchTxtSublineCd").enable();
			$("batchTxtIssCd").enable();
			$("txtFromDate").enable();
			$("txtToDate").enable();
			//$("batchTxtUser").enable();
			$("imgFromDate").show();
			$("imgToDate").show();
			//disable individual fields
			/* if (page == 'ClgOnePager') {
				$("selLineCd").disable();
				$("selBranchLineCd").enable();
			} else{
				$("txtLineCd").removeClassName("required");
				$("batchTxtLineCd").addClassName("required");
			} */

			if (page != 'ClgOnePager' && page != 'PsBankOnePager'
					&& page != '12PlanOnePager') {
				$("txtLineCd").removeClassName("required");
				$("batchTxtLineCd").addClassName("required");
			} else {
				$("selLineCd").disable();
				$("selBranchLineCd").enable();
				if(page == 'ClgOnePager'){
					$("batchTxtSublineCd").disable();
					$("batchTxtSublineCd").value = 'CLG';
				}else
					$("batchTxtSublineCd").enable();
			}

			$("txtSublineCd").disable();
			$("txtIssCd").disable();
			$("txtIssueYy").disable();
			$("txtPolSeqNo").disable();
			$("txtRenewNo").disable();
			$("txtFromDate").setStyle('width : 80px');
			$("txtToDate").setStyle('width : 80px');
			//other props
			$("txtFromDate").focus();
			$("searchForPolicy").hide();
			printOptionVal = "B";
			$("btnPrintOnePager").enable();
			$("txtSublineCd").value = "";
			//$("txtIssCd").value = "";
			$("txtIssueYy").value = "";
			$("txtPolSeqNo").value = "";
			$("txtRenewNo").value = "";
			if (page == "regFI") {
				$("txtSublineCd").value = "REG";
			} else
				$("txtSublineCd").value = "";
			if (page == "12pMC" || page == "12pFI" || page == "12pPA") {
				$("txtIssCd").value = "TP";
			} else if (page == "psFI") {
				$("txtIssCd").value = "PS";
			} else if (page == "clgFI") {
				$("txtIssCd").value = 'FM';
			} else
				$("txtIssCd").value = "";
		}
		if (page == "regFI") {
			$("batchTxtSublineCd").value = "REG";
			$("batchTxtSublineCd").disable();
		}
		/* if(page =="psFI"){
			$("batchTxtIssCd").value = "PS";
			$("batchTxtIssCd").disable();
		} */
		/* if(page =="12pMC"){
			$("batchTxtIssCd").value = "TP";
			$("batchTxtIssCd").disable();
		} */
	}

	$$("input[name='printOption']").each(function(radio) {
		radio.observe("click", function() {
			togglePrintOption(radio.value);
			paramType = radio.value;
		});
	});

	$$("input[name='OCreportType']").each(function(radio) {
		radio.observe("click", function() {
			toogleOCReportOption(radio.value);
			paramType = radio.value;
		});
	});

	var OCReportType = 'DEFAULT';
	function toogleOCReportOption(option) {
		if (option == 'DEFAULT') {
			OCReportType = 'DEFAULT';
		} else if (option == 'OTHER') {
			OCReportType = 'OTHER';
		}
	}

	$$("input[name='dateOption']").each(function(radio) {
		radio.observe("click", function() {
			toogleDateOption(radio.value);
			paramType = radio.value;
		});
	});

	var dateType = 'I';
	function toogleDateOption(option) {
		if (option == 'I') {
			dateType = 'I';
		} else if (option == 'P') {
			dateType = 'P';
		}
	}

	makeAllInputFieldsUpperCase();
	$("rdoByIndividual").checked = true;
	$("rdoByIndividual").click();
	$("rdoByIssueDate").checked = true;
	$("rdoByIssueDate").click();
	$("btnPrintOnePager").disable();
	var printOptionVal = "I";

	$("searchForPolicy")
			.observe(
					"click",
					function() {
						var txtLineCd = '';
						if (page != 'ClgOnePager' && page != 'PsBankOnePager'
								&& page != '12PlanOnePager') {
							txtLineCd = $F("txtLineCd").trim().toUpperCase();
						} else
							txtLineCd = $F('selLineCd').trim().toUpperCase();

						if (isPolicyNoFieldsOk(txtLineCd)) {
							//check user access. 95 = TRAN_CD of policy issuance
							var userInput = "95 " + txtLineCd + " "
									+ $F("txtIssCd").trim().toUpperCase();
							if (!checkUserAccess(userInput, userAccessObj,
									userAccessObjLength)) {
								//alert("User has no access.");
								showMessageBox("User has no access.", "E");
							} else if (!/^\d+$/.test($F("txtIssueYy").trim())) {
								showMessageBox(
										"Invalid Input. Issue Year must be number",
										"E");
							} else if (!/^\d+$/.test($F("txtPolSeqNo").trim())) {
								showMessageBox(
										"Invalid Input. Policy Sequence No must be number",
										"E");
							} else if (!/^\d+$/.test($F("txtRenewNo").trim())) {
								showMessageBox(
										"Invalid Input. Renew No must be number",
										"E");
							} else {
								//var lineCd = $F("txtLineCd").trim().toUpperCase();
								var lineCd = txtLineCd;
								var sublineCd = $F("txtSublineCd").trim()
										.toUpperCase();
								var renewNo = $F("txtRenewNo").trim();
								var ocClg = 'OCCLG0';
								var paClg = 'PACLG0';
								var mcClg = 'MCCLG0';
								var fiClg = 'FICLG0';
								var userInput2 = lineCd + sublineCd + renewNo;
								if (validateInput(lineCd)) {
									new Ajax.Updater(
											'infoDiv',
											contextPath
													+ /*'/OutputController'*/'/OnePagerController',
											{
												evalScripts : true,
												method : "POST",
												parameters : {
													action : "checkPolicyId",
													moduleId : "onePager",
													redirectPage : "/pages/policy issuance/one pager/infoDiv.jsp",
													//lineCd : $F("txtLineCd").trim().toUpperCase(),
													lineCd : lineCd,
													sublineCd : $F(
															"txtSublineCd")
															.trim()
															.toUpperCase(),
													issCd : $F("txtIssCd")
															.trim()
															.toUpperCase(),
													issueYY : $F("txtIssueYy")
															.trim(),
													polSeqNo : $F("txtPolSeqNo")
															.trim(),
													renewNo : $F("txtRenewNo")
															.trim()
												},
												onCreate : showNotice("Fetching Details. Please wait..."),
												onComplete : function(response) {
													hideNotice("");
												}
											});
								} else {
									//alert("Invalid renew number.");
									showMessageBox("Invalid renew number.", "E");
									$("btnPrintOnePager").disable();
								}
							}
						} else {
							//alert("Please input required fields");
							showMessageBox("Please input required fields", "I");
							//$("txtSublineCd").focus();
						}
						$("txtSublineCd").focus();
					});

	 function validateInput(lineCd) {
		//var lineCd = $F("txtLineCd").trim().toUpperCase();
		var sublineCd = $F("txtSublineCd").trim().toUpperCase();
		var renewNo = $F("txtRenewNo").trim();
		var issCd = $F("txtIssCd").trim().toUpperCase();
		var userInput = lineCd + sublineCd + renewNo;
		var isValid = true;
		var mcClg = 'MCCLG0';
		var fiClg = 'FICLG0';

		if (issCd != 'TP') {
			if (lineCd == 'MC' || lineCd == 'FI') {
				if (sublineCd == 'CLG' && renewNo == '0') {
					isValid = true;
				} else if (sublineCd != 'CLG' && renewNo == '0') {
					isValid = false;
				} else
					isValid = true;
			} else if (lineCd != 'MC' || lineCd != 'FI')
				if (sublineCd != 'CLG' && renewNo != '0') {
					isValid = true;
				} else
					isValid = false;
			/* else
				isValid = true; */
		} else if (issCd == 'TP') {
			//if tp renewNo != 0
			//else if mc||fi clg 0
			if ((lineCd == 'MC' || lineCd == 'FI') && renewNo == '0') {
				if (sublineCd == 'CLG') {
					isValid = true;
				} else
					isValid = false;
			} else if (renewNo == '0')
				isValid = false;
			/* else
				isValid = true; */
		} else if (renewNo == '0')
			isValid = false;
		/* else
			isValid = true; */
		if(page == '12PlanOnePager' || page == 'regFI'){
			if(renewNo == '0'){
				isValid = false;
			}
		}

		return isValid;

	}
	
	/*function validateInput(lineCd) {
		//var lineCd = $F("txtLineCd").trim().toUpperCase();
		var sublineCd = $F("txtSublineCd").trim().toUpperCase();
		var renewNo = $F("txtRenewNo").trim();
		var issCd = $F("txtIssCd").trim().toUpperCase();
		var userInput = lineCd + sublineCd + renewNo;
		var isValid = true;
		
		if(page == '12PlanOnePager' || page == 'regFI'){
			if(renewNo == '0'){
				isValid = false;
			}
		}
		return isValid;
	}*/

	function isPolicyNoFieldsOk(lineCd) {
		//var lineCd = $F("txtLineCd");
		var sublineCd = $F("txtSublineCd");
		var issCd = $F("txtIssCd");
		var issueYY = $F("txtIssueYy");
		var polSeqNo = $F("txtPolSeqNo");
		var renewNo = $F("txtRenewNo");
		if (checkBlankNull(lineCd) || checkBlankNull(sublineCd)
				|| checkBlankNull(issCd) || checkBlankNull(issueYY)
				|| checkBlankNull(polSeqNo) || checkBlankNull(renewNo)) {
			return false;
		} else
			return true;
	}

	function isBatchFieldsOk(batchLineCd) {
		//var userId = $F("batchTxtUser");
		var fromDate = $F("txtFromDate");
		var toDate = $F("txtToDate");
		//var batchLineCd = $F("batchTxtLineCd");
		var batchIssCd = $F("batchTxtIssCd");
		if (/* checkBlankNull(userId) ||  */checkBlankNull(fromDate)
				|| checkBlankNull(toDate) || checkBlankNull(batchLineCd)) {
			return false;
		} else
			return true;
	}

	function compareDate(fromDate, toDate) {
		var date1 = new Date(fromDate);
		var date2 = new Date(toDate);
		if (date1.getTime() > date2.getTime()) {
			return true
		} else
			return false;
	}

	var reportLink = "http://localhost:2010/GeniisysAdHocReports/";
	var strWindowFeatures = "directories=no,titlebar=no,toolbar=no,location=no,status=no,menubar=no,resizable=yes,fullscreen=yes";
	var reportName = $F("reportName");
	var reportBatch = $F("reportBatch");
	$("btnPrintOnePager")
			.observe(
					"click",
					function() {
						var issuePlace = $F("txtIssuePlace");
						var lineCd = '';
						var batchLineCd = '';
						if (page != 'ClgOnePager' && page != 'PsBankOnePager'
								&& page != '12PlanOnePager') {
							lineCd = $F("txtLineCd");
							batchLineCd = $F("batchTxtLineCd");
						} else {
							lineCd = $F('selLineCd');
							batchLineCd = $F('selBranchLineCd');
							/*set page */
							if (page == 'ClgOnePager') {
								if (lineCd == 'FI') {
									reportName = 'POLICY_DOCUMENT_REG_CLG_ONEPAGER';
								} else {
									reportName = 'POLICY_DOCUMENT_MTR_ONEPAGER';
								}
								if (batchLineCd == 'FI') {
									reportBatch = 'POLICY_DOCUMENT_REG_CLG_ONEPAGER_BATCH';
								} else {
									reportBatch = 'POLICY_DOCUMENT_MTR_ONEPAGER_BATCH';
								}
							}
							if (page == 'PsBankOnePager') {
								if (lineCd == 'FI') {
									reportName = 'POLICY_DOCUMENT_PS_FI_ONEPAGER';
								} else {
									reportName = 'POLICY_DOCUMENT_PS_FI_ONEPAGER';
								}
								if (batchLineCd == 'FI') {
									reportBatch = 'POLICY_DOCUMENT_PS_FI_ONEPAGER_BATCH';
								} else {
									reportBatch = 'POLICY_DOCUMENT_PS_FI_ONEPAGER_BATCH';
								}
							}
							if (page == '12PlanOnePager') {
								if (lineCd == 'FI') {
									reportName = 'POLICY_DOCUMENT_REG_TP_ONEPAGER';
								} else if (lineCd == 'MC') {
									reportName = 'POLICY_DOCUMENT_12PMTR';
								} else {
									reportName = 'POLICY_DOCUMENT_PA_TP_ONEPAGER';
								}
								if (batchLineCd == 'FI') {
									reportBatch = 'POLICY_DOCUMENT_REG_TP_ONEPAGER_BATCH';
								} else if (lineCd == 'MC') {
									reportBatch = 'POLICY_DOCUMENT_12PMTR_ONEPAGER_BATCH';
								} else {
									reportBatch = 'POLICY_DOCUMENT_PA_TP_ONEPAGER_BATCH';
								}

							}
						}

						if (!checkBlankNull(issuePlace)) {
							if (printOptionVal == "I") {
								if (!isPolicyNoFieldsOk(lineCd)) {
									showMessageBox(
											"Please input required fields", "I");
								} else {
									new Ajax.Updater(
											"mainContents",
											contextPath + "/OnePagerController",
											{
												evalScripts : true,
												method : "POST",
												parameters : {
													action : "printOnePager",
													page : $F("page"),
													policyId : $F("policyId"),
													userId : $F("userId"),
													reportName : reportName,
													OCReportType : OCReportType,
													lineCd : lineCd,//$F("txtLineCd"),
													sublineCd : $F("txtSublineCd"),
													issCd : $F("txtIssCd"),
													issueYY : $F("txtIssueYy"),
													polSeqNo : $F("txtPolSeqNo"),
													renewNo : $F("txtRenewNo"),
													issuePlace : $F("txtIssuePlace")
												},
												onCreate : showNotice("Generating report. Please wait..."),
												onComplete : function(response) {
													printOutputPdf();
												}
											});
								}
							} else if (printOptionVal == "B") {
								if (compareDate($F("txtFromDate"),
										$F("txtToDate"))) {
									showMessageBox(
											"\"From Date\" must be earlier from \"To Date\".",
											"E");
								} else {
									if (!isBatchFieldsOk(batchLineCd)) {
										showMessageBox(
												"Please input required fields",
												"I");
									} else {
										new Ajax.Updater(
												"mainContents",
												contextPath
														+ "/OnePagerController",
												{
													evalScripts : true,
													method : "POST",
													parameters : {
														action : "printBatch",
														page : $F("page"),
														reportName : reportBatch,
														dateType : dateType,
														fromDate : $F("txtFromDate"),
														toDate : $F("txtToDate"),
														lineCd : batchLineCd,//$F("batchTxtLineCd"),
														sublineCd : $F("batchTxtSublineCd"),
														issCd : $F("batchTxtIssCd"),
														issueCd : $F("txtIssCd"),
														//userId : $F("batchTxtUser"),
														issuePlace : $F("txtIssuePlace")
													},
													onCreate : showNotice("Generating report. Please wait..."),
													onComplete : function(
															response) {
														printOutputPdf();
													}
												});
									}
								}
							}
						} else {
							showMessageBox("Please input required fields", "I");
						}
					});

	$("onePagerExit").observe(
			"click",
			function() {
				goToModule(divToUpdate, contextPath + "/pages/main.jsp",
						"Please wait.....", "Home");
			});

	$("btnCancelOnePager").observe(
			"click",
			function() {
				goToModule(divToUpdate, contextPath + "/pages/main.jsp",
						"Please wait.....", "Home");
			});

	function printOutputPdf() {
		var reportUrl = $F("reportUrl");
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
					window.open('pages/report.jsp', '',
							'location=0, toolbar=0, menubar=0, fullscreen=1');
					hideNotice("");
				}
			});
		}
	}

	function checkBlankNull(str) {
		if (str == '' || str == null)
			return true;
		return false;
	}
</script>
