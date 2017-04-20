/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokheili3
 */
public class addbooks extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //Begin Header
            out.println(" <!DOCTYPE html>"
                    + "<html lang='en'>"
                    + "    <head>"
                    // <!-- Meta attributes -->"
                    + "        <meta charset='utf-8'>"
                    + "        <meta name='viewport' content='width=device-width, initial-scale=1'>"
                    + "        <meta name='robots' content='noindex, nofollow'>"
                    + "        <meta name='title' content='Online Bookstore'>"
                    + "        <meta name='description' content='An online marketplace for buying books.'>"
                    // <!-- Page Title -->"
                    + "        <title>Welcome to our Online Bookstore!</title>"
                    // <!-- CSS Pages -->"
                    + "        <link href='/Bookstore/CSS/theme.css' rel='stylesheet' type='text/css'/>"
                    + "        <link href='/Bookstore/CSS/login.css' rel='stylesheet' type='text/css'/>"
                    // <!-- JS Pages -->""
                    + "    </head>"
                    + "    <body>"
                    + "        <header>"
                    + "            <iframe  scrolling='no' id='disclaimer' name='disclaimer' src='/Bookstore/iframes/disclaimer.jsp' width='100%'>"
                    + "                [Your user agent does not support frames or is currently configured not to display frames.]"
                    + "            </iframe>"
                    + "        </header>"
                    // <!-- Navigation -->"
                    + "        <div class='dropdown'>"
                    + "            <button class='dropbtn'>MENU</button>"
                    + "            <div class='dropdown-content'>"
                    + "                <ul class='nav'>");
            if (request.getSession(true) != null) {
                out.println("              <li><a href='/Bookstore/logout.do'>Logout</a></li>\n");
            } else {
                out.println("              <li><a href='/Bookstore/browse.do'>Login</a></li>\n");
            }
            out.println("                  <li><a href='/Bookstore/browse.do'>Browse</a></li>"
                    + "                    <li><a href='/Bookstore/viewcart.do'>View Cart</a></li>"
                    + "                    <li><a href='/Bookstore/viewdetail.do'>Account Details</a></li>"
                    + "                </ul>"
                    + "            </div>"
                    + "        </div>");
            // Begin Page
            out.println("<h1>Page to browse books (Manager)</h1>\n"
                    + "		<a href=\"/Bookstore/browse.do\" class=\"button\">Back to Browse</a>\n"
                    + "\n"
                    + "		<br>\n"
                    + "\n"
                    + "		<fieldset>\n");

            try {
                //addbooks input field
                String title = request.getParameter("title");
                String author = request.getParameter("author");
                int availableQuantity = 0;
                int price = 0;
                int point = 0;
                if (request.getParameter("price") != null && !request.getParameter("price").equalsIgnoreCase("")) {
                    price = Integer.parseInt(request.getParameter("price"));
                }
                if (request.getParameter("point") != null && !request.getParameter("point").equalsIgnoreCase("")) {
                    point = Integer.parseInt(request.getParameter("point"));
                }
                if (request.getParameter("availableQuantity") != null && !request.getParameter("availableQuantity").equalsIgnoreCase("")) {
                    availableQuantity = Integer.parseInt(request.getParameter("availableQuantity")); 
                }

                if (title != null && !title.equalsIgnoreCase("")
                        && author != null && !author.equalsIgnoreCase("")
                        && price != 0 && point != 0 && availableQuantity != 0) {

                    // Register the JDBC driver, open a connection
                    String url = "jdbc:sqlserver://w2ksa.cs.cityu.edu.hk:1433;databaseName=aiad034_db";
                    String dbLoginId = "aiad034";
                    String dbPwd = "aiad034";

                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection con = DriverManager.getConnection(url, dbLoginId, dbPwd);

                    PreparedStatement pstmt = con.prepareStatement("INSERT INTO [book] ([bookname], [author], [price], [loyalty], [stock]) VALUES (?, ?, ?, ?, ?)");
                    pstmt.setString(1, title);
                    pstmt.setString(2, author);
                    pstmt.setInt(3, price);
                    pstmt.setInt(4, point);
                    pstmt.setInt(5, availableQuantity);

                    int rows = pstmt.executeUpdate();

                    if (rows > 0) {
                        out.println("<legend>New record is sucessfully created.</legend>");
                        // display the information of the record just added including UID
                        out.println("<p>Title: " + title + "</p>");
                        out.println("<p>Author: " + author + "</p>");
                        out.println("<p>Price: " + price + "</p>");
                        out.println("<p>Loyalty points: " + point + "</p>");
                        out.println("<p>Available Quantity: " + availableQuantity + "</p>");
                    } else {
                        out.println("<legend>ERROR: New record is failed to create.</legend>");
                    }

                } else {
                    out.println(
                            "			<legend>Add New Books</legend>\n"
                            + "			<h3>Fill in book detail</h3>\n"
                            + "			<form method='POST' class=\"addBooks\">\n"
                            + "				<label for=\"title\">Book Title:</label>\n"
                            + "				<input type=\"text\" name=\"title\" >\n"
                            + "				<label for=\"author\">Author:</label>\n"
                            + "				<input type=\"text\" name=\"author\" >\n"
                            + "				<label for=\"price\">Price:</label>\n"
                            + "				<input type=\"number\" name=\"price\" >\n"
                            + "				<label for=\"point\">Loyalty Points:</label>\n"
                            + "				<input type=\"number\" name=\"point\" >\n"
                            + "				<label for=\"point\">Quantity Available:</label>\n"
                            + "				<input type=\"number\" name=\"availableQuantity\" >\n"
                            + "				<input style=\"float:right;\" type=\"submit\" value=\"Add book\">\n"
                            + "			</form>\n");
                }

                out.println("</fieldset>\n");
                //footer
                out.println("       <br>"
                        + "         <footer>"
                        + "             <iframe  scrolling='no' id='bookstorefooter' name='bookstorefooter' src='/Bookstore/iframes/bookstorefooter.jsp' width='100%' height='100px'>"
                        + "                 [Your user agent does not support frames or is currently configured not to display frames.]"
                        + "             </iframe>"
                        + "             <iframe  scrolling='no' id='disclaimer' name='disclaimer' src='/Bookstore/iframes/disclaimer.jsp' width='100%'>"
                        + "                 [Your user agent does not support frames or is currently configured not to display frames.]"
                        + "             </iframe>"
                        + "         </footer>"
                        + "    </body>"
                        + "</html>");
            } catch (ClassNotFoundException | SQLException | InputMismatchException e) {
                out.println("<div style='color: red'>" + e.toString() + "</div>");
            } finally {
                out.close();
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
