<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <c:forEach var="userAccess" items="${userAccessList}">
${userAccess.tranCd}${userAccess.lineCd}${userAccess.issCd}
</c:forEach> --%>
<%-- <input type="hidden" id="userAccessList" name="userAccessList" value='${userAccessList}'>
<input type="hidden" id="userTranCdList" name="userTranCdList" value='${userTranCdList}'> --%>

<input type="hidden" id="userAccessList" name="userAccessList" value='${userAccessList}'>
<input type="hidden" id="userTranCdList" name="userTranCdList" value='${userTranCdList}'>
<input type="hidden" id="userClaimsLineCdList" name="userClaimsLineCdList" value='${userClaimsLineCdList}'>
<input type="hidden" id="userPolIssuanceLineCdList" name="userPolIssuanceLineCdList" value='${userPolIssuanceLineCdList}'>
<input type="hidden" id="userPolIssuanceIssCdList" name="userPolIssuanceIssCdList" value='${userPolIssuanceIssCdList}'>
<input type="hidden" id="userModuleList" name="userModuleList" value='${userModuleList}'>

<!-- <script type="text/javascript">
//var text = '{ "userAccess" : [{ "lineCd":"MC" , "issCd":"TP" },{ "lineCd":"FI" , "issCd":"TP" },{ "lineCd":"MC" , "issCd":"HO" } ]}';
//var userAccessList = '{"userAccess" : ' + $F(userAccessList) + '}';
var userTranCdList = '{"userTranCd" : ' + $F(userTranCdList) + '}';
//alert(userTranCdList);
var userOk = false;
var tranCdObj = JSON.parse(userTranCdList);
var propNames = Object.keys(tranCdObj);
var tranCdLength = tranCdObj.userTranCd.length;
</script> -->