<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
    
<div style="width: 78%; z-index: 500; position: relative; top: -64px; font-size: 10px; float: left; margin-left: 200px;">
    <div id="userAccess" style="color: #fff; float: right; margin-right: 5px;"></div><br/>
	<div id="database" style="color: #fff; float: right; margin-right: 5px;"></div><br/>
 	<div id="dateAndTime" style="color: #fff; float: right; margin-right: 5px;"></div><br/>
	<!-- <a href="#" onclick="close_window();return false;">close</a> -->
	<span style="float: right;" id="logoutSpan">
			Welcome ${userName}!
			<span id="logout" name="logout"> Logout</span>
		</span>	
	<%--  <input type="hidden" id="adhocUser" name="adhocUser" value="${adhocUser}"> --%>
 	 <input type="hidden" id="adhocUser" name="adhocUser" value="CPIRALPH">
	<script type="text/javascript">
			var userId = $F(adhocUser);
			getServerDateAndTime();
			getDBName();
			getUserAccess("userAccess",$F(adhocUser));
			
			$("logout").observe("click", function(e){
				showConfirmBox("Confirmation", "Are you sure you want to log out?", "Yes", "No",
						function(){
					new Ajax.Updater('mainContainerDiv', contextPath+'/GIISUserController', {
						  parameters: { action: 'logOut' }
						});
						},
						function(){},
						"1"
				);
		      });
			
			//temp fix for onInit user access wasnt loaded
		 	/* window.onload = function() {
			    if(!window.location.hash) {
			        window.location = window.location + '#loaded';
			        window.location.reload();
			    }
			} */
			/* if (window.location.href.indexOf('reload')==-1) {
			     window.location.replace(window.location.href+'?reload');
			} */
			
			/* function close_window() {
				  if (confirm("Close Window?")) {
				    close();
				  }
				} */
				
	</script>
</div>