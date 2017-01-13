<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  


<div id="blankDiv">
<%-- <input type="text" id="checkRequestUrl" name="checkRequestUrl" value="${url}"> --%>
<a href="${url}" target="_blank" id="openCheckRequest">Link</a> 
<%-- <input type="button" id="btnOpenCheckRequest" name="btnOpenCheckRequest" onclick="location.href='${url}';target='_blank';" value="Go to Google" /> --%>
</div>
<script>
//$("btnOpenCheckRequest").click();
//alert("onblankDiv");
$("openCheckRequest").click();
/* OpenInNewTabWinBrowser();
function OpenInNewTabWinBrowser() {
	  var win = window.open("http://10.20.39.122/intertrade/intertrade_request.php?useraccess=", '_blank');
	  win.focus();
	} */
</script>