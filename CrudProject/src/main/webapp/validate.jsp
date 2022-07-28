<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import ="java.sql.*" %>
<%
    try{
        String userName = request.getParameter("username");   
        String password = request.getParameter("password");
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/passw","root", "root");

        PreparedStatement pst = (PreparedStatement) connection.prepareStatement("Select user, pass from login where user=? and pass=?");
        
        pst.setString(1, userName);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();                        
        if(rs.next())
        {
           out.println("Valid login credentials");
           response.sendRedirect("http://localhost:14481/CrudProject/user-list.jsp");
        }
        else
        {
           out.println("Invalid login credentials");
        }
   }
   catch(Exception e){       
       out.println("Something went wrong !! Please try again");       
   }      
%>