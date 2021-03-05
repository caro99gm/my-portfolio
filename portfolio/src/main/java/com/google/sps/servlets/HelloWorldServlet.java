package com.google.sps.servlets;

import com.google.sps.data.Greetings;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet("/hello")
public final class HelloWorldServlet extends HttpServlet{
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> myList = new ArrayList<String>();
    String english = "Welcome to my portfolio";
    myList.add(english);
    String spanish = "Bienvenido a mi portafolio";
    myList.add(spanish);
    String german = "Willkommen in meinem Portfolio";
    myList.add(german);
    String french = "Bienvenue dans mon portfolio";
    myList.add(french);

    Greetings greetings = new Greetings(english, spanish, german, french);
    String json = convertToJson(greetings);

    response.setContentType("application/json");
    response.getWriter().println(json);
  }

    private String convertToJson(Greetings greetings){
       String json = "{";
      json += "\"randomFunction\": ";
      json += "\"" + greetings.getRandom() + "\"";
      json += "}";
      return json;
    }
}

