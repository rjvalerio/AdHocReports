<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<input type="hidden" id="errorMsg2" name="errorMsg2" value="${errorMsg}">
<input type="hidden" id="lineCd" name="lineCd" value="${lineCd}">
<input type="hidden" id="policyId" name="policyId" value="${policyId}">
<input type="hidden" id="employee" name="employee" value="${employee}">
<table style="margin-top: 10px; width: 100%;">
	<c:choose>
		<c:when test='${employee != null }'>
			<tr>
				<td class="rightAligned" style="width: 25%;">Last Name</td>
				<td colspan="3" class="leftAligned"><input id="txtlastName"
					name="capsField" class="leftAligned" type="text"
					style="width: 35%;" value='${employee.lastName}' title="Last Name" disabled /> <input
					id="txtFistName" name="capsField" class="leftAligned" type="text"
					style="width: 28%;" value='${employee.firstName}' title="First Name" disabled /> <input
					id="txtMiddleName" name="capsField" class="leftAligned" type="text"
					style="width: 25%;" value='${employee.middleName}' title="Middle Name" disabled /></td>
			</tr>
			<tr>
				<td class="rightAligned" style="width: 25%;">SSS No.</td>
				<td class="leftAligned"><input id="txtSSSNo" name="capsField"
					class="leftAligned" type="text" style="width: 80%;" value='${employee.sssNo }'
					title="SSS No." disabled /></td>
			</tr>
			<tr>
				<td class="rightAligned" style="width: 25%;">TIN</td>
				<td class="leftAligned"><input id="txtTIN" name="capsField"
					class="leftAligned" type="text" style="width: 80%;" value='${employee.tinNo }'
					title="TIN No." disabled /></td>
			</tr>
			<tr>
				<td class="rightAligned" style="width: 25%;">Employee Type</td>
				<td class="leftAligned"><input id="txtEmployeeType"
					name="capsField" class="leftAligned" type="text"
					style="width: 80%;" value='${employee.employeeType }' title="Employee Type" disabled /></td>
			</tr>
			<tr>
				<td class="rightAligned" style="width: 25%;">Employee Class</td>
				<td class="leftAligned"><input id="txtEmployeeClass"
					name="capsField" class="leftAligned" type="text"
					style="width: 80%;" value='${employee.employeeClass }' title="Employee Class" disabled /></td>
			</tr>
			<tr>
				<td class="rightAligned" style="width: 25%;">Position</td>
				<td class="leftAligned"><input id="txtPosition"
					name="capsField" class="leftAligned" type="text"
					style="width: 80%;" value='${employee.position }' title="Position" disabled /></td>
			</tr>
			<tr>
				<td class="rightAligned" style="width: 25%;">Ref. Code</td>
				<td class="leftAligned"><input id="txtRefCode" name="capsField"
					class="leftAligned" type="text" style="width: 80%;" value='${employee.rcCode }'
					title="Reference Code" disabled /></td>
			</tr>
		</c:when>
		<c:otherwise>
			<tr>
				<td class="rightAligned" style="width: 25%;">Last Name</td>
				<td colspan="3" class="leftAligned"><input id="txtlastName"
					name="capsField" class="leftAligned" type="text"
					style="width: 35%;" value="" title="Last Name" disabled /> <input
					id="txtFistName" name="capsField" class="leftAligned" type="text"
					style="width: 28%;" value="" title="First Name" disabled /> <input
					id="txtMiddleName" name="capsField" class="leftAligned" type="text"
					style="width: 25%;" value="" title="Middle Name" disabled /></td>
			</tr>
			<tr>
				<td class="rightAligned" style="width: 25%;">SSS No.</td>
				<td class="leftAligned"><input id="txtSSSNo" name="capsField"
					class="leftAligned" type="text" style="width: 80%;" value=""
					title="SSS No." disabled /></td>
			</tr>
			<tr>
				<td class="rightAligned" style="width: 25%;">TIN</td>
				<td class="leftAligned"><input id="txtTIN" name="capsField"
					class="leftAligned" type="text" style="width: 80%;" value=""
					title="TIN No." disabled /></td>
			</tr>
			<tr>
				<td class="rightAligned" style="width: 25%;">Employee Type</td>
				<td class="leftAligned"><input id="txtEmployeeType"
					name="capsField" class="leftAligned" type="text"
					style="width: 80%;" value="" title="Employee Type" disabled /></td>
			</tr>
			<tr>
				<td class="rightAligned" style="width: 25%;">Employee Class</td>
				<td class="leftAligned"><input id="txtEmployeeClass"
					name="capsField" class="leftAligned" type="text"
					style="width: 80%;" value="" title="Employee Class" disabled /></td>
			</tr>
			<tr>
				<td class="rightAligned" style="width: 25%;">Position</td>
				<td class="leftAligned"><input id="txtPosition"
					name="capsField" class="leftAligned" type="text"
					style="width: 80%;" value="" title="Position" disabled /></td>
			</tr>
			<tr>
				<td class="rightAligned" style="width: 25%;">Ref. Code</td>
				<td class="leftAligned"><input id="txtRefCode" name="capsField"
					class="leftAligned" type="text" style="width: 80%;" value=""
					title="Reference Code" disabled /></td>
			</tr>
		</c:otherwise>
	</c:choose>
</table>
<script>
	var errorMsg2 = $F("errorMsg2");
	var employee = $F("employee");
	if (!checkBlankNull(errorMsg2)) {
		if (errorMsg2 == 'Error: executeQueryForObject returned too many results.') {
			showMessageBox("Error. Search returned more than one results.", "E");
		} else {
			showMessageBox(errorMsg2, "E");
		}
	}
	
	if(checkBlankNull(employee)){
		showMessageBox("Employee ID not found.", "I");
	}

	function checkBlankNull(str) {
		if (str == '' || str == null)
			return true;
		return false;
	}
</script>