<%@ taglib prefix="s"  uri="/struts-tags"%>
    <html>
     <head>
    <s:head theme="ajax"  />
     <title>Listing</title>
      <script>
     function show_details() {
     dojo.event.topic.publish("show_detail");
     }
    </script>
   </head>
     <body>
    <s:form id="frm_demo" name="frm_demo"  theme="simple">
    <table >
    <tr>
     <td><s:select list="lstList1" name="lst"
     onchange="javascript:show_details();return false;"  ></s:select>
    </td>
     <td><s:url  action="DetailAction" /> 
    </td>
     </tr>
    </table>
     </s:form>
    </body>
     </html>
