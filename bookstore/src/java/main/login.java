/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author robertcinca
 */
public class login extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println(" <!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "    <head>\n"
                    + "        <!-- Meta attributes -->\n"
                    + "        <meta charset=\"utf-8\">\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                    + "        <meta name=\"robots\" content=\"noindex, nofollow\">\n"
                    + "        <meta name=\"title\" content=\"Online Bookstore\">\n"
                    + "        <meta name=\"description\" content=\"An online marketplace for buying books.\">\n"
                    + "                            \n"
                    + "        <title>Welcome to our Online Bookstore!</title>\n"
                    + "                            \n"
                    + "        <!-- CSS Pages -->\n"
                    + "        <link href=\"/bookstore/CSS/theme.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                    + "        <link href=\"/bookstore/CSS/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                    + "        <!-- JS Pages -->\n"
                    + "        <script src=\"/bookstore/JS/basicFunctions.js\" type=\"text/javascript\"></script>\n"
                    + "        <script src=\"/bookstore/JS/login.js\" type=\"text/javascript\"></script>\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <header>\n"
                    + "            <iframe id=\"disclaimer\" name=\"disclaimer\" src=\"/bookstore/iframes/disclaimer.jsp\" width=\"100%\">\n"
                    + "                [Your user agent does not support frames or is currently configured not to display frames.]\n"
                    + "            </iframe>\n"
                    + "        </header>\n"
                    + "        \n"
                    + "        <!-- Navigation -->\n"
                    + "        <div class=\"dropdown\">\n"
                    + "            <button class=\"dropbtn\">MENU</button>\n"
                    + "            <div class=\"dropdown-content\">\n"
                    + "                <ul class=\"nav\">\n"
                    + "                    <li><a href=\"/bookstore/login.do\">Login</a></li>\n"
                    + "                    <li><a href=\"/bookstore/browse.do\">Browse</a></li>\n"
                    + "                    <li><a href=\"/bookstore/viewcart.do\">View Cart</a></li>\n"
                    + "                    <li><a href=\"/bookstore/payment.do\">Pay Now</a></li>\n"
                    + "                </ul>\n"
                    + "            </div>\n"
                    + "        </div>\n"
                    + "        \n"
                    + "        <h1>Welcome to our Online Bookstore!</h1>\n"
                    + "        <p>Please select one of the following options:</p>\n"
                    + "        \n"
                    + "        <button onclick=\"document.getElementById('id01').style.display='block'\" class=\"button\">Login or Sign Up</button>\n"
                    + "        \n"
                    + "        <!-- Login Form -->\n"
                    + "        <div id=\"id01\" class=\"modal\">\n"
                    + "            <form id=\"Form\" name=\"Form\" class=\"modal-content animate\" onsubmit=\"return validateLogin()\" action=\"/bookstore/browse.do\" method=\"post\">\n"
                    + "                <div class=\"imgcontainer\">\n"
                    + "                    <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n"
                    + "                    <img src=\"/bookstore/IMG/welcome.png\" alt=\"welcome\" class=\"avatar\">\n"
                    + "                        </div>\n"
                    + "                \n"
                    + "                <div class=\"container\">\n"
                    + "                    <label><b>Username</b></label>\n"
                    + "                    <input type=\"text\" placeholder=\"Enter Username (Use manager for manager login)\" name=\"uname\" required>\n"
                    + "                        \n"
                    + "                        <label><b>Password</b></label>\n"
                    + "                        <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n"
                    + "                            \n"
                    + "                            <button style=\"width:100%\" type=\"submit\">Login</button>\n"
                    + "                            <input type=\"checkbox\" checked=\"checked\"> Remember me\n"
                    + "                            </div>\n"
                    + "                <div class=\"container\" style=\"background-color:#f1f1f1\">\n"
                    + "                    <button type=\"button\" onclick=\"document.getElementById('id01').style.display='none'\" class=\"cancelbtn\">Cancel</button>\n"
                    + "                    <button type=\"button\" onclick=\"document.getElementById('id01').style.display='none';document.getElementById('id02').style.display='block'\" class=\"signup\">Sign Up</button>\n"
                    + "                </div>\n"
                    + "            </form>\n"
                    + "        </div>\n"
                    + "\n"
                    + "		<!-- SignUp Form -->\n"
                    + "        <div id=\"id02\" class=\"modal\">\n"
                    + "            \n"
                    + "            <form id=\"Form2\" name=\"Form2\" class=\"modal-content animate\" onsubmit=\"return validateSignUp()\" action=\"/bookstore/browse.do\" method=\"post\">\n"
                    + "                <div class=\"imgcontainer\">\n"
                    + "                    <span onclick=\"document.getElementById('id02').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n"
                    + "                    <img src=\"/bookstore/IMG/newuser.png\" alt=\"sign up!\" class=\"avatar\">\n"
                    + "                        </div>\n"
                    + "                \n"
                    + "                <div class=\"container\">\n"
                    + "                    <label><b>Enter a Username:</b></label>\n"
                    + "                    <input type=\"text\" placeholder=\"New Username\" name=\"uname\" required>\n"
                    + "                        \n"
                    + "                        <label><b>Enter a Password:</b></label>\n"
                    + "                        <input type=\"password\" placeholder=\"New Password\" name=\"psw\" required>\n"
                    + "                        <label><b>Re-enter password:</b></label>\n"
                    + "                        <input type=\"password\" placeholder=\"New Password\" name=\"psw2\" required>\n"
                    + "                            \n"
                    + "                            <button style=\"width:100%\" type=\"submit\">Sign Up</button>\n"
                    + "                            <input type=\"checkbox\" checked=\"checked\"> Remember me\n"
                    + "                            </div>\n"
                    + "                <div class=\"container\" style=\"background-color:#f1f1f1\">\n"
                    + "                    <button type=\"button\" onclick=\"document.getElementById('id02').style.display='none'\" class=\"cancelbtn\">Cancel</button>\n"
                    + "                    <button type=\"button\" onclick=\"document.getElementById('id02').style.display='none';document.getElementById('id01').style.display='block'\" class=\"signup\">Login</button>\n"
                    + "                </div>\n"
                    + "            </form>\n"
                    + "        </div>\n"
                    + "\n"
                    + "        <a href=\"/bookstore/browse.do\" class=\"button\">Continue without logging in >>></a>\n"
                    + "        <br>\n"
                    + "        \n"
                    + "        <footer>\n"
                    + "            <iframe id=\"disclaimer\" name=\"disclaimer\" src=\"/bookstore/iframes/disclaimer.jsp\" width=\"100%\">\n"
                    + "                [Your user agent does not support frames or is currently configured not to display frames.]\n"
                    + "            </iframe>\n"
                    + "            <iframe id=\"bookstorefooter\" name=\"bookstorefooter\" src=\"/bookstore/iframes/bookstorefooter.jsp\" width=\"100%\" height=\"400px\">\n"
                    + "                [Your user agent does not support frames or is currently configured not to display frames.]\n"
                    + "            </iframe>\n"
                    + "        </footer>\n"
                    + "    </body>\n"
                    + "</html>\n"
                    + "");
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