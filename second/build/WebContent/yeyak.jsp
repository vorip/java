<%@page import="java.util.Calendar"%>
<%@page import="bean.ResaDAO"%>
<%@page import="bean.ResaDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- <jsp:useBean id="dto" class="bean.ResaDTO"></jsp:useBean>
<jsp:getProperty property="*" name="dto"/> --%>

<% 
	ResaDTO dto = new ResaDTO();
	dto.setName(request.getParameter("name"));
	dto.setAddress(request.getParameter("address"));
	dto.setHospital(request.getParameter("hospital"));
	/*dto.setNum(Integer.parseInt(request.getParameter("num"))); */
	dto.setNum(1);
	dto.setBody(request.getParameter("body"));
	dto.setDoctor(request.getParameter("doctor"));
	Calendar cal = Calendar.getInstance();
	String date = "";
	if((cal.get(Calendar.MONTH)+1)+"".length()==1){
		date = cal.get(Calendar.YEAR) +","+(cal.get(Calendar.MONTH)+1)+","+ request.getParameter("day") + ","+ request.getParameter("hour");
	}else{
		date = cal.get(Calendar.YEAR) +","+(cal.get(Calendar.MONTH)+1)+","+ request.getParameter("day") + ","+ request.getParameter("hour");
	}
	dto.setDate(date);
	dto.setPrice(request.getParameter("price"));
	out.write(dto.toString()); 
	
	ResaDAO dao = new ResaDAO();
	dao.insert(dto);
%>
