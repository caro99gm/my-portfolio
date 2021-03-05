package com.google.sps.data;

import com.google.sps.data.ServerStats;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet("/welcome")
public final class MyServlet extends HttpServlet{
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

    ServerStats serverStats = new ServerStats(english, spanish, german, french);
    String json = convertToJson(serverStats);

    response.setContentType("application/json");
    response.getWriter().println(json);
  }

    private String convertToJson(ServerStats serverStats){
      String json = "{";
      json += "\"english\": ";
      json += "\"" + serverStats.getEnglish() + "\"";
      json += ", ";
      json += "\"spanish\": ";
      json += "\"" + serverStats.getSpanish() + "\"";
      json += ", ";
      json += "\"german\": ";
      json += "\"" + serverStats.getGerman() + "\"";
      json += ", ";
      json += "\"french\": ";
      json += "\"" + serverStats.getFrench() + "\"";
      json += "}";
      return json;
    }

    private String convertToJsonUsingGson(ServerStats serverStats){
        Gson gson = new Gson();
        String json = gson.toJson(serverStats);
        return json;
    }
}
