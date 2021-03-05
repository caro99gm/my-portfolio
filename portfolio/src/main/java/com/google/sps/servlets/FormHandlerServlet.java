package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String name = request.getParameter("name");
    String email = request.getParameter("e-mail");
    String company = request.getParameter("company");
    boolean fulltime = Boolean.parseBoolean(getParameter(request, "fulltime", "false"));
    boolean intern = Boolean.parseBoolean(getParameter(request, "intern", "false"));
    boolean program = Boolean.parseBoolean(getParameter(request, "program", "false"));

    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: ");
    System.out.println("Name: " + name);
    System.out.println("E-mail: " + email);
    System.out.println("Company: " + company);
    System.out.println("Fulltime: " + fulltime);
    System.out.println("Internship: " + intern);
    System.out.println("Other program: " + program);

    // Write the value to the response so the user can see it.
    response.sendRedirect("https://cgomezmanzano-sps-spring21.uc.r.appspot.com/");
  }
  private String getParameter(HttpServletRequest request, String name, String defaultValue) {
    String value = request.getParameter(name);
    if (value == null) {
      return defaultValue;
    }
  return value;
  }
}