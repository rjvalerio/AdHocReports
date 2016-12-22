<input type="hidden" id="errorMsg3" name="errorMsg3" value="${errorMsg}">
<script>
var errorMsg3 = $F("errorMsg3");
if (!checkBlankNull(errorMsg3)) {
	//alert(errorMsg3)
	showMessageBox(errorMsg3, 'E')
}/*  else
	//alert("table updated.");
	//showMessageBox("Table Updated.", 'I'); */
</script>